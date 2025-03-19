import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "Saurabh Mule", 25000);
        Employee emp2 = new Employee(2, "Sarthak Joshi", 17000);
        Employee emp3 = new Employee(3, "Amol Kulkarni", 35000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
