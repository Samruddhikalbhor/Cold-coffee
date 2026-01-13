import java.util.*;
class Cofee{
    public static void main(String args[]){
         Scanner sc = new scanner(System.in);

        System.out.println("Welcome to Java cofee shop!");
        System.out.println("MENU");
        System.out.println("1. Espresso  - ₹80");
        System.out.println("2. Cappuccino - ₹120");
        System.out.println("3. Latte - ₹150");
        System.out.println("4. Cold Coffee - ₹100");

        System.out.print("Enter your choise : ");
        int c = sc.nextInt();

        String coffeeName = "";
        int quantity = 0;
        int price = 0;


        switch(c){
            case 1 :
                coffeeName = "Espresso";
                price = 80;
            break;

            case 2 :
                coffeeName = " Cappuccino";
                price = ₹120;
            break;

            case 3 :
                coffeeName = "Espresso";
                price = 80;
            break;

            case 4 :
                coffeeName = "Espresso";
                price = 80;
            break;

        }
    }
}
