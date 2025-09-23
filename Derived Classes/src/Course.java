public class Course {
    private String name;
    private String title;

    public void setName(String nameSet)
    {
        name = nameSet;
    }
    public void setTitle(String titleSet)
    {
        title = titleSet;
    }
    public String getName()
    {
        return name;
    }
    public String getTitle()
    {
        return title;
    }
    public void printInfo()
    {
        System.out.println("Course Information:");
        System.out.println("   Course Number: " + title);
        System.out.println("   Course Title: " + name);
    }
}
