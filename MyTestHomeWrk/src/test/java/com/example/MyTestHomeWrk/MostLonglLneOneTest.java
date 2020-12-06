package com.example.MyTestHomeWrk;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static com.example.MyTestHomeWrk.MostLonglLneOne.MaxLineOne;
import static org.assertj.core.api.Java6Assertions.assertThat;


@ExtendWith(SpringExtension.class)
public class MostLonglLneOneTest {
    @Test
    @DisplayName("Cтрока  нулевая")
    void maxLineOneIsNullString() {
        var result = MaxLineOne(null);
        assertThat(result).isEqualTo(-1);
    }
    @Test
    @DisplayName("Cтрока  пробел")
    void maxLineOneIsSpaceString() {
        var result = MaxLineOne(" ");
        assertThat(result).isEqualTo(-1);
    }
    @Test
    @DisplayName("Cтрока  с посторонними символами")
    void maxLineOneIsOtherSymbString() {
        var result = MaxLineOne("0-1");
        assertThat(result).isEqualTo(-2);
    }
    @Test
    @DisplayName("Cтрока нормальная 3")
    void maxLineOneIsCorrectString() {
        var result = MaxLineOne("001001100111");
        assertThat(result).isEqualTo(3);
    }
    @Test
    @DisplayName("Cтрока  нормальная 0")
    void maxLineOneIsCorrectString1() {
        var result = MaxLineOne("00000");
        assertThat(result).isEqualTo(0);
    }
    @Test
    @DisplayName("Cтрока  нормальная 5")
    void maxLineOneIsCorrectString2() {
        var result = MaxLineOne("11111");
        assertThat(result).isEqualTo(5);
    }
}
