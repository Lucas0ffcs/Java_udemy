package entities;

import entities.enums.WorkerLevel;

import java.util.List;

public class Worker {

    //atributos basicos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    //associações (flechas na notação UML
    // 1 worker tem 1 department
    private Department department;

    // mas 1 worker tem varios contracts: deve ser usado lista

    private List<HourContract> contracts;


    public Worker(String name, Double basesalary, String level){
    }

    public Worker(String name, Double baseSalary, WorkerLevel level) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    //MÉTODOS

    void addContract(HourContract contract){
        //prencher
    }

    void removeContract(HourContract contract){
        //preencher
    }


    Double income(Integer year, Integer month){
        //preencher
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
