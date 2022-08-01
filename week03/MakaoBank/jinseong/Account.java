public class Account {
    private long amount = 1000;

    public long getamount() {
        return amount;
    }

    public void tranfer(long transferAmount) {
        amount -= transferAmount;
    }
}
