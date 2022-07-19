package practicetestNG;

import org.testng.annotations.Test;

public class Practice3Test {
	@Test
	public static void test() {
		System.out.println("Test_03");
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
	}
}
