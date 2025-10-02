public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.print("How many employees will be registered?: ");
    int n = sc.nextInt();

    List<Employee> list = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
        System.out.println("Employee #" + i);
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        ((ArrayList<Employee>) list).add(new Employee(id, name, salary));
    }

    System.out.print("Enter the employee id who will have salary increase: ");
    int xId = sc.nextInt();
    Employee delta = list.stream().filter(x -> x.getId() == xId).findFirst().orElse(null);

    System.out.print("Enter the percentage: ");
    float per = sc.nextFloat();

    delta.setSalary(delta.getSalary() * (1 + (per / 100)));


    System.out.println("List of employees: ");

    for (Employee x : list) {
        System.out.println(x.getId() + ", " + x.getName() + ", " + x.getSalary());
    }
}
