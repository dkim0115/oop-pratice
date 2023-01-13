package org.example;

/* 1. 비밀번호는 최소 8자 이상 12자 이하여야 한다.
       2. 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
       3. 경계조건에 대해 테스트 코드를 작성해야 한다.*/

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {

    @DisplayName("The password must be at least 8 characters and not more than 12 characters in order to avoid exception.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() ->PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }
    @DisplayName("If a password less than 8 words and more than 12 words, IllegalArgument Exception takes place.")
    @ParameterizedTest
    @ValueSource(strings = {"aaaaaaa","aaaaaaaaaaaaa"})
    void validatePasswordTest2(String password) {
        assertThatCode(() ->PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("password should be more than 8 words and less than 12 words.");
    }

}
