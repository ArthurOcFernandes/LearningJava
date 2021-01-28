public class BankAccount {
    public int AccNumber;
    protected String AccType;
    private String AccOwner;
    private float AccBalance;
    private boolean AccStatus;
    protected float DepositValue;
    public float WithdrawValue;

    public BankAccount() {
        this.AccStatus = false;
        this.AccBalance = 0;
    }

    public int getAccNumber() {
        return this.AccNumber;
    }

    public void setAccNumber(int accNumber) {
        AccNumber = accNumber;
    }

    public String getAccType() {
        return this.AccType;
    }

    public void setAccType(String accType) {
        AccType = accType;
    }

    public String getAccOwner() {
        return this.AccOwner;
    }

    public void setAccOwner(String accOwner) {
        AccOwner = accOwner;
    }

    public void getAccBalance() {
        System.out.println("Account Balance: " + AccBalance);
    }

    public void setAccBalance(float accBalance) {
        AccBalance = accBalance;
    }

    public boolean isAccStatus() {
        return this.AccStatus;
    }

    public void setAccStatus(boolean accStatus) {
        AccStatus = accStatus;
    }

    public float getDepositValue() {
        return this.DepositValue;
    }

    public void setDepositValue(float depositValue) {
        DepositValue = depositValue;
    }

    public float getWithdrawValue() {
        return this.WithdrawValue;
    }

    public void setWithdrawValue(float withdrawValue) {
        WithdrawValue = withdrawValue;
    }

    public void AccOpen() {
        if (this.AccType == "cc") {
            this.AccStatus = true;
            this.AccBalance = this.AccBalance + 50;
            System.out.println("Account opened");
        } else if (this.AccType == "cp") {
            this.AccStatus = true;
            this.AccBalance = this.AccBalance + 150;
            System.out.println("Account opened");
        } else System.out.println("Error! Bank account can only be cp  or cc.");
    }

    public void AccClose() {
        if (this.AccBalance == 0 && this.AccStatus == true) {
            this.AccStatus = false;
            System.out.println("Your account has been closed");
        } else if (this.AccBalance < 0) {
            System.out.println("Your account couldn't be closed due your debts with the bank. Please make sure you've got no debts and try again.");
        } else if (this.AccBalance > 0) {
            System.out.println("Your account couldn't be closed because there's still money deposited. Please make sure you've withdrawn all the money and try again.");
        }

    }

    public void AccDeposit() {
        if (this.AccStatus == true && this.DepositValue > 0) {
            this.AccBalance = this.AccBalance + DepositValue;
            System.out.println("New balance: " + this.AccBalance + " Reais");
        } else {
            System.out.println("Your deposit couldn't be completed. Check if your account status is open and your deposit value");
        }
    }

    public void AccWithdraw() {
        if (this.AccStatus == true) {
            if (this.AccBalance >= 0) {
                this.AccBalance = this.AccBalance - this.getWithdrawValue();
                if (this.AccBalance < 0) {
                    this.AccBalance = this.AccBalance + this.getWithdrawValue();
                    System.out.println("Operation couldn't be completed. You don't have enough money on your account.");
                } else {
                    System.out.println("New balance: " + this.AccBalance);}
                }
        }else {
            System.out.println("Error! You can't withdraw money from a closed account");
        }
    }

    public void AccPayMonthly() {
        if (this.AccType == "cc") {
            this.AccBalance = this.AccBalance - 12;
        } else {
            this.AccBalance = this.AccBalance - 20;
        }
    }
}
