package com.springoot.CabMed.Connection;

import com.springoot.CabMed.Class.Medecin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Medecindb extends MongoRepository<Medecin, Integer> {

}
