package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Date;


public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        System.out.println("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data:");

        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Level: ");
        String level = sc.nextLine();

        System.out.println("Base salary: ");
        Double basesalary = sc.nextDouble();


        Worker wk1= new Worker(name,  WorkerLevel.valueOf(level), basesalary, new Department(departmentName));//REVISAR



        System.out.println("How many contracts to this worker? ");

        int z = sc.nextInt();
        for(int i = 1; i<=z; i++){
            System.out.println("Enter contract #" + i + " data: ");

            System.out.println("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.println("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, hours, valuePerHour);
            wk1.addContract(contract);


        }
        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String incomeDate = sc.next();

        int month = Integer.parseInt(incomeDate.substring(0,2));
        int year = Integer.parseInt(incomeDate.substring(3));




        System.out.println("Name: " + wk1.getName());
        System.out.println("Department: " + wk1.getDepartment().getName());
        System.out.println("Income for "+ month + "/" + year + ": " + String.format("%.2f", wk1.income(year,month)));


        sc.close();

    }
}
