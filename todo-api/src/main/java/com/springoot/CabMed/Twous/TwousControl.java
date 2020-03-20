package com.springoot.CabMed.Twous;

import com.springoot.CabMed.Class.Consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medecin")
public class TwousControl {
    @Autowired
private TwousService resultservice1 ;



 @PostMapping(value ={"/creerconsultation"})
    public Consultation create(@RequestBody Consultation o){
     resultservice1.ajouterconsultation(o) ;
     return o ;



 }

}
