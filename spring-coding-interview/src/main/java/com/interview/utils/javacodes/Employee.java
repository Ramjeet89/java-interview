package com.interview.utils.javacodes;

import java.util.Date;

public final class Employee {
    private final String firstName;
    private final String lastName;
    private final Date dateOfBirth;
    private final Address address;

    public Employee(String firstName, String lastName, Date dateOfBirth, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date(dateOfBirth.getTime());
        this.address = new Address(address.getCity(), address.getPin());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirth.getTime());
    }

    public Address getAddress() {
        return new Address(address.getPin(), address.getCity());
    }
}
