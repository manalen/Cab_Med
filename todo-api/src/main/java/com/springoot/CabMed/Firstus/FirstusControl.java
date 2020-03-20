package com.springoot.CabMed.Firstus;

import com.springoot.CabMed.Class.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medecin")
public class FirstusControl {
    @Autowired

    private FirstusService ResultService;


    @GetMapping(value = {"/AfficherToutPatient"})

    public List<Patient> todosALL() {
        return ResultService.findall();


    }

    @GetMapping(value = {"/{id_patient}"})
    public Patient  findByid(@PathVariable int id_patient) {
        return ResultService.getbyid(id_patient);
    }

  /*  @GetMapping(value = {"AfficherPatientByNomprenom/{nom}/{prenom}"})
    public List<Patient> findByName(@PathVariable String nom, @PathVariable String prenom) {
        return ResultService.findbyname(nom, prenom);
    }*/

    //  @GetMapping(value = {"AfficherPatientByCin/{cin}"})

    //    public List<Patient> findByCin(@PathVariable String cin) {

    //        return ResultService.finfbycin(cin);

    //

    //    }

   /*@PostMapping(value = {"/CreerPatient"})
    public Patient createPatient(@RequestBody Patient o) {
        if (ResultService.save(o)) {
            return o;
        } else {
            return null;
        }


    }*/

   @GetMapping(value={"/{id_med"})
    public Medecin affichermedecin(@PathVariable int  id_med){
       return ResultService.returnmedcin(id_med);

    }
    @PostMapping(value={"creermedecin"})
    public Medecin inserermedecin(@RequestBody Medecin o){
       if(ResultService.savemedecin(o)){
           return o ;
       }
       else{
           return null;
       }
    }
    @PostMapping(value = {"/ModifierProfil"})
    public Medecin updatemed(@RequestBody Medecin Medecino){



        return Medecino ;
    }
}



