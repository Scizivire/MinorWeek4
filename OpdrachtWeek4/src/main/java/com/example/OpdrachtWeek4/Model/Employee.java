package com.example.OpdrachtWeek4.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Employee")
@DiscriminatorValue("E")
public class Employee extends Person {
    @Column(name = "Function")
    private String function;

    @OneToMany(mappedBy = "manager")
    private List<Account> accounts;

}
