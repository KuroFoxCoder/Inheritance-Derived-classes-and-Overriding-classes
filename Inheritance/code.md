# Person
```
public class Person {
    private int ageYears;
    private String lastName;

    public void setName(String userName) {
        lastName  = userName;
    }

    public void setAge(int numYears) {
        ageYears = numYears;
    }

    public void printAll() {
        System.out.print("Name: " + lastName);
        System.out.print(", Age: "  + ageYears);
    }
}
```
# Student
```
public class Student extends Person {
    private int idNum;

    public void setID(int studentId) {
        idNum = studentId;
    }

    public int getID() {
        return idNum;
    }
}
```
# StudentDerivationFromPerson
```
public class StudentDerivationFromPerson {
    public static void main(String[] args)
    {
        Student courseStudent = new Student();
        courseStudent.setName("Smith"); //Use Person's setter methods for name and age
        courseStudent.setAge(20);
        courseStudent.setID(9999); //Use Student's setter methods for ID

        courseStudent.printAll(); //Use Person's printAll method to get name and age info
        System.out.print(", ID: " + courseStudent.getID()); //Print student's ID using Student's getID method
    }
}
```
