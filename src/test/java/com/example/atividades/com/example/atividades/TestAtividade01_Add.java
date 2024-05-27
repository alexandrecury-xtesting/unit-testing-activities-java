package com.example.atividades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestAtividade01_Add {
    private final Atividade01_Add atividade = new Atividade01_Add();

    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, atividade.add(2, 3));
    }

    @Test
    public void testAddNegativeAndPositive() {
        assertEquals(0, atividade.add(-1, 1));
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-2, atividade.add(-1, -1));
    }
}
