package WEEK_8.Ex_11;

public class Exercise_11 {
    public static void main(String[] args) {
        Book book = new Book("Author", "Title", 1.5);
        CD cd = new CD("Artist", "Album", 2000);

        // Create boxes
        Box smallBox = new Box(5.0);
        Box mediumBox = new Box(10.0);
        Box largeBox = new Box(20.0);

        // Put things into boxes
        smallBox.add(book);
        mediumBox.add(cd);

        // Put boxes into larger boxes
        mediumBox.add(smallBox);
        largeBox.add(mediumBox);

        // Print the contents and weights of boxes
        System.out.println("Small Box: " + smallBox);
        System.out.println("Medium Box: " + mediumBox);
        System.out.println("Large Box: " + largeBox);
    }
}
