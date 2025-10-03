public class Encyclopedia extends Book{
    private String edition; //Relevant info concerning the encyclopedia. Since Encyclopedia extends Book, it will use the variables from Book as well as these new variables
    private int pages;

    public void setEdition(String version)
    {
        edition = version; //Set the Encyclopedia's Edition
    }
    public String getEdition()
    {
        return edition; //Return the Encyclopedia's Edition
    }
    public void setPages(int length)
    {
        pages = length; //Set number of pages an Encyclopedia has
    }
    public int getPages()
    {
        return pages; //Return the length of the Encyclopedia
    }
    @Override
    public void printInfo() //Override the Book's printInfo method to use this one in its place for Encyclopedias
    {
        System.out.println("Book Information: ");
        System.out.println("   Title: " + this.getTitle()); //Use Book's getter methods to get the information from those variables
        System.out.println("   Author: " + this.getAuthor());
        System.out.println("   Publisher: " + this.getPublisher());
        System.out.println("   Date of Publication: " + this.getPublishDate());
        System.out.println("   Edition: " + edition); //Use Encyclopedia's variables for edition and length
        System.out.println("   Pages: " + pages);
    }
}
