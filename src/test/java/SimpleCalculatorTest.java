import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SimpleCalculatorTest {
    @Test
    @DisplayName("1+2=3")
    public void t1(){
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(1, 2);

        assertThat(rs).isEqualTo(3);


    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2(){
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.plus(2, 10);

        assertThat(rs).isEqualTo(12);
    }

    @Test
    @DisplayName("2 * 10 = 20")
    public void multiply(){
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.multiply(2, 10);

        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("20- 10 = 10")
    public void minus(){
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.minus(20, 10);

        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("20 / 10 = 2")
    public void divide(){
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.divide(20, 10);

        assertThat(rs).isEqualTo(2);
    }

    @Test
    @DisplayName("28 / 10 = 8")
    public void remainder(){
        SimpleCalculator calculator = new SimpleCalculator();
        int rs = calculator.remainder(28, 10);

        assertThat(rs).isEqualTo(8);
    }


}
