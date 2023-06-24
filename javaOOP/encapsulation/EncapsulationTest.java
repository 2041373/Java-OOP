package javaOOP.encapsulation;

// this is an encapsulation test class. Only public methods can be accessed not private.
public class EncapsulationTest {

    public static void main (String [] args){

        Encapsulation encapsulation = new Encapsulation("John", 20, "ABC School");
        // System.out.println("Name: " + encapsulation.name); // this will throw an error because 'name' is private
        // System.out.println("Age: " + encapsulation.age); // this will throw an error because 'age' is private
        System.out.println("School: " + encapsulation.school);

    }
    
}
