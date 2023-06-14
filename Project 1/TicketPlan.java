public class TicketPlan {
    private String lastName;
    private int ticketPlan; //1 = Amusement Park    2 = Water Park  3 = Both Parks
    private int numAdults;
    private int numChildren;
    private int days;

        //No-Arg
        public TicketPlan() {

        }

    //Contructor that takes an argument for each field
    public TicketPlan(String lastName, int ticketPlan, int numAdults, int numChildren, int days) {
        this.lastName = lastName;
        this.ticketPlan = ticketPlan;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.days = days;
    }

    //Setters + Getters
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

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

    public void setTicketPlan(int ticketPlan) {
        this.ticketPlan = ticketPlan;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //Returns Cost per day per adult
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

    //Returns Cost per day per child
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

    //Return total cost
    public double getPlanPrice() {
        return ((getCostPerDayChild() * numChildren) + (getCostPerDayAdult() * numAdults)) * days;
    } //End Method
    
} //End Class
