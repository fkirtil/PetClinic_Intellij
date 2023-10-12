package com.javaegitimleri.petclinic.dao;

import com.javaegitimleri.petclinic.model.Owner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Transactional //sb bu sınıfın test methodlarını active bir transaction içerisinde çalıştıracak
public class OwnerRepositoryTests {

    @Autowired
    private OwnerRepository ownerRepository;
    @PersistenceContext
    private EntityManager entityManager;
    @Test(expected = PersistenceException.class) //bu testin başarılı sonlanmasını sağlarız, beklediğimiz bir exception demiş oluruz. Bu exception meydana gelmez ise test fail olsu ndemiş oluyoruz.
    public void testCreateOwner(){
        Owner owner = new Owner(); //Owner sınıfından yeni bir nesne yaratalım.
        owner.setFirstName(null);
        owner.setLastName(null);

        ownerRepository.create(owner);

        entityManager.flush(); //Bu şekilde persistencecontexteki değişiklikleri dbye yansıtıyorum.
    }
}
