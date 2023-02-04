package com.practicApi.EmployeeandBoss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmplBossService {

    @Autowired
    EmplBossRepository emplBossRepository;

    public String addEmployee(Employee employee){
        return emplBossRepository.addEmployee(employee);
    }
    public String addBoss(Boss boss){
        return emplBossRepository.addBoss(boss);
    }
    public int countOfEmployee(){
        return emplBossRepository.countOfEmployee();
    }
    public String updateSalaryOfBoss(){
        return emplBossRepository.updateSalaryOfBoss();
    }
    public String CountEmplandBoss(){
        return emplBossRepository.CountEmplandBoss();
    }
}
