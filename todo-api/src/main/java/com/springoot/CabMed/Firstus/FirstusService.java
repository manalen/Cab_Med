package com.springoot.CabMed.Firstus;


import org.springframework.stereotype.Service;
import com.springoot.CabMed.Class.*;

import java.util.Arrays;
import java.util.List;

@Service
public class FirstusService {
    private List<Patient> data =  Arrays.asList(

            new Patient(1,"oth",50),
            new Patient(2,"oth",50),
            new Patient(3,"oth",50)



    );

    public List<Patient> findall() {
        return data;

    }
}
