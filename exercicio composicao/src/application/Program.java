package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;




import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");



        System.out.println("Enter department's name: ");
        Department dp1 = new Department(sc.nextLine());

        System.out.println("Enter worker data:");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Level: ");
        String level = String.valueOf(WorkerLevel.valueOf(sc.nextLine()));

        System.out.println("Base salary: ");
        Double basesalary = sc.nextDouble();

        Worker wk1= new Worker(name, basesalary, level);
        System.out.println("How many contracts to this worker? ");
        int z;
        z = sc.nextInt();
        for(int i = 1; i>=z; i++){
            System.out.println("Enter contract #" + i + " data: ");

            System.out.println("Date (DD/MM/YYYY): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), formatter);

            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.println("Duration (hours): ");
            Integer hours = sc.nextInt();

            HourContract contract = new HourContract(date, hours, valuePerHour);
            int x = 1;


        }




    }
}
