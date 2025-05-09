class AccessModifiersEmployee {
    public int employeeID;
    protected String department;
    private double salary;
    public AccessModifiersEmployee(int employeeID, String department, double salary){
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.println(employeeID);
        System.out.println(department);
        System.out.println(salary);
        System.out.println("----------------------------------------------------------------------------------------");
    }
    class Manager extends AccessModifiersEmployee{
        public Manager (int employeeID,String department,double salary ){
            super(employeeID, department, salary);
        }
        public void displaySubclass(){
            System.out.println(employeeID);
            System.out.println(department);
            System.out.println(getSalary());
        }
    }
    public static void main(String[] args) {
        AccessModifiersEmployee employee=new AccessModifiersEmployee(368292,"Abc", 18439);
        employee.display();
        employee.setSalary(10000);
        employee.display();
        AccessModifiersEmployee.Manager manager= employee.new Manager (6474981, "Xyz",12500);
        manager.displaySubclass();
    }
}