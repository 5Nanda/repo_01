package practicetestNG;

import org.testng.annotations.Test;

public class Practice4Test {
 @Test(priority = 1)
	public static void test() {
	 
	System.out.println("Test_04- Priority -01");
 }
@Test(priority = 2)
	public static void test1() {
	System.out.println("Test_04- Priority -02");
		}
@Test(priority = 3)
    public static void test3() {
	System.out.println("Test_04- Priority -02");
		}	
	
}
