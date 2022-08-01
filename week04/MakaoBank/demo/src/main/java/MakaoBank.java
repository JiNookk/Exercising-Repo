// 도메인 모델 : 계좌, 거래내역, 거래 결과 ...
// input -> output csv파일 만들것
// csv파일 읽어서 진행할 예정
// 계좌가 거래내역을 가지고 있나?
//      -> account = readFile()메서드로 바로 거래내역 변경
// 다른 데서 받아오면
//      -> List<Transaction> transactions = loadTransactions()
// 계좌 모델, 거래 모델
//      -> Account 만들기!
//      -> Transaction 만들기!
// null -> 객체없음 -> 위험하다.

import models.Account;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class MakaoBank {
    public static void main(String[] args){
        MakaoBank application = new MakaoBank();
        application.run();
    }

    private void run() {
        //준비
        Account account = new Account();

        //입력
        List<Transaction> transactions = loadTransactions();

        for (Transaction transaction : transactions){
            System.out.println(transaction);
        }

        //처리
//        List<TransactionResult> transactionResults = account.process(transactions)

        //출력
//        saveTransactionResults(transactionResults);
    }

    public List<Transaction> loadTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        return transactions;
    }
}
