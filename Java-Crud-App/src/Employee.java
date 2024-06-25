public class Employee {
    private int employeeId;
    private String name;
    private Department department;

    public Employee(int employeeId, String name, Department department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    // Getters and setters
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department=" + department +
                '}';
    }
}
