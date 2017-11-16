package com.landlord.model;

import java.util.Objects;

/**
 * This class represents an apartment in a building.
 */
public final class BuildingApartment {

    /** the id of the apartment in the building */
    private final BuildingApartmentId id;
    /** the id of the building in which the apartment is */
    private final Building.BuildingId buildingId;
    /** the id of the owner landlord */
    private final Landlord.LandlordId landlordId;
    private final Address address;

    private RentalContract contract;

    public BuildingApartment(BuildingApartmentId id, Building.BuildingId buildingId, Landlord.LandlordId landlordId, Address address) {
        this.id = id;
        this.buildingId = buildingId;
        this.landlordId = landlordId;
        this.address = address;
    }


    public final static class BuildingApartmentId implements Identity {

        private String id;

        public BuildingApartmentId(String id) {
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
            BuildingApartmentId that = (BuildingApartmentId) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

}
