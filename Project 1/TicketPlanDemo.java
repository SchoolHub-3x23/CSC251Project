import java.util.ArrayList;
import java.util.Scanner;

public class TicketPlanDemo {
    public static void main(String[] args) throws Exception {
        String lastName;
        String repeat;
        int plan;
        String planTypeString;
        int numAdults;
        int numChildren;
        int days;
        ArrayList<TicketPlan> ticketPlan = new ArrayList<TicketPlan>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the last name of the family purchasing the plan: ");
            lastName = sc.nextLine();

            System.out.print("\t1. Amusement Park Only"
                                +"\n\t2. Water Park Only"
                                +"\n\t3. Both Parks");
            System.out.print("\n\nSelect a Ticket Plan from the menu above: ");
            plan = sc.nextInt();
            while (plan < 1 || plan > 3) {  //Must be between 1 and 3
                System.out.print("\nInvalid Menu Choice. Please select from menu.");
                System.out.print("\n\t1. Amusement Park Only"
                                +"\n\t2. Water Park Only"
                                +"\n\t3. Both Parks");
            System.out.print("\nSelect a Ticket Plan from the menu above: ");
            plan = sc.nextInt();
            }

            System.out.print("Enter the number of adults on the ticket plan: ");
            numAdults = sc.nextInt();
            while (numAdults < 1) { //Must be 1 or more adults
                System.out.println("\nInvalid amount. Must be 1 or more adults");
                System.out.print("Enter the number of adults on the ticket plan: ");
                numAdults = sc.nextInt();
            }

            System.out.print("Enter the number of children on the ticket plan: ");
            numChildren = sc.nextInt();
            while (numChildren < 0) { //Cannot be negative
                System.out.println("\nInvalid amount. There cannot be negative children.");
                System.out.print("Enter the number of children on the ticket plan: ");
                numChildren = sc.nextInt();
            }

            System.out.print("Enter the number of days the ticket plan covers: ");
            days = sc.nextInt();
            while (days < 1) { //Cannot be negative
                System.out.println("\nInvalid amount. Must be 1 or more days.");
                System.out.print("Enter the number of days the ticket plan covers: ");
                days = sc.nextInt();
            }

            //Adding choices to ArrayList
            ticketPlan.add(new TicketPlan(lastName, plan, numAdults, numChildren, days));
            //Consume input buffer, also, if you read this, why doesn't Java get rid of the buffer? Or is it something I'm doing?
            sc.nextLine();

            System.out.println();
            System.out.print("Do you wish to enter information for another ticket plan (Y/N)? ");
            repeat = sc.nextLine();
            while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")) {
                System.out.println("\nInvalid choice. Only \"Y\" or \"N\" is accepted");
                System.out.print("Do you wish to enter information for another ticket plan (Y/N)? ");
                repeat = sc.nextLine();
            }
            System.out.println();
            
        } while (repeat.equalsIgnoreCase("y")); //End do-while loop for user input

        //Finding which family bought the most expensive ticket
        double maxCost = ticketPlan.get(0).getPlanPrice();
        int maxFamily = 0;
        for (int i = 0; i < ticketPlan.size(); i++) {
            if (maxCost < ticketPlan.get(i).getPlanPrice()) {
                maxCost = ticketPlan.get(i).getPlanPrice();
                maxFamily = i;
            }
            
        } //End for loop


        System.out.println("Ticket Plan Report:");

        for (int i = 0; i < ticketPlan.size(); i++) {
            System.out.println("\nLast Name: " + ticketPlan.get(i).getLastName() 
                                +"\nTicket Plan Type: " + ticketPlan.get(i).getTicketPlan()
                                +"\nNumber of Adults: " + ticketPlan.get(i).getNumAdults()
                                +"\nNumber of Children: " + ticketPlan.get(i).getNumChildren()
                                +"\nNumber of Days: " + ticketPlan.get(i).getDays());
            System.out.printf("Price of Ticket Plan: $%,.2f", ticketPlan.get(i).getPlanPrice());
            System.out.println("");
            
                                
        } //End for loop

        System.out.println("\nFamily that purchased the most expensive ticket plan: " + ticketPlan.get(maxFamily).getLastName());

    } //End main
} //End class
