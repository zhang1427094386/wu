package cn.hp.service;


import cn.hp.dao.DoctorsDao;
import cn.hp.model.Doctors;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class DoctorsService {
    @Resource
    private DoctorsDao doctorsDao;

    public int getCount(){
        return doctorsDao.getCount();
    }

    public List<Doctors> DoctorsAll(String name, int pageSize, int pageCode){
        return doctorsDao.DoctorsAll(name,pageSize,pageCode);
    }

    public int DoctorsDeleteById(int id){
        return doctorsDao.DoctorsDeleteById(id);
    }

    public int DoctorsUpdate(Doctors str){
        return doctorsDao.DoctorsUpdate(str);
    }

    public  int add(Doctors doctors){
        return doctorsDao.add(doctors);
    }

    /**
     * 医生登陆
     * @param account
     * @param password
     * @return
     */
    public Doctors doctorsLogin(String account, String password){
        return doctorsDao.doctorsLogin(account,password);
    }
}
