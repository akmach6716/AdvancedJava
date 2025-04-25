package coreJavaAssignments.Assignment3;

public class BookTest {
        public static void main(String[] args) {
            Novel novel = new Novel("ISBN123", "The Great Gatsby", 299.99, "F. Scott Fitzgerald");
            Magazine magazine1 = new Magazine("ISBN456", "National Geographic", 199.99, "Science");
            Magazine magazine2 = new Magazine("ISBN457", "National Geographical", 199.92, "Science fiction");

            novel.display();
            System.out.println();
            magazine1.display();
            magazine2.display();
        }
    }
