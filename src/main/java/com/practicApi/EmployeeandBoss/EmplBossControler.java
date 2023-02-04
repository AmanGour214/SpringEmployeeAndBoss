package com.practicApi.EmployeeandBoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;

@RestController
public class EmplBossControler {

    @Autowired
    EmplBossService emplBossService;

    @PostMapping("/add_Employee")
    public ResponseEntity addEmployee(@RequestBody Employee employee){
        String responce= emplBossService.addEmployee(employee);
        return new ResponseEntity<>(responce, HttpStatus.CREATED);
    }
    @PostMapping("/add_Boss")
    public ResponseEntity addBoss(@RequestBody Boss boss){
        String responce=emplBossService.addBoss(boss);
        return new ResponseEntity<>(responce,HttpStatus.CREATED);
    }
    @GetMapping("/get_Count")
    public ResponseEntity countOfEmployee(){
        int response=emplBossService.countOfEmployee();
        return new ResponseEntity(response,HttpStatus.FOUND);
    }

    @PutMapping("/update_Salay")
    public ResponseEntity updateSalaryOfBoss(){
        String responce=emplBossService.updateSalaryOfBoss();
        return new ResponseEntity<>(responce,HttpStatus.CREATED);
    }
    @GetMapping("/get_EmplandBossCount")
    public ResponseEntity CountEmplandBoss(){
        String responc=emplBossService.CountEmplandBoss();
        return new ResponseEntity<>(responc,HttpStatus.CREATED);
    }

}
