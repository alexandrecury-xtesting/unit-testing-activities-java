package com.example.atividades;

import java.util.List;
import java.util.Collections;

public class Atividade03_FindMax {
    public Integer findMax(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        return Collections.max(numbers);
    }
}
