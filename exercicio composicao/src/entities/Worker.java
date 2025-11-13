package entities;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

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
