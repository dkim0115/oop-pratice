package org.example;

/* 1. 비밀번호는 최소 8자 이상 12자 이하여야 한다.
       2. 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생 시킨다.
       3. 경계조건에 대해 테스트 코드를 작성해야 한다.*/

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {

    @DisplayName("password should be more than 8 words and less than 12 words in order to avoid exception.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() ->PasswordValidator.validate("serverwizard"))
                .doesNotThrowAnyException();
    }
    @DisplayName("If a password")
    @Test
    void name() {
    }
}
