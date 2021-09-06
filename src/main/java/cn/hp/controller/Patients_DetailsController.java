package cn.hp.controller;

import cn.hp.model.Patients;
import cn.hp.service.Patients_DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Patients_DetailsController {

    @Autowired
    private Patients_DetailsService patients_detailsService;

    @RequestMapping("/findAllnop")
    public Map findAll(int page, int limit, String name, String disease){
        int count = patients_detailsService.getCount();
        List<Patients> plist = patients_detailsService.findAll(name,disease,limit, (page - 1) * limit);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",plist);
        System.out.println("map==="+map.toString());
        return map;
    }

}
