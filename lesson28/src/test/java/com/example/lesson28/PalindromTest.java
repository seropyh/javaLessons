package com.example.lesson28;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

import static com.example.lesson28.Palindrom.isPalindrom;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class PalindromTest {

    @Test
    @DisplayName("проверка пустой строки является ли палиндромом")
    void testPalindromIsNullString() throws Exception {
        var result = isPalindrom(null);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("проверка пустой строки является ли палиндромом")
    void testPalindromIsNullString1() throws Exception {
        var result = isPalindrom("");

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("проверка пустой строки является ли палиндромом")
    void testPalindromIsNullString2() throws Exception {
        var result = isPalindrom(" ");

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("проверка пустой строки является ли палиндромом")
    void testPalindromIsNullString3() throws Exception {
        var result = isPalindrom("шалаш");

        assertThat(result).isFalse();
    }
}

// 1 1 1 0 0 0
// 0 1 0 1 0 0
// 0 1 0 0 0 1


// 0 0 0 1 1 0 => 2
// 1 1 0 0 1 1 1 => 3
// 1 0 0 0 1 0 => 1
