package cn.hp.dao;

import cn.hp.model.Medicine;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineDao {

    //分页查询
    public int getCount();

    public List<Medicine> medicineAll(@Param("pageSize") int pageSize, @Param("pageCode") int pageCode, @Param("name") String name, @Param("major") String major);


    public  int add(Medicine medicine);

    public  int delete(int id);

    public int medicineUpdate(Medicine str);
}
