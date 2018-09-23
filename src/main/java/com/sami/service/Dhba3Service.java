package com.sami.service;

import com.sami.dao.Dhba3Dao;
import com.sami.models.Dhba3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("dhba3Service")
@Transactional
public class Dhba3Service {

    @Autowired
    Dhba3Dao dhba3Dao;

    public List<Dhba3> getDhba3() {

        List<Dhba3> dhba3List = dhba3Dao.getAll();


        return dhba3List;
    }

    public void createDhba3(Dhba3 dhba3) {
        dhba3Dao.persist(dhba3);
    }
}
