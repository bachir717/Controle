package fr.ensup.demospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ensup.demospringboot.dao.EmployeDao;
import fr.ensup.demospringboot.domain.Employe;

@Service
public class EmployeService {

    @Autowired
    EmployeDao employeDao;


    public Employe getEmployeById(int id) {
       return employeDao.getById(id);
    }

    public List<Employe> getEmployes() {
        return employeDao.findAll();
    }
}
