package cn.hp.service;

import cn.hp.dao.PatientsDao;
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

    public  int add(Patients patients){
        return patientsDao.add(patients);
    }

    //患者登录
    public Patients selectAcountAndPassword (String account, String password){
        return patientsDao.selectAcountAndPassword(account,password);
    }


    //分页查询
    public List<Patients> patientsAll(int pageSize, int pageCode){
        return patientsDao.patientsAll(pageSize,pageCode);
    }

    //短信登录 查找有无手机号
    public Patients findByPhone(String phone){
        Patients patients=patientsDao.findByPhone(phone);
        if (patients!=null){

        }else {
            patientsDao.pat_add(new Patients(phone));
        }
        return patients;
    }



}
