# Course
```
public class Course {
    private String name;
    private String title;

    public void setName(String nameSet)
    {
        name = nameSet; //Set course's name
    }
    public void setTitle(String titleSet)
    {
        title = titleSet; //Set Course's title
    }
    public String getName()
    {
        return name; //Return Course's name
    }
    public String getTitle()
    {
        return title; //Return Course's title
    }
    public void printInfo()
    {
        System.out.println("Course Information:"); //Print all information available to Course class according to object
        System.out.println("   Course Number: " + title);
        System.out.println("   Course Title: " + name);
    }
}

```
# OfferedCourse
```
public class OfferedCourse extends Course{
    private String professor; //Information that will only be accessible by OfferedCourse.
    private String location;
    private String time;

    public void setProfessor(String name)
    {
        professor = name;
    } //Set the Professor of the course
    public void setLocation(String place)
    {
        location = place;
    } //Set the location of the course
    public void setTime(String clock)
    {
        time = clock;
    }         //Set the time the course will be at
    public String getProfessor()
    {
        return professor;
    }          //Get the current OfferedCourse's professor
    public String getLocation()
    {
        return location;
    }            //Get the current OfferedCourse's location
    public String getTime()
    {
        return time;
    }                    //Get the current OfferedCourse's class time
    public void printMoreInfo()
    {
        this.printInfo(); //Call superclass method which can access Course variables, then print information only accessible information from this class here
        System.out.println("   Instructor Name: " + professor);
        System.out.println("   Location: " + location);
        System.out.println("   Class Time: " + time);
    }
}

```
# Main
```
public class Main {
    public static void main(String[] args) {

        Course courseOne = new Course(); // New empty Course object
        OfferedCourse courseTwo = new OfferedCourse(); // New empty OfferedCourse object

        courseOne.setName("Digital Systems Design"); //Use Course setters to establish Course information
        courseOne.setTitle("ECE287");

        courseTwo.setName("Embedded Systems Design"); // Use Course setters to establish OfferedCourse information
        courseTwo.setTitle("ECE387");
        courseTwo.setProfessor("Mark Patterson"); //Use OfferedCourse setters to establish information only accessible via OfferedCourse
        courseTwo.setLocation("Wilson Hall 231");
        courseTwo.setTime("WF: 2-3:30 P.M.");

        courseOne.printInfo(); //Use printInfo methods for both Course and OfferedCourse
        courseTwo.printMoreInfo();
    }
}
```
