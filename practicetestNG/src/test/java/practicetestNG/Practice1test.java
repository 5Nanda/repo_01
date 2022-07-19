package practicetestNG;

import org.testng.annotations.Test;

public class Practice1test{
	
@Test
public static void test() {
	System.out.println("Test_01");
	String BROWSER = System.getProperty("browser");
	System.out.println(BROWSER);
}
}