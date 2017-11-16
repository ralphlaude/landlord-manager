package com.landlord.model;

/**
 * This represents an address. As such it is value object and does not need an identity.
 */
public final class Address {

    private final String street;
    private final String houseNumber;
    private final String country;
    private final String city;

    Address(String street, String houseNumber, String country, String city) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.country = country;
        this.city = city;
    }
}
