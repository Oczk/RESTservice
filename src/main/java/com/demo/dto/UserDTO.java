package com.demo.dto;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;
    private String hashedPassword;

    public UserDTO(){}

    public UserDTO(String name, String password){
        this.name = name;
        this.hashedPassword = password;
    }

    public String getName(){
        return name;
    }

    public String getHashedPassword(){
        return hashedPassword;
    }

    public long getId() {
        return id;
    }
}
