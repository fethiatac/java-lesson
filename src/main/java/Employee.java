/**
 * @author fatac
 */
public class Employee {
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int salary;
    private String department;
    private String name;

    public Employee(int salary,String department,String name){

        this.name  = name;
        this.salary = salary;
        this.department = department;
    }
    public void showInfo(){
        System.out.println(" Name : " + name);
        System.out.println(" Department : "+ department);
        System.out.println(" Salary :"+salary);
    }
}
