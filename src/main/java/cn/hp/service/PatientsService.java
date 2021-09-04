package cn.hp.service;

import cn.hp.dao.PatientsDao;
import cn.hp.model.Doctors;
import cn.hp.model.Patients;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class PatientsService {
    @Resource
    private PatientsDao patientsDao;

    public int getCount(){
        return patientsDao.getCount();
    }

    public List<Patients> PatientsAll(String name, int pageSize, int pageCode){
        return patientsDao.PatientsAll(name,pageSize,pageCode);
    }

    public int PatientsDeleteById(int id){
        return patientsDao.PatientsDeleteById(id);
    }

    public int PatientsUpdate(Patients str){
        return patientsDao.PatientsUpdate(str);
    }
}
