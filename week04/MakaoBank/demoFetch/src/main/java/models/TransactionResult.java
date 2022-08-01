// 거래 내역과 잔액을 들고있게 한다.
//      -> 또는 거래 내역을 참조하고 잔액만 들고 있는다. ( O )
//      -> 참조 : Type object = new Type() -> Type()을 참조하는 object
package models;

public class TransactionResult {

    private Transaction transaction;
    private int amount;

    public TransactionResult(Transaction transaction, int amount) {
        this.transaction = transaction;
        this.amount = amount;
    }

    public String[] values() {
        return new String[]{transaction.type(),transaction.amount().toString(), Integer.toString(amount)};
    }

    @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals (Object other) {
        TransactionResult otherTransactionResult = (TransactionResult) other;
        return this.transaction == otherTransactionResult.transaction && this.amount == otherTransactionResult.amount;
    }

    @Override
    public String toString() {
        return "TransactionResult(" + transaction.toString() + ", 잔액: " + amount + ")";
    }

    public String toCsvRow() {
        return transaction.type() + "," + transaction.amount() + "," + amount;
//        return String.join(",", values());
    }
}
