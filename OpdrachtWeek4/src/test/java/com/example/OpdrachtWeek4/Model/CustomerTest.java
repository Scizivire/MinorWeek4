package com.example.OpdrachtWeek4.Model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testCustomer(){
        Customer customer = new Customer();
        customer.setCreationDate(Date.valueOf(LocalDate.now()));
        Customer s = customerRepository.save(customer);

        Long ID = s.getId();
        Optional<Customer> r = customerRepository.findById(ID);

        assertThat(r.isPresent(), is(true));
    }
}
