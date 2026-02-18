package PracticeQuestions;

/*
Question 3 -> Create a class Employee with overloaded constructors
to initialize employee details based on different combinations of arguments.
Ensure the constructors support the creation of objects in various ways.
 */

/*
Concept:-

1.Constructor overloading = multiple ways to initialize an object of the same class.

 */
public class _03_Employee {

    String name;
    int id;
    String department;

    _03_Employee(){ //default constructor -- Java class automatically intialise a default constructor
        //      if not defined explicitly

    }

    _03_Employee(String name){
        this.name = name;  //this points the current object

    }

    _03_Employee(String name, int id){
        this.name = name;
        this.id = id;

    }

    _03_Employee(String name, int id, String department){
        this.name = name;
        this.id = id;
        this.department = department;

    }

    void printDetails(){
        if(this.name != null){
            System.out.println("Employee name : " + this.name);
        }
        else{
            System.out.println("Null");
        }
        if(this.id != 0){
            System.out.println("Employee id : " + this.id);
        }
        else{
            System.out.println("Null");
        }
        if(this.department != null){
            System.out.println("Employee department : " + this.department);
        }
        else{
            System.out.println("Null");
        }

    }

    public static void main(String[] args) {

        _03_Employee harsh = new _03_Employee();
        harsh.printDetails();

        _03_Employee ankit = new _03_Employee("Ankit Samrat");
        ankit.printDetails();

        _03_Employee sam = new _03_Employee("Sam",19);
        sam.printDetails();

        _03_Employee harsh1 = new _03_Employee("Harsh Kumar Tiwari",16,"AI/ML");
        harsh1.printDetails();
    }
}

/* ------------>>>>>>>>>>OUTPUT<<<<<<<<<<<<-----------------

Null
Null
Null
Employee name : Ankit Samrat
Null
Null
Employee name : Sam
Employee id : 19
Null
Employee name : Harsh Kumar Tiwari
Employee id : 16
Employee department : AI/ML



 */
