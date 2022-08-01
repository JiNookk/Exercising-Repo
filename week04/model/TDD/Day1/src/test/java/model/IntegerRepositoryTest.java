package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerRepositoryTest {
    @Test
    void creation(){
        IntegerRepository integerRepository =new IntegerRepository();

        assertEquals(new int[0], integerRepository.getAbsolutes());
    }

}