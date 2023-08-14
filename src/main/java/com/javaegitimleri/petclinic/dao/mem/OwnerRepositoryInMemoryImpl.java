package com.javaegitimleri.petclinic.dao.mem;

import com.javaegitimleri.petclinic.dao.OwnerRepository;
import com.javaegitimleri.petclinic.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class OwnerRepositoryInMemoryImpl implements OwnerRepository {

    private Map<Long, Owner> ownerMap = new HashMap<>();

    public OwnerRepositoryInMemoryImpl(){
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Scott");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Jim");
        owner2.setLastName("Helpert");

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Dwight");
        owner3.setLastName("Schrute");

        Owner owner4 = new Owner();
        owner4.setId(4L);
        owner4.setFirstName("Kelly");
        owner4.setLastName("Kapoor");

        Owner owner5 = new Owner();
        owner5.setId(5L);
        owner5.setFirstName("Name1");
        owner5.setLastName("Kapoor");

        ownerMap.put(owner1.getId(),owner1);
        ownerMap.put(owner2.getId(),owner2);
        ownerMap.put(owner3.getId(),owner3);
        ownerMap.put(owner4.getId(),owner4);
        ownerMap.put(owner5.getId(),owner5);
    }
    @Override
    public List<Owner> findAll() {
        return new ArrayList<>(ownerMap.values());
    }

    @Override
    public Owner findById(Long id) {
        return ownerMap.get(id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return ownerMap.values().stream().filter(o->o.getLastName().equals(lastName)).collect(Collectors.toList());
    }

    @Override
    public void create(Owner owner) {
        owner.setId(new Date().getTime());
        ownerMap.put(owner.getId(),owner);
    }

    @Override
    public Owner update(Owner owner) {
        ownerMap.replace(owner.getId(),owner);
        return owner;
    }

    @Override
    public void delete(Long id) {
        ownerMap.remove(id);
    }
}
