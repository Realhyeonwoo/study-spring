package hello.typeconverter.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.junit.jupiter.api.Test;

import net.bytebuddy.asm.Advice.Local;

import static org.assertj.core.api.Assertions.*;

public class MyNumberFormatterTest {
	
	MyNumberFormatter formatter = new MyNumberFormatter();
	
	@Test
	void parse() throws ParseException {
		Number result = formatter.parse("1,000", Locale.KOREA);
		assertThat(result).isEqualTo(1000L);
	}
	
	@Test
	void print() {
		String result = formatter.print(1000, Locale.KOREA);
		assertThat(result).isEqualTo("1,000");
	}
}
