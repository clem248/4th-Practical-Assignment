package com.example.pracassign4;

import java.util.HashMap;
import java.util.Map;

public class Decryptor {
    public static String decryptText(String textForDecrypt, char[] arrDecryptLetters) {
        char[] arrEncryptText = new char[textForDecrypt.length()];
        char[] arrEncryptLetters = {'a', 'к', 'н', 'ы', 'л', 'р', 'т', 'е', 'у', 'б', 'д', 'о', 'п', 'и', 'й', 'г',
                                    'м', 'ө', 'с', 'ү', 'ж', 'ч', 'ш', 'э', 'з', 'ң', 'я', 'ю', 'ц', 'ё', 'х', 'ф'};
        Map<Character, Character> dictionary = new HashMap<Character, Character>();
        for (int i = 0; i < arrDecryptLetters.length; i++) {
            dictionary.put(arrDecryptLetters[i], arrEncryptLetters[i]);
        }
        for (int i = 0; i < textForDecrypt.length(); i++) {
            char c = textForDecrypt.charAt(i);
            char encryptedChar = dictionary.getOrDefault(c, c);
            arrEncryptText[i] = encryptedChar;
        }
        String decryptedText = new String(arrEncryptText);
        System.out.println(decryptedText);
        return decryptedText;
    }
}
