package com.aninfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double sum;

    private Long cbu;

    String type;

    public Transaction() {
    }

    public Transaction(Double sum, Long cbu, String type) {
        this.sum = sum;
        this.cbu = cbu;
        this.type = type;
    }

    public Long getId()
    {
        return this.id;
    }

    public Double getSum()
    {
        return this.sum;
    }

    public Long getCbu()
    {
        return this.cbu;
    }

    public String getType()
    {
        return this.type;
    }
}
