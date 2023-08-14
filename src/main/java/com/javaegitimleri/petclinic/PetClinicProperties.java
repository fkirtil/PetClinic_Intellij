package com.javaegitimleri.petclinic;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("petclinic")
public class PetClinicProperties {
    private boolean displayOwnersWithPets = false;

    public boolean isDisplayOwnersWithPets() {
        return displayOwnersWithPets;
    }

    public void setDisplayOwnersWithPets(boolean displayOwnersWithPets) {
        this.displayOwnersWithPets = displayOwnersWithPets;
    }
}
