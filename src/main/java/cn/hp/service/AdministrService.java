package cn.hp.service;


import cn.hp.dao.AdministrDao;
import cn.hp.model.Administr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdministrService {

    @Autowired
    private AdministrDao administrDao;

    public int getCount(){
        return administrDao.getCount();
    }

    public List<Administr> administrAll(int pageSize, int pageCode){
        return administrDao.administrAll(pageSize, pageCode);
    }

    public  int add(Administr administr){
        return  administrDao.add(administr);
    }

    public  int delete(int id){
        return  administrDao.delete(id);
    }

    public int administrUpdate(Administr str){
        return administrDao.administrUpdate(str);
    }

}
