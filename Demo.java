import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        String policyNumber;
        String providerName;
        String holderFirstName, holderLastName;
        int holderAge;
        String smokingStatus;
        int holderHeight, holderWeight;
        int smoker = 0; 
        int nonSmoker = 0;
        ArrayList<Policy> policyList = new ArrayList<Policy>();

        //Opening file
        File file = new File("PolicyInformation.txt");
        
        //Check if we can even find the file
        if(!file.exists()) {
            System.out.println("Unable to find file");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);

        //Scan file
        while(inputFile.hasNext()) { //open while loop
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            holderFirstName = inputFile.nextLine();
            holderLastName = inputFile.nextLine();
            holderAge = inputFile.nextInt();

            inputFile.nextLine(); //Consume buffer (I hate it)

            smokingStatus = inputFile.nextLine();

            //Tally up amountof smokers and non-smokers
            if(smokingStatus.equalsIgnoreCase("smoker")) {
                smoker += 1;
            }
            else {
                nonSmoker += 1;
            }

            holderHeight = inputFile.nextInt();
            holderWeight = inputFile.nextInt();

            if(inputFile.hasNext()) {
                inputFile.nextLine();
                inputFile.nextLine();
            }

            //Add to ArrayList
            policyList.add(new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight));
        } //End while loop

        inputFile.close(); //Close file

        //Output policyList elements
        for(int i = 0; i < policyList.size(); i++) { //Open for loop
            System.out.println("Policy number: " + policyList.get(i).getPolicyNum());
            System.out.println("Provider Name: " + policyList.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policyList.get(i).getHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policyList.get(i).getHolderLastName());
            System.out.println("Policyholder's Age: " + policyList.get(i).getHolderAge());
            System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + policyList.get(i).getSmokingStatus());

            
            System.out.println("Policyholder's Height: " + policyList.get(i).getHolderHeight());
            System.out.println("Policyholder's Weight: " + policyList.get(i).getHolderWeight());
            System.out.println();
        } //Close for loop

        //Output amount of smokers and non-smokers
        System.out.println("The number of policies with a smoker is: " + smoker);
        System.out.println("The number of policies with a non-smoker is: " + nonSmoker);
    } //End main
} //End class
