package com.example.atividades;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestAtividade04_SortNumbers {
    private final Atividade04_SortNumbers atividade = new Atividade04_SortNumbers();

    @Test
    public void testSortNumbersWithUnsortedList() {
        List<Integer> numbers = Arrays.asList(3, 1, 2);
        assertEquals(Arrays.asList(1, 2, 3), atividade.sortNumbers(numbers));
    }

    @Test
    public void testSortNumbersWithMixedList() {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), atividade.sortNumbers(numbers));
    }

    @Test
    public void testSortNumbersWithEmptyList() {
        List<Integer> numbers = Arrays.asList();
        assertEquals(Arrays.asList(), atividade.sortNumbers(numbers));
    }
}
