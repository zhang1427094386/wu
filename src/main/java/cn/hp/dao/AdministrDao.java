package cn.hp.dao;

import cn.hp.model.Administr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministrDao {

    //分页查询
    public int getCount();

    public List<Administr> administrAll(@Param("pageSize") int pageSize, @Param("pageCode") int pageCode);

    public  int add(Administr administr);

    public  int delete(int id);

    public int administrUpdate(Administr str);
}
