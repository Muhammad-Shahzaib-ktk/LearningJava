
class Employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("Name :" + name);
        System.out.println("Id :" + id);
        System.out.println("Salary :" + salary);
    }

    


}

public class testjavaprogram {
    
    public static void main(String[] args){

        System.out.println("Java practise! I don't understand shit.");

        Employee ali = new Employee();
        Employee haider = new Employee();

        ali.id=23;
        ali.name= "Muhammad Ali";
        ali.salary= 20000;


        haider.id=99;
        haider.name="Haider khattak";
        haider.salary=40000;

        
        ali.printdetails();
        haider.printdetails();
        


    }
}
