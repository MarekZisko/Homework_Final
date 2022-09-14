package Main;

import BookPcg.*;

public class Main {
    public static void main(String[] args) {

        Book physics = new ScientificBook("Basics of Gravity", "Isaac Newton", 200, "Physics");

        Book serbian = new ForeignBook("Orlovi Rano Lete", "Branko Copic", 120, "Serbian");

        Book slovak = new Book("Zart", "Milan Kunera", 120);

        Book english = new ForeignBook("Love in the time of Cholera", "Gabriel Garcia Marquez", 120);


        System.out.println(physics);

        System.out.println(slovak);
    }
}
