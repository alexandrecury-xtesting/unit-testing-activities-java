package com.example.atividades;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class TestAtividade02_IsEven {
    private final Atividade02_IsEven atividade = new Atividade02_IsEven();

    @Test
    public void testIsEvenWithEvenNumber() {
        assertTrue(atividade.isEven(4));
    }

    @Test
    public void testIsEvenWithOddNumber() {
        assertFalse(atividade.isEven(5));
    }

    @Test
    public void testIsEvenWithZero() {
        assertTrue(atividade.isEven(0));
    }
}
