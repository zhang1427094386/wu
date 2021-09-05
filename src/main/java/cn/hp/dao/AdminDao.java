package cn.hp.dao;

import cn.hp.model.Admin;
import org.apache.ibatis.annotations.Param;

//管理员
public interface AdminDao {


    public Admin selectAcountAndPassword(@Param("account") String account, @Param("password")String password);



}
