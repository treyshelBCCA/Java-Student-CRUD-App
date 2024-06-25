import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create Employee");
            System.out.println("2. Read All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter department ID: ");
                    int departmentId = scanner.nextInt();
                    scanner.nextLine();
                    Department department = new Department(departmentId, null);
                    Employee employee = new Employee(0, name, department);
                    employeeDAO.createEmployee(employee);
                    break;
                case 2:
                    List<Employee> employees = employeeDAO.readAllEmployees();
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.print("Enter employee ID to update: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new department ID: ");
                    int newDepartmentId = scanner.nextInt();
                    scanner.nextLine();
                    Department newDepartment = new Department(newDepartmentId, null);
                    Employee updatedEmployee = new Employee(employeeId, newName, newDepartment);
                    employeeDAO.updateEmployee(updatedEmployee);
                    break;
                case 4:
                    System.out.print("Enter employee ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    scanner.nextLine();
                    employeeDAO.deleteEmployee(idToDelete);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
