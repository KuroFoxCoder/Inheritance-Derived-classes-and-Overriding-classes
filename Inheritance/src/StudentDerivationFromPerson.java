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
