package cn.hp.dao;

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

    /**
     * 添加
     * @param patients
     * @return
     */
    public  int add(Patients patients);


//    患者登录
    public Patients selectAcountAndPassword(@Param("account") String account, @Param("password") String password);


    //分页查询
    public List<Patients>patientsAll(@Param("pageSize") int pageSize, @Param("pageCode") int pageCode);


    /** 短信登录
     * 查询有无手机号
     *
     * @param phone
     * @return
     */
    public Patients findByPhone(String phone);

    /**
     * 添加对象   实际上只是手机号
     *
     * @param p
     * @return
     */
    public int pat_add(Patients p);

}
