public class Account {
    private long amount = 100000;
    private final String number = "302-1043-9642-31";

    public long getAmount() {
        return amount;
    }


    public void transfer(String transferAmount) {
        amount -= Long.parseLong(transferAmount);
    }

    public String getNumber() {
        return number;
    }
}
