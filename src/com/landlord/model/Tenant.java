package com.landlord.model;

import java.util.Objects;

/**
 * This class represents a renter for an apartment.
 */
public final class Tenant {

    private final TenantId id;
    private final String firstname;
    private final String lastname;
    private final Address address;

    public Tenant(TenantId id, String firstname, String lastname, Address address) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }


    public final static class TenantId implements Identity {

        private String id;

        public TenantId(String id) {
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
            TenantId tenantId = (TenantId) o;
            return Objects.equals(id, tenantId.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

}
