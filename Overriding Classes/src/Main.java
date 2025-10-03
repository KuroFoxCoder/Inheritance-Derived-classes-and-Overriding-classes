public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book(); //Create new empty Book and Encyclopedia objects
        Encyclopedia bookTwo = new Encyclopedia();

        bookOne.setTitle("The Hobbit"); //Set title of Book
        bookOne.setAuthor("J. R. R. Tolkien"); //Set the author of Book
        bookOne.setPublisher("George Allen & Unwin"); //Set the name of the book's publisher
        bookOne.setDate("21 September 1937"); //Set date of publication

        bookTwo.setTitle("The Illustrated Encyclopedia of the Universe"); //same as bookOne
        bookTwo.setAuthor("Ian Ridpath"); //Same as bookOne
        bookTwo.setPublisher("Watson-Guptill"); //Same as bookOne
        bookTwo.setDate("2001"); //Same as bookOne
        bookTwo.setEdition("2nd"); //Set encyclopedia's edition
        bookTwo.setPages(384); //Set number of pages as per the encyclopedia's info

        bookOne.printInfo(); //Call printInfo method on bookOne's information
        bookTwo.printInfo(); //Call printInfo method on bookTwo's information
    }
}