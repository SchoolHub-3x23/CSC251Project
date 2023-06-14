/**
 * The TicketPlan class implements a ticket plan that can be used to calculate the price of admission for a family and their duration of stay in an amusement park or water park, or both.
 * It provides methods to retrieve and set information about the family, ticket plan, number of adults and children, and the duration of their stay. 
 * It also calculates the cost per day for adults and children based on the selected ticket plan and provides a method to calculate the total price of the ticket plan.
 * @version 1.0
 */
public class TicketPlan {
    private String lastName;
    private int ticketPlan; //1 = Amusement Park    2 = Water Park  3 = Both Parks
    private int numAdults;
    private int numChildren;
    private int days;

    /**
     * This is a no-argument constructor that creates an instance of the TicketPlan class without any initial values.
     */
    public TicketPlan() {

    }

    /**
     * This constructs a ticket plan with a specified Family's last name, ticket plan, number of adults, number of children, and how many days they'll stay.
     * @param lastName (String): The last name of the family.
     * @param ticketPlan (int): The selected ticket plan (1 for Amusement Park, 2 for Water Park, 3 for Both Parks).
     * @param numAdults (int): The number of adults attending.
     * @param numChildren (int): The number of children attending.
     * @param days (int): The number of days the family will be staying.
     */
    public TicketPlan(String lastName, int ticketPlan, int numAdults, int numChildren, int days) {
        this.lastName = lastName;
        this.ticketPlan = ticketPlan;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.days = days;
    }

    //Setters + Getters

    /**
     * 
     * @return Returns the last name of the family.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 
     * @param lastName Sets the last name of the family.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return Returns the selected ticket plan as a string (e.g., "Amusement Park Only", "Water Park Only", "Both Parks").
     */
    public String getTicketPlan() {
        String plan = "";
        if (ticketPlan == 1) {
            plan = "Amusement Park Only";
        }
        else if (ticketPlan == 2) {
            plan = "Water Park Only";
        }
        else {
            plan = "Both Parks";
        }
        return plan;
    }

    /**
     * 
     * @param ticketPlan Sets the ticket plan (1 for Amusement Park, 2 for Water Park, 3 for Both Parks).
     */
    public void setTicketPlan(int ticketPlan) {
        this.ticketPlan = ticketPlan;
    }

    /**
     * 
     * @return Returns the number of adults attending.
     */
    public int getNumAdults() {
        return numAdults;
    }

    /**
     * 
     * @param numAdults Sets the number of adults attending.
     */
    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    /**
     * 
     * @return Returns the number of children attending.
     */
    public int getNumChildren() {
        return numChildren;
    }

    /**
     * 
     * @param numChildren Sets the number of children attending.
     */
    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    /**
     * 
     * @return Returns the number of days the family will be staying.
     */
    public int getDays() {
        return days;
    }

    /**
     * 
     * @param days Sets the number of days the family will be staying.
     */
    public void setDays(int days) {
        this.days = days;
    }

    /**
     * 
     * @return Returns the cost per day per adult based on the selected ticket plan and the number of days.
     */
    public double getCostPerDayAdult() {
        double cost = 0;

        if (ticketPlan == 1) { //Amusement Park Only
            if (days <= 4) { //Up to 4 days = $104.99
                cost = 104.99;
            }
            else if(days > 4) { //More than 4 days = $94.99
                cost = 94.99;
            }
        }
        else if (ticketPlan == 2) { //Water Park Only
            if (days <= 4) { //Up to 4 days = $84.99
                cost = days * 84.99;
            }
            else if(days > 4) { //More than 4 days = $79.99
                cost = days * 79.99;
            }
        }
        else {  //Both Parks
            if (days <= 4) { //Up to 4 days = $169.99
                cost = days * 169.99;
            }
            else if(days > 4) { //More than 4 days = $149.99
                cost = 149.99;
            }
        }

        return cost;
    } //End Method

    /**
     * 
     * @return Returns the cost per day per child based on the selected ticket plan and the number of children.
     */
    public double getCostPerDayChild() {
        double cost = 0;

        if (ticketPlan == 1) {  //Amusement Park
            if (numChildren <= 2) { //Up to 2 children = $52.49
                cost = 52.49;
            }
            else {  //More than 2 children = $47.49
                cost =  47.49;
            }
        }
        else if (ticketPlan == 2) { //Water Park
            if (numChildren <= 2) { //Up to 2 children = $42.49
                cost = 42.49;
            }
            else {  //More than 2 children = $39.99
                cost =  numChildren * 39.99;
            }
        }
        else {  //Both Parks
            if (numChildren <= 2) { //Up to 2 children = $84.99
                cost = numChildren * 84.99;
            }
            else {  //More than 2 children = $74.99
                cost =  74.99;
            }
        }
        return cost;
    } //End Method

    /**
     * 
     * @return Calculates and returns the total price of the ticket plan based on the cost per day for adults and children and the duration of stay.
     */
    public double getPlanPrice() {
        return ((getCostPerDayChild() * numChildren) + (getCostPerDayAdult() * numAdults)) * days;
    } //End Method
    
} //End Class
