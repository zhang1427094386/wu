package cn.hp.service;

import cn.hp.dao.MedicineDao;
import cn.hp.model.Medicine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicineService {
    @Autowired
    private MedicineDao medicineDao;

    public int getCount() {
        return medicineDao.getCount();
    }

    public List<Medicine> medicineAll(int pageSize, int pageCode, String name, String major){
        return  medicineDao.medicineAll(pageSize, pageCode, name, major)
;    }
    public  int add(Medicine medicine){
        return medicineDao.add(medicine);
    }

    public  int delete(int id){
        return  medicineDao.delete(id);
    }

    public int medicineUpdate(Medicine str){
        return medicineDao.medicineUpdate(str);
    }
}
