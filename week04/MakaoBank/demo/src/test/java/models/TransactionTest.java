// 거래 정보 만들기
// 거래 정보 비교하기
// 잔액 변동?
// 잔액 변하게 한 결과 도출
// 비교할 때 두가지 개념
// 1. 동일 -> 둘이 같은 객체 (같은 식별자) 소크라테스 != 플라톤
// 2. 동등 -> 같진 않지만 같다고 취급하고 싶다. (상태가 같으면 같다고 하자!) -> 값 객체
//      -> equals 오버라이딩을 진행하자.

package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {
    @Test
    void creation() {
        Transaction transaction = new Transaction("입금", 1000);
    }

    @Test
    void equals() {
        Transaction transaction1 = new Transaction("입금", 1000);
        Transaction transaction2 = new Transaction("입금", 1000);

        assertEquals(transaction1, transaction2);
    }

}