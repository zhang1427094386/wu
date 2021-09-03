package cn.hp.controller;

import cn.hp.model.Admin;
import cn.hp.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;


    @RequestMapping("/adminLogin")
    @ResponseBody
    public Map selectAcountAndPassword(String account, String password) {
        Map map = new HashMap();
        Admin admin = adminService.selectAcountAndPassword(account, password);

        if ( admin !=null) {
            map.put("code", 0);
            map.put("msg", "登陆成功");
        } else {
            map.put("code", 500);
            map.put("msg", "登陆失败");
        }
//        System.out.println(map.toString());
        return map;

    }
}




