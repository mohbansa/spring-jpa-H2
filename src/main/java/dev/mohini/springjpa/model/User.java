package dev.mohini.springjpa.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class User {

    private int Id;
    private String name;
    private String email;
    private Date dob;

    @Id
    @GeneratedValue
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
