package org.vistula.multiply;


import org.junit.Test;
import org.vistula.multiply2.Multiply2;

import static org.assertj.core.api.Assertions.assertThat;

public class MultiplyTest {

    @Test

    public void shouldCorrectlyMultiplyParameters(){
        assertThat(Multiply2.multiply(2, 3)).isEqualTo(6);
    }


}
