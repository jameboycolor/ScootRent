import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Rental shop = new Rental("Scooter Shop", 50);
        while(true) {
            System.out.println("Select input task number. 1 - Show number of available scooters, 2 - Rent Scooter, 3 - Return Scooter, 4 - Close the Store ");
            Scanner input = new Scanner(System.in);
            int task = input.nextInt();
            switch(task) {
                case 1:
                    System.out.println(" The number of available scooters is " + shop.getNumScooters());
                    break;
                case 2:

                    System.out.println("Would you like an 1. Hourly 2. Daily or 3. Weekly rental? ");
                    int time = input.nextInt();
                    System.out.println("How many scooters would you like to rent? ");
                    int count = input.nextInt();
                    System.out.println("Enter your name");
                    String name = input.nextLine();

                    switch(time) {
                        case 1:
                            shop.rentHourly(name, count);
                            break;
                        case 2:
                            shop.rentDaily(name, count);
                            break;
                        case 3:
                            shop.rentWeekly(name, count);
                            break;
                        default:
                            System.out.println("Sorry, something went wrong");
                    }
                    break;
                case 3:
                    for (String keyName : shop.getCustomers().keySet()) {
                        System.out.println(keyName);
                    }
                    String names = input.nextLine();
                    shop.invoiceReturn(names);
                    break;
                case 4:
                    break;

                default:
                    System.out.println("Error");
                    break;
            }
        }

    }

}
