package cn.hp.controller;

import cn.hp.model.Medicine;
import cn.hp.service.MedicineService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MedicineController {
    @Autowired
    private MedicineService medicineService;

    @RequestMapping("/med_selectAll")

    public Map medicineAll(int page,int limit,String name,String major){
//        个数
        int count=medicineService.getCount();
        List<Medicine> medicines=medicineService.medicineAll(limit, (page-1)*limit,name,major);
        Map map=new HashMap();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",medicines);
        System.out.println("map=="+map.toString());
        return map;

    }


    @RequestMapping("/med_deleteById")
    public  Map   delete(int id) {
        System.out.println(id);
        Map map = new HashMap();
        int i = medicineService.delete(id);
        if (i > 0) {
            map.put("code", 0);
            map.put("msg", "删除成功");

        } else {
            map.put("code", 500);
            map.put("msg", "删除失败");

        }
        return map;
    }



    @RequestMapping("/med_update")
    public Map medicine_update(String str) {
        System.out.println(str);
        Medicine C= JSONObject.parseObject(str, Medicine.class);
        int i = medicineService.medicineUpdate(C);
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
        @RequestMapping("/med_add")
    public  Map add(Medicine medicine){
        Map map = new HashMap();
        int i =  medicineService.add(medicine);
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
}
