public class Main {

    public static void main(String[] args) {
        Management management = new Management(5);

        Employee emp1 = new Employee(1, "Alice", "Developer", 60000);
        Employee emp2 = new Employee(2, "Bob", "Designer", 50000);
        Employee emp3 = new Employee(3, "Charlie", "Manager", 80000);

        management.addEmployee(emp1);
        management.addEmployee(emp2);
        management.addEmployee(emp3);

        System.out.println("Employees after addition:");
        management.displayEmployees();

        management.removeEmployee(2);
        
        System.out.println("Employees after removal:");
        management.displayEmployees();

        Employee foundEmployee = management.findEmployee(1);
        if (foundEmployee != null) {
            System.out.println("Found Employee: " + foundEmployee);
        }
    }
    
}
