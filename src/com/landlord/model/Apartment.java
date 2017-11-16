package com.landlord.model;

import java.util.Objects;

/**
 * This class represents an apartment which is not part of a building.
 */
public final class Apartment {

    /** the id of the apartment */
    private final ApartmentId id;
    /** the id of the owner landlord */
    private final Landlord.LandlordId landlordId;
    private final Address address;

    private RentalContract contract;

    public Apartment(ApartmentId id, Landlord.LandlordId landlordId, Address address) {
        this.id = id;
        this.landlordId = landlordId;
        this.address = address;
    }


    public final static class ApartmentId implements Identity {

        private String id;

        public ApartmentId(String id) {
            this.id = id;
        }

        @Override
        public String id() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ApartmentId that = (ApartmentId) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

}
