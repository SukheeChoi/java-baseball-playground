package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringCalculratorTest {
    StringCalculator cal;

    @BeforeEach
    public void setUp()  {
        cal = new StringCalculator();
    }

	@Test
	void calculateTest() {
		assertThat(cal.calculate(new String[]{"1", "+", "1"})).isEqualTo(2);
		assertThat(cal.calculate(new String[]{"1", "*", "1", "-", "5"})).isEqualTo(-4);
		assertThat(cal.calculate(new String[]{"1", "/", "1", "/", "10"})).isEqualTo(0.1);
	}

}
