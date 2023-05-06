package com.example.pracassign4;

import java.util.*;

public class CountLetters {
    public char[] LetterCounter(String text) {
        // создаем карту для подсчета количества встреченных букв
        Map<Character, Integer> letterCounts = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetter(c)) {
                letterCounts.put(c, letterCounts.getOrDefault(c, 0) + 1);
            }
        }
        // создаем список для хранения записей из карты
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(letterCounts.entrySet());
        // сортируем список по значению количества в убывающем порядке
        Collections.sort(entryList, Map.Entry.<Character, Integer>comparingByValue().reversed());
        // создаем массив символов и заполняем его отсортированными символами из списка
        char[] result = new char[entryList.size()];
        for (int i = 0; i < entryList.size(); i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }
}
