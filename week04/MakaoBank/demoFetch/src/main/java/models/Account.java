package models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int amount = 0;

    //TODO : 계좌의 잔액관리!!
    public List<TransactionResult> process(List<Transaction> transactions) {
        List<TransactionResult> transactionResults = new ArrayList<>();

        for (Transaction transaction : transactions) {
            amount = transaction.process(amount);
            //account의 amount에 상관 없이 transaction의 amount를 받아와서 account.amount에 저장 -> 입금은 따로 처리

            TransactionResult transactionResult =
                    new TransactionResult(transaction, amount);
            transactionResults.add(transactionResult);
        }
        return transactionResults;
    }


}
