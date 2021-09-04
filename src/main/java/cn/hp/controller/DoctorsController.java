package cn.hp.controller;

import cn.hp.model.Doctors;
import cn.hp.service.DoctorsService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DoctorsController {
    @Resource
    private DoctorsService doctorsService;
    @RequestMapping(value = "DoctorsAll")
    public Map DoctorsList(String name,int page,int limit){
        int count=doctorsService.getCount();
        List<Doctors> DoctorsAll=doctorsService.DoctorsAll(name,limit,(page-1)*limit);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",DoctorsAll);
        return map;
    }

    @RequestMapping(value = "DoctorsDeleteById")
    public Map DoctorsDeleteById(int id){
//        System.out.println(id);
        int i= doctorsService.DoctorsDeleteById(id);
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
    @RequestMapping(value = "DoctorsUpdate")
    public Map DoctorsUpdate(String str) {
        Doctors C= JSONObject.parseObject(str,Doctors.class);
        int i = doctorsService.DoctorsUpdate(C);
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



}
