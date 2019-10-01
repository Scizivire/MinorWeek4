package com.example.OpdrachtWeek4.Model;

import javax.persistence.*;

@Entity
@Table(name="Person")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person extends Common{

    @Id
    @GeneratedValue
    @Column(name="ID")
    private Long id;

    @Column(name= "USERNAME")
    private String username;

    @Column(name= "PASSWORD")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
