import java.util.*;
class Shop{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Java cofee shop!");
        System.out.println("MENU");
        System.out.println("1. Espresso  - 80");
        System.out.println("2. Cappuccino - 120");
        System.out.println("3. Latte - 150");
        System.out.println("4. Cold Coffee - 100");

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
                price = 120;
            break;

            case 3 :
                coffeeName = "Latte";
                price = 150;
            break;

            case 4 :
                coffeeName = "Cold Coffee";
                price = 100;
            break;
            default : 
            System.out.println("Invalid choise !!");
            System.exit(0);
        }

        int total = price * quantity;

        System.out.println("\n☕ Order Summary ☕");
        System.out.println("Coffee: " + coffeeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + total);

        System.out.println("\nThank you! Visit Again ");
        sc.close();
    }
}
