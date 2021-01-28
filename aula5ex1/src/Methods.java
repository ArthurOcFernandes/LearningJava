public class Methods {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.setAccNumber(1);
        b1.setAccType("cc");
        b1.setAccOwner("Maria Veronica");

        b1.AccOpen();
        b1.setDepositValue(50);
        b1.AccDeposit();
        b1.AccPayMonthly();
        b1.getAccBalance();
        b1.setWithdrawValue(35);
        b1.AccWithdraw();
        b1.setWithdrawValue(53);
        b1.AccWithdraw();
        b1.AccPayMonthly();
        b1.getAccBalance();
        b1.AccClose();
    }
}
