package com.springoot.CabMed.Firstus;
import com.springoot.CabMed.Class.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/othmane/pro/list")
public class FirstusControl {
    @Autowired
private FirstusService todoService ;

    @GetMapping(value = {"","/"})

    public List<Patient> todosALL(){
        return todoService.findall();


    }
}
