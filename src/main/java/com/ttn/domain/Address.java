package com.ttn.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ttnd on 17/08/17.
 */

@Entity
public class Address {

    @Id
    Integer id;
    String street;
    Integer pin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }
}
