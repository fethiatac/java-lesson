/**
 * @author fatac
 */
public class Manager extends Employee {
    public Manager(int salary, String name, String department){
        super(salary,department,name);
    }
    public void showInfo(){
        super.showInfo();
        System.out.println("Buda yeni versiyon "+ getSalary());

    }
}
