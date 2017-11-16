package com.landlord.model;

import java.util.Objects;
import java.util.Set;

/**
 * This class represents a building with apartments.
 */
public final class Building {

    /** the id of the apartment */
    private final BuildingId id;
    /** the id of the landlord */
    private final Landlord.LandlordId landlordId;
    /** the ids of all apartments in this building */
    private final Set<BuildingApartment.BuildingApartmentId> buildingApartmentIds;
    private final Address address;

    /** when all the building is rented by only one tenant */
    private RentalContract contract;

    public Building(BuildingId id, Landlord.LandlordId landlordId, Address address,
                    Set<BuildingApartment.BuildingApartmentId> buildingApartmentIds) {
        this.id = id;
        this.landlordId = landlordId;
        this.buildingApartmentIds = buildingApartmentIds;
        this.address = address;
    }


    public final static class BuildingId implements Identity {

        private String id;

        public BuildingId(String id) {
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
            BuildingId that = (BuildingId) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
