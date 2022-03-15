package fr.ensup.demospringboot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "employe")
public class Employe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(columnDefinition = "serial")
    private int id;
    private String login;
    private String password;
    private String prenom;
    private String nom;
    private String email;
    private String role;
    
    @Override
    public String toString() {
        return "Employe :  {id=" + this.id + 
        ", login="  + this.login + 
        ", nom=" +this.nom +
        ", prenom="+ this.prenom +
        ", email=" + this.email +
        ", role=" + this.role + 
        "}";
    }
}
