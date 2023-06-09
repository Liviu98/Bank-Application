package bankaccountapp;

public class Savings extends Account{

    //List properties specific to the Savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    //Constructor to initialize settings for the Saavings properties
    public Savings(String name, String sSN, double initDeposit) {
        super(name,sSN,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }



    // List any methods specific to savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Savings Account Features" +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );

    }
}
