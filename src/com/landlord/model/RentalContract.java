package com.landlord.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * This class represents a rental contract between a landlord and a tenant with begin and end date.
 * As such it is value object and does not need an identity.
 */
public final class RentalContract {

    /** the id of the landlord */
    private final Landlord.LandlordId landlordId;
    /** the id of the tenant */
    private final Tenant.TenantId tenantId;
    /** the date corresponding to the begin of the rent period */
    private final LocalDate rentEnd;
    private final LocalDateTime signedDate;
    /** the date corresponding to the creation of the rental contract */
    private final LocalDate rentBegin;

    public RentalContract(Landlord.LandlordId landlordId, Tenant.TenantId tenantId, LocalDate rentBegin, LocalDate rentEnd) {
        this.landlordId = landlordId;
        this.tenantId = tenantId;
        this.rentBegin = rentBegin;
        this.rentEnd = rentEnd;
        this.signedDate = LocalDateTime.now();
    }
}
