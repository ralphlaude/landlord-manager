package com.landlord.model;

import java.util.Objects;
import java.util.Set;

public final class Landlord {

    /** the id of the landlord */
    private final LandlordId id;
    private final Address address;
    /** the ids of all building own by this landlord */
    private final Set<Building.BuildingId> buildingIds;
    /** the ids of all apartments own by this landlord */
    private final Set<Apartment.ApartmentId> apartmentIds;

    public Landlord(LandlordId id, Address address, Set<Building.BuildingId> buildingIds, Set<Apartment.ApartmentId> apartmentIds) {
        this.id = id;
        this.address = address;
        this.buildingIds = buildingIds;
        this.apartmentIds = apartmentIds;
    }


    public final static class LandlordId implements Identity {

        private String id;

        public LandlordId(String id) {
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
            LandlordId that = (LandlordId) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
