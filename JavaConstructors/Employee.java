// Employee Records Management
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dept, double sal) {
        employeeID = id;
        department = dept;
        salary = sal;
    }

    // method to modify salary
    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    void showEmployee() {
        System.out.println("ID: " + employeeID + ", Dept: " + department + ", Salary: " + salary);
    }
}

// subclass accessing public and protected
class Manager extends Employee {
    String teamName;

    Manager(int id, String dept, double sal, String team) {
        super(id, dept, sal);
        teamName = team;
    }

    void showManagerInfo() {
        System.out.println("Manager ID: " + employeeID + ", Department: " + department + ", Team: " + teamName);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(201, "IT", 75000, "Dev Team");
        m1.showEmployee();
        m1.showManagerInfo();
        m1.setSalary(80000);
        System.out.println("Updated Salary: " + m1.getSalary());
    }
}
