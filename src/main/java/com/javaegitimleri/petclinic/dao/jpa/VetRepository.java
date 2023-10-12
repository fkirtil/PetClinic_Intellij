package com.javaegitimleri.petclinic.dao.jpa;

import com.javaegitimleri.petclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}
