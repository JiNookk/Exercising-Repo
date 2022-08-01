package models;

import java.util.Objects;

public class Transaction {
    private final String type;
    private final int amount;

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    //TODO : 계좌의 거래 타입 (입금, 출금), 잔액필요

    @Override
    public boolean equals(Object other) {
        Transaction otherTransaction = (Transaction) other;
        return Objects.equals(this.type, otherTransaction.type) && this.amount == otherTransaction.amount;
    }
}
