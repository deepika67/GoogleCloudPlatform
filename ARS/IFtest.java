import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IFtest {

	@Test
	void test() {
		InternationalFlight df = new InternationalFlight(null);
		String result = df.Iflight("Economic");
		assertEquals("Economic",result);
		}

	@Test
	void test1() {
		InternationalFlight df = new InternationalFlight(null);
		String result = df.Iflight("Buisness");
		assertEquals("Buisness",result);
		}

}
