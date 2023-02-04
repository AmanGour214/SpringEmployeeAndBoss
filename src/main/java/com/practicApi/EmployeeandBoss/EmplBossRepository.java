package com.practicApi.EmployeeandBoss;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmplBossRepository {

    ArrayList<Employee> EmplDB=new ArrayList<>();

    ArrayList<Boss>BossDB=new ArrayList<>();


    public String addEmployee(Employee employee){
        EmplDB.add(employee);
        return "Employee add Sucessfully";
    }
    public String addBoss(Boss boss){
        BossDB.add(boss);
        return "Boss added Sucessfully";
    }

    public int countOfEmployee(){
        int count=0;
        for(Employee employee:EmplDB){
            if(employee.getAge()>50&&employee.getRating()>6){
                count++;
            }
        }
        return count;
    }

    public String updateSalaryOfBoss(){
        for (Boss boss:BossDB){
            if(boss.getRating()>6){
                int previusSalary=boss.getSalary();
                boss.setSalary(100000+previusSalary);

            }
        }
        return "Sallar update sucessfully";
    }
    public String CountEmplandBoss(){

        int employee=0;
        int boss=0;

        for (Employee employee1:EmplDB){
            if(employee1.getRating()>6)employee++;
        }
        for (Boss boss1:BossDB){
            if(boss1.getRating()>6)boss++;
        }

        return "No of Employe"+employee+"No of Bossess"+boss;
    }



}
