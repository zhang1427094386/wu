package cn.hp.service;

import cn.hp.dao.YPatients_DetailsDao;
import cn.hp.model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YPatients_DetailsDaoService {

    @Autowired
    private YPatients_DetailsDao yPatients_detailsDao;

    //得到多少条订单数据
    public int getCount(){
        return yPatients_detailsDao.getCount();
    }

    /**
     * 已处理患者
     * @param name
     * @param disease
     * @param pageSize
     * @param pageCode
     * @return
     */
    public List<Patients> findYAll(String name, String disease, int pageSize, int pageCode){
        return yPatients_detailsDao.findYAll(name,disease,pageSize,pageCode);
    }
}
