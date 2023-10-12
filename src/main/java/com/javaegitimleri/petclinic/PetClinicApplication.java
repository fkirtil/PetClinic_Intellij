package com.javaegitimleri.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableCaching
@EnableJpaAuditing(auditorAwareRef = "petClinicAuditorAware") //runtimeda audit mekanizması bu bean üzerinden current principle bilgisine erişerek insert update işlemiyle ilgili principle bilgisini alacak v edbde ilgili sütunlara yazacak
@ServletComponentScan //sb classpathte webservlet ve webfilter anatasyonlarına sahip sınıfları otumatik olarak tespit etmektedir.
@SpringBootApplication
@EnableConfigurationProperties(value = PetClinicProperties.class)
public class PetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicApplication.class,args);
    }
}
