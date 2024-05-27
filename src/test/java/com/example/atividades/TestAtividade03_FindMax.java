package com.example.atividades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestAtividade03_FindMax {
    private final Atividade03_FindMax atividade = new Atividade03_FindMax();

    @Test
    public void testFindMaxWithPositiveNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(5, atividade.findMax(numbers));
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(-1, atividade.findMax(numbers));
    }

    @Test
    public void testFindMaxWithEmptyList() {
        List<Integer> numbers = Arrays.asList();
        assertNull(atividade.findMax(numbers));
    }
}
