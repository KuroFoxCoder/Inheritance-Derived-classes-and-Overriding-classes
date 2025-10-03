public class Book {

    private String title; //Series of uninitialized String variables for information on the book object
    private String author;
    private String publisher;
    private String publishDate;

    public void setTitle(String name)
    {
        title = name; //Set the book's name
    }
    public String getTitle()
    {
        return title; //Return the book's name
    }
    public void setAuthor(String writer)
    {
        author = writer; //Set the name of the book's author
    }
    public String getAuthor()
    {
        return author; //Return the name of the book's author
    }
    public void setPublisher(String distributor)
    {
        publisher = distributor; //Set the publisher for book
    }
    public String getPublisher()
    {
        return publisher; //Return the set Publisher for book object
    }
    public void setDate(String dayOf)
    {
        publishDate = dayOf; //Set publishDate String to date of book's publication
    }
    public String getPublishDate()
    {
        return publishDate; //Return currently set publishDate
    }

    public void printInfo()
    {
        System.out.println("Book Information: "); //Print info using the native String variables Book has
        System.out.println("   Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Date of Publication: " + publishDate);
    }
}
