package com.example.OpdrachtWeek4.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Customer")
@DiscriminatorValue("C")
public class Customer extends Person {
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "CustomerNumber")
    private Long customerNumber;

    @Column(name = "Gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "holder", fetch = FetchType.EAGER)
    private List<Account> accounts;
}
