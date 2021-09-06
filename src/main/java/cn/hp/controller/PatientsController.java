package cn.hp.controller;

import cn.hp.model.Patients;
import cn.hp.service.PatientsService;
import cn.hp.util.alyunsm.SMSUtils;
import cn.hp.util.alyunsm.ValidateCodeUtils;
import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.exceptions.ClientException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientsController {

    @Resource
    private PatientsService patientsService;
    @RequestMapping(value = "pai_selectAll")
    public Map PatientsList(String name, int page, int limit){
        int count=patientsService.getCount();
        List<Patients> PatientsAll=patientsService.PatientsAll(name,limit,(page-1)*limit);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",PatientsAll);
        return map;
    }

    @RequestMapping(value = "pai_deleteById")
    public Map PatientsDeleteById(int id){
//        System.out.println(id);
        int i= patientsService.PatientsDeleteById(id);
        Map map=new HashMap();
        if (i>0){
            map.put("code",0);
            map.put("msg","删除成功");
        }else {
            map.put("code",500);
            map.put("msg","删除失败");
        }
        System.out.println("map"+map.toString());
        return map;
    }

    //json 类型 map
    @RequestMapping(value = "pai_update")
    public Map PatientsUpdate(String str) {
        Patients C= JSONObject.parseObject(str, Patients.class);
        int i = patientsService.PatientsUpdate(C);
        Map map = new HashMap();
        if (i > 0) {
            map.put("msg", "修改成功");
            map.put("code", 0);
            map.put("data", i);
        } else {
            map.put("msg", "修改失败");
            map.put("code", 500);
            map.put("data", i);
        }
        return map;
    }

    @RequestMapping("/pat_add")
    public  Map add(Patients patients){
        Map map = new HashMap();
        int i =  patientsService.add(patients);
        if(i>0){
            map.put("code",200);
            map.put("msg","添加成功");

        }else {
            map.put("code", 500);
            map.put("msg", "添加失败,检查网络再来一次");

        }
        System.out.println(i);
        return map;
    }

    //登录
    @RequestMapping("/PatientsLogin")
    @ResponseBody
    public Map selectAcountAndPassword (String account, String password){
        Map map = new HashMap();
        Patients patients = patientsService.selectAcountAndPassword(account, password);
        if (patients !=null){
            map.put("code",0);
            map.put("msg","登录成功");
        }else {
            map.put("code", 500);
            map.put("msg", "登陆失败");
        }
        return map;
    }

    //短信登录
    @RequestMapping("/sendSms")
    @ResponseBody
    public Map sendSms(String phone){
        Map map=new HashMap();
//        1、产生验证码
        Integer code= ValidateCodeUtils.generateValidateCode(4);
        //2 发送短信
        try {
            SMSUtils.sendShortMessage(phone, code.toString());
            //3 存在缓存
            Jedis jedis = new Jedis("127.0.0.1", 6379);
            jedis.setex(phone, 9999999, code.toString());
            //4 发送数据到前端页面
            map.put(phone, code.toString());
            map.put("code", 0);
            map.put("msg", "验证码已发送！！");
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return map;
    }

    @RequestMapping("/login")
    public String login(String phone, String code, HttpSession session) {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        String value = jedis.get(phone);
        if (value.equals(code)) {
            new Thread() {
                @Override
                public void run() {
                    patientsService.findByPhone(phone);
                }
            }.start();
        } else {
            return "error";
        }
        session.setAttribute("phone", phone);
        return "../../../index";
    }





    //查询个数
    @RequestMapping("/selectList")
    public Map selectAll(int page,int limit){
        int count = patientsService.getCount();
        List<Patients> patients = patientsService.patientsAll(limit, (page - 1) * limit);
        Map map = new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",patients);
//        System.out.println("map=="+map.toString());
        return map;

    }



}
