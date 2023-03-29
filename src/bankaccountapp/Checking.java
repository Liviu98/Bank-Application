package bankaccountapp;

public class Checking extends Account{

    //List properties specific to the checking account
    private int debitCardNumber;
    private int debitCardPIN;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSn, double initDeposit){
        super(name,sSn,initDeposit);
        accountNumber = "2" + accountNumber;
        setdebitCard();
    }

    public void setRate(){
        rate = getBaseRate() * .15;
    }


    //List any methods specific to the checkling account
    private void setdebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPIN =  (int)(Math.random() * Math.pow(10,4));
    }


    public void showInfo(){
        super.showInfo();
        System.out.println("Your checking account features" +
                "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card PIN: " + debitCardPIN);
    }
}
