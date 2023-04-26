import java.util.ArrayList;
import java.util.HashMap;

public class Rental {


    //Attributes/Variables
    private String name;
    private int numScooters;
    private HashMap<String, HashMap<String, Integer>> customers;


    //constructor
    public Rental() {
        name = "";
        numScooters = 0;
        customers = new HashMap<>();
    }

    public Rental(String name, int numScooters) {
        this.name = name;
        this.numScooters = numScooters;
        this.customers = new HashMap<>();
    }


    public void rentHourly(String name, int custScooters) {
        if (custScooters > numScooters) {
            System.out.println("Scooter number is invalid, please enter a different number.");
        } else {
            HashMap<String, Integer> hourly = new HashMap<>();
            hourly.put("Hourly", custScooters);
            customers.put(name, hourly);
            numScooters = numScooters - custScooters;
            System.out.println("Rent completed successfully");
        }
    }

    public void rentDaily(String name, int custScooters) {
        if (custScooters > numScooters) {
            System.out.println("Scooter number is invalid, please enter a different number.");
        } else {
            HashMap<String, Integer> daily = new HashMap<>();
            daily.put("Hourly", custScooters);
            customers.put(name, daily);
            numScooters = numScooters - custScooters;
            System.out.println("Rent completed successfully");
        }
    }

    public void rentWeekly(String name, int custScooters) {
        if (custScooters > numScooters) {
            System.out.println("Scooter number is invalid, please enter a different number.");
        } else {
            HashMap<String, Integer> weekly = new HashMap<>();
            weekly.put("Hourly", custScooters);
            customers.put(name, weekly);
            numScooters = numScooters - custScooters;
            System.out.println("Rent completed successfully");

        }
    }

    public void invoiceReturn(String name) {
        if (customers.containsKey(name)) {
            for (String time : customers.keySet()) {
                if (time.equals("Hourly")) {
                    int scooterCount = customers.get(name).get("Hourly");
                    numScooters = numScooters + scooterCount;
                    System.out.println("You Rented " + scooterCount + " scooters");
                    if (3 <= scooterCount && scooterCount <= 5) {
                        System.out.println("You recieved a discount of " + (5 * (scooterCount * .30)) + " ,reaching a total of " + (5 * (scooterCount * .70)));
                    } else {
                        System.out.println("Your invoice total is " + 5 * scooterCount + "scooters");
                    }
                } else if (time.equals("Daily")) {
                    int scooterCount = customers.get(name).get("Daily");
                    numScooters = numScooters + scooterCount;
                    System.out.println("You Rented " + scooterCount + " scooters");
                    if (3 <= scooterCount && scooterCount <= 5) {
                        System.out.println("You recieved a discount of " + (20 * (scooterCount * .30)) + " ,reaching a total of " + (20 * (scooterCount * .70)));
                    } else {
                        System.out.println("Your invoice total is " + 20 * scooterCount + "scooters");
                    }

                } else if (time.equals("Weekly")) {
                    int scooterCount = customers.get(name).get("Weekly");
                    numScooters = numScooters + scooterCount;
                    System.out.println("You Rented " + scooterCount + " scooters");
                    if (3 <= scooterCount && scooterCount <= 5) {
                        System.out.println("You recieved a discount of " + (50 * (scooterCount * .30)) + " ,reaching a total of " + (50 * (scooterCount * .70)));
                    } else {
                        System.out.println("Your invoice total is " + 50 * scooterCount + "scooters");
                    }
                }
        }
        }else{
            System.out.println("Please enter name again");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumScooters() {
        return numScooters;
    }

    public void setNumScooters(int numScooters) {
        this.numScooters = numScooters;
    }

    public HashMap<String, HashMap<String, Integer>> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<String, HashMap<String, Integer>> customers) {
        this.customers = customers;
    }
}
