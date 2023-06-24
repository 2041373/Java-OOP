package javaOOP.encapsulation;

public class Encapsulation {

    private String name;
    private int age;
    public String school;

 

    Encapsulation(String name, int age, String school){
        this.name = name;
        this.age = age;
        this.school = school;

    }

           // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for 'school'
    public String getSchool() {
        return school;
    }

    // Setter for 'school'
    public void setSchool(String school) {
        this.school = school;
    }

    public static void main (String [] args){

        Encapsulation encapsulation = new Encapsulation("John", 20, "ABC School");
        System.out.println("Name: " + encapsulation.name);
        System.out.println("Age: " + encapsulation.age);
        System.out.println("School: " + encapsulation.school);

        Encapsulation encapsulation2 = new Encapsulation("Jane", 21, "XYZ School");
        System.out.println("Name: " + encapsulation2.name);
        encapsulation2.setAge(22);
        System.out.println("Age: " + encapsulation2.age);

    }
}
    

 