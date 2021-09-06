package cn.hp.util.redis;

import redis.clients.jedis.Jedis;

public class JedisUtil {
	
	final static String url = "localhost";
	final static int port = 6379 ;
	//存入数据
	public  static boolean  putKey(String key,String value) {
		Jedis jedis = null;
		try {
			jedis = conn(url , port);
			jedis.setex(key, 60, value);
			return true;
		}catch (Exception e) {
			return false;
		}finally {
			if(jedis !=null) {
				closed(jedis);
			}
		}
	}
	
		//获取数据
		public static  String  gettKey(String key) {
			Jedis jedis = null;
			String value = "";
			try {	
				jedis = conn(url , port);
				value = jedis.get(key);
				jedis.del(key);
				return value;
			}catch (Exception e) {
				return value;
			}finally {
				if(jedis !=null) {
					closed(jedis);
				}
			}
		}
	
	
	public static  Jedis conn(final String url,final Integer port) {
		Jedis jedis = new Jedis(url , port);
			jedis.auth("root");
		return jedis;
	}
	
	public static  void closed(Jedis jedis) {
		jedis.close();
	}

	public static void main(String[] args) {
		Jedis jedis = JedisUtil.conn(url, port);

		System.out.println("jedis = " + jedis);
		JedisUtil.closed(jedis);
	}
}
