package models;

import java.util.Objects;

public class Transaction {
    private final String type;
    private final int amount;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }
    //TODO : 거래 정보 관리 필요! (입금, 출금 여부 + 금액?)

    @Override
    public boolean equals (Object other) {
        Transaction otherTransaction = (Transaction) other;
        return Objects.equals(this.type, otherTransaction.type) && this.amount == otherTransaction.amount;

    }

}
