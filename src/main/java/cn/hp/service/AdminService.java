package cn.hp.service;

import cn.hp.dao.AdminDao;
import cn.hp.model.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminDao adminDao;

    public Admin selectAcountAndPassword(String account, String password){
        return  adminDao.selectAcountAndPassword(account, password);

    }



}
