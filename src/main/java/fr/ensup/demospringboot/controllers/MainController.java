package fr.ensup.demospringboot.controllers;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import fr.ensup.demospringboot.domain.Employe;
import fr.ensup.demospringboot.service.EmployeService;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    EmployeService employeService;

    @GetMapping("/")
    public String home() {
        return "Bienvenue sur l'application spring demo de Thomas Lacomblez !";
    } 
    

    @GetMapping("/employes")
    public String employes(Model model) {

        List<Employe> listEmploye = employeService.getEmployes();

        if (listEmploye != null) {
            model.addAttribute("employes", listEmploye); 
        }
        return "listEmploye";
    }

    @GetMapping("/employe/{id}")
    public String employeById(@PathVariable("id") String id) {
        try {
            Employe employe1 = employeService.getEmployeById( Integer.parseInt(id) );
            return employe1.toString();
        }
        catch(EntityNotFoundException enfe) {
            return "Aucune employé n'existe avec l'id : " + id;
       }
    }

}
