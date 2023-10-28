public class Person {
    int nic;
    String name;
    Person(int nic,String name){
        this.nic = nic ;
        this.name = name ;
    }
}
class Employee extends Person {
    float salary;
    Employee (int nic, String name, float salary){
        super(nic,name);
        this.salary = salary;
    }
    void output (){
        System.out.println("NIC :"+ nic +" ,"+ "Name :"+ name +" ," + "Salary :"+ salary);
    }
}
class  Test2 {
    public static void main(String[] args) {
        Employee e = new Employee (2000466666,"Vidusha",1000000f);
        e.output();
    }
}
