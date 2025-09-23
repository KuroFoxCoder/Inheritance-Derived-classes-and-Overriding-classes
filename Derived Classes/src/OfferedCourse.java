public class OfferedCourse extends Course{
    private String professor;
    private String location;
    private String time;

    public void setProfessor(String name)
    {
        professor = name;
    }
    public void setLocation(String place)
    {
        location = place;
    }
    public void setTime(String clock)
    {
        time = clock;
    }
    public String getProfessor()
    {
        return professor;
    }
    public String getLocation()
    {
        return location;
    }
    public String getTime()
    {
        return time;
    }
    public void printMoreInfo()
    {
        this.printInfo();
        System.out.println("   Instructor Name: " + professor);
        System.out.println("   Location: " + location);
        System.out.println("   Class Time: " + time);
    }
}
