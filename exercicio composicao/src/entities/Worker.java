package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
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

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }
    //Não adicionar atributos do tipo lista no construtor
    public Worker(Department department, Double baseSalary, WorkerLevel level, String name) {
        this.department = department;
        this.baseSalary = baseSalary;
        this.level = level;
        this.name = name;
    }

    //MÉTODOS

    void addContract(HourContract contract){
        contracts.add(contract);
    }

    void removeContract(HourContract contract){
        contracts.remove(contract);
    }


    Double income(Integer year, Integer month){
        //preencher
    }

    public List<HourContract> getContracts() {
        return contracts;
    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
