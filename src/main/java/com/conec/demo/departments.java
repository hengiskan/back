package com.conec.demo;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "departments")
public class departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String created_by;
    private LocalDateTime created_date;
    private String modified_by;
    private LocalDateTime modified_date;
    private Boolean status;
    private String description;
    private String name;
    private String phone;
    
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
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }

}
