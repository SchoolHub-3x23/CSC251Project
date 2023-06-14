import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        String policyNum;
        String providerName;
        String holderFirstName, holderLastName;
        int holderAge;
        String smokingStatus;
        int holderHeight, holderWeight;
        ArrayList<Policy> policy = new ArrayList<Policy>();

        //Opening file
        File file = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(file);

        //Check if we can even find the file
        if(!file.exists()) {
            System.out.println("Unable to find file");
            System.exit(0);
        }

        while(inputFile.hasNext()) {
            policyNum = inputFile.nextLine();
            providerName = inputFile.nextLine();
            holderFirstName = inputFile.nextLine();
            holderLastName = inputFile.nextLine();
            holderAge = inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            holderHeight = inputFile.nextInt();
            holderWeight = inputFile.nextInt();

            if(inputFile.hasNext()) {
                inputFile.nextLine();
            }//End if
            
            //Add to ArrayList
            policy.add(new Policy(policyNum, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight));
        } //End while loop

        inputFile.close(); //Close file

        

    } //End main
} //End class
