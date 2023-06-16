package com.conec.demo;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String created_by;
    private LocalDateTime created_date;
    private String modified_by;
    private LocalDateTime modified_date;
    private Boolean status;
    private int age;
    private String email;
    private String name;
    private String position;
    private String surname;
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id=id;
    }
    public String getCreated_by(){
        return created_by;
    }
    public void setCreated_by(String created_by){
        this.created_by=created_by;
    }
    public LocalDateTime getCreated_date(){
        return created_date;
    }
    public void setCreated_date(LocalDateTime created_date){
        this.created_date=created_date;
    }
    public String getModified_by(){
        return modified_by;
    }
    public void setModified_by(String modified_by){
        this.modified_by=modified_by;
    }
    public LocalDateTime getModified_date(){
        return modified_date;
    }
    public void setModified_date(LocalDateTime modified_date){
        this.modified_date=modified_date;
    }
    public Boolean getStatus(){
        return status;
    }
    public void setStatus(Boolean status){
        this.status=status;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
      public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
}
