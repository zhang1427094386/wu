package cn.hp.controller;


import cn.hp.model.Administr;
import cn.hp.service.AdministrService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AdministrController {
    @Autowired
    private AdministrService administrService;

    @RequestMapping("/adm_selectAll")

    public Map selectAll(int page, int limit){
//        个数
        int count=administrService.getCount();
        List<Administr> administrs=administrService.administrAll(limit, (page-1)*limit);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",administrs);
        System.out.println("map=="+map.toString());
        return map;

    }

    @RequestMapping("/adm_add")
    public  Map add(Administr administr){
        Map map = new HashMap();
        int i =  administrService.add(administr);
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
    @RequestMapping("/adm_deleteById")
    public  Map   delete(int id) {
        System.out.println(id);
        Map map = new HashMap();
        int i = administrService.delete(id);
        if (i > 0) {
            map.put("code", 0);
            map.put("msg", "删除成功");

        } else {
            map.put("code", 500);
            map.put("msg", "删除失败");

        }
        return map;
    }



    @RequestMapping("/adm_Update")
    public Map cus_update(String str) {
        System.out.println(str);
        Administr C= JSONObject.parseObject(str, Administr.class);
        int i = administrService.administrUpdate(C);
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
        System.out.println("i=="+i);
        return map;
    }


}
