package PracticeQuestions;


/* Question 1 :- 1. Create a class MessagePrinter with a method
printMessage(String name) which prints the message "Hello:<name>".
 */


public class MessagePrinter {
    MessagePrinter(){  //default constructor

    }


    void printMessage(String name){
        System.out.println("Hello :" + name);
    }

    static void main(String[] args) {
        MessagePrinter m1; //referenced to class MessagePrinter(memory in heap)
        m1 = new MessagePrinter(); //declaration of object ( memory in stack)

        m1.printMessage("Harsh Kumar Tiwari");
    }
}


/* ------------>>>>>>>>>>OUTPUT<<<<<<<<<<<<-----------------

       Hello Harsh Kumar Tiwari


 */
