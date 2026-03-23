package model.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BetAmountTest {
    @Test
    void 베팅_금액이_음수면_예외를_발생한다() {
        // given
        // when
        // then
        Assertions.assertThatThrownBy(() -> BetAmount.of(-1000))
                .isInstanceOf(IllegalArgumentException.class);
    }
}