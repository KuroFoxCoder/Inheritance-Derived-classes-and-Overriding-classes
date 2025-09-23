public class Main {
    public static void main(String[] args) {

        Course courseOne = new Course();
        OfferedCourse courseTwo = new OfferedCourse();

        courseOne.setName("Digital Systems Design");
        courseOne.setTitle("ECE287");

        courseTwo.setName("Embedded Systems Design");
        courseTwo.setTitle("ECE387");
        courseTwo.setProfessor("Mark Patterson");
        courseTwo.setLocation("Wilson Hall 231");
        courseTwo.setTime("WF: 2-3:30 P.M.");

        courseOne.printInfo();
        courseTwo.printMoreInfo();
    }
}