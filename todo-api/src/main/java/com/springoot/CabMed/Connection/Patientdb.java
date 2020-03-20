package com.springoot.CabMed.Connection;


import com.springoot.CabMed.Class.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Patientdb  extends MongoRepository<Patient, Integer > {
}
