public class Policy {
    private String policyNum;
    private String providerName;
    private String holderFirstName, holderLastName;
    private int holderAge;
    private String smokingStatus;
    private int holderHeight, holderWeight;

    //No Arg
    public Policy() {

    }

    public Policy(String policyNum, String providerName, String holderFirstName, String holderLastName, int holderAge, String smokingStatus, int holderHeight, int holderWeight) {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.holderFirstName = holderFirstName;
        this.holderLastName = holderLastName;
        this.holderAge = holderAge;
        this.smokingStatus = smokingStatus;
        this.holderHeight = holderHeight;
        this.holderWeight = holderWeight;
    }

    public String getPolicyNum() {
        return policyNum;
    }

    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getHolderFirstName() {
        return holderFirstName;
    }

    public void setHolderFirstName(String holderFirstName) {
        this.holderFirstName = holderFirstName;
    }

    public String getHolderLastName() {
        return holderLastName;
    }

    public void setHolderLastName(String holderLastName) {
        this.holderLastName = holderLastName;
    }

    public int getHolderAge() {
        return holderAge;
    }

    public void setHolderAge(int holderAge) {
        this.holderAge = holderAge;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public int getHolderHeight() {
        return holderHeight;
    }

    public void setHolderHeight(int holderHeight) {
        this.holderHeight = holderHeight;
    }

    public int getHolderWeight() {
        return holderWeight;
    }

    public void setHolderWeight(int holderWeight) {
        this.holderWeight = holderWeight;
    }
}
