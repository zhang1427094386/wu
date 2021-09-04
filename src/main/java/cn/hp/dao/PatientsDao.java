package cn.hp.dao;

import cn.hp.model.Doctors;
import cn.hp.model.Patients;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientsDao {

    /**
     * 求个数
     * @return
     */
    public int getCount();

    /**
     * 全查询功能
     * 查询所有（分页）
     * @param pageSize 每页显示的条数
     * @param pageCode 页数
     * @return 每页显示的数据 集合
     */
    public List<Patients> PatientsAll(@Param("name") String name, @Param("pageSize") int pageSize, @Param("pageCode") int pageCode);

    /**
     *  删除 功能
     * @param id 根据 医生id
     * @return 医生数据
     */
    public  int PatientsDeleteById(int id);

    /**
     * 修改
     * @param str
     * @return
     */
    public int PatientsUpdate(Patients str);

}
