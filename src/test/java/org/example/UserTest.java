package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @DisplayName("It tested that the password is initialized.")
    @Test
    void passwordTest() {
        // given
        User user = new User();

        // when
        user.initPassword(()->"abcdefgh");

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("It tested that the password is not initialized.")
    @Test
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(()->"ab");

        // then
        assertThat(user.getPassword()).isNull();
    }
}