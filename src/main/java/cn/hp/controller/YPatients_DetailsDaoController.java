package cn.hp.controller;

import cn.hp.model.Patients;
import cn.hp.service.YPatients_DetailsDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class YPatients_DetailsDaoController {

    @Autowired
    private YPatients_DetailsDaoService yPatients_detailsDaoService;

    @RequestMapping("/findYAll")
    public Map findYAll(int page, int limit, String name, String disease){
        int count = yPatients_detailsDaoService.getCount();
        List<Patients> plist = yPatients_detailsDaoService.findYAll(name,disease,limit, (page - 1) * limit);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",plist);
        System.out.println("map==="+map.toString());
        return map;
    }
}
