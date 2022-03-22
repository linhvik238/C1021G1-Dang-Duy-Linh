package com.example.model.person;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idCustomerType;
    private String nameCustomerType;

    @OneToMany (mappedBy = "customerType", cascade = CascadeType.ALL)
    private Set<Customer> customerSet;

    public CustomerType() {
    }

    public CustomerType(Long idCustomerType, String nameCustomerType, Set<Customer> customerSet) {
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
        this.customerSet = customerSet;
    }

    public Long getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(Long idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }
}
