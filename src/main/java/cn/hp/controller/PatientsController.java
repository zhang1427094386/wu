package cn.hp.controller;

import cn.hp.model.Doctors;
import cn.hp.model.Patients;
import cn.hp.service.PatientsService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PatientsController {

    @Resource
    private PatientsService patientsService;
    @RequestMapping(value = "PatientsAll")
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

    @RequestMapping(value = "PatientsDeleteById")
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
    @RequestMapping(value = "PatientsUpdate")
    public Map PatientsUpdate(String str) {
        Patients C= JSONObject.parseObject(str,Patients.class);
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
}
