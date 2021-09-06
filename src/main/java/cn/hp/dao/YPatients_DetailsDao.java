package cn.hp.dao;

import cn.hp.model.Patients;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface YPatients_DetailsDao {
    /**
     *   分页
     * @return
     */
    public int getCount();

    /**
     * 已处理患者
     * @param name
     * @param disease
     * @param pageSize
     * @param pageCode
     * @return
     */
    public List<Patients> findYAll(@Param("name") String name, @Param("disease") String disease,
                                   @Param("pageSize") int pageSize, @Param("pageCode") int pageCode);
}
