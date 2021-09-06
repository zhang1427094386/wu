package cn.hp.service;

import cn.hp.dao.Patients_DetailsDao;
import cn.hp.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Patients_DetailsService {
    @Autowired
    private Patients_DetailsDao patients_detailsDao;


    //得到多少条订单数据
    public int getCount(){
        return patients_detailsDao.getCount();
    }

    /**
     * 待处理患者
     * @param name
     * @param disease
     * @param pageSize
     * @param pageCode
     * @return
     */
    public List<Patients> findAll(String name, String disease, int pageSize, int pageCode){
        return patients_detailsDao.findAll(name,disease,pageSize,pageCode);
    }

}
