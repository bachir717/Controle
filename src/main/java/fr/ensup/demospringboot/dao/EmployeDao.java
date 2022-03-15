package fr.ensup.demospringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ensup.demospringboot.domain.Employe;

public interface EmployeDao extends JpaRepository<Employe, Integer> {

    public List<Employe> findByEmail(String email);
    
}
