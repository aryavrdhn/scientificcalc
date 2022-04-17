package scientific_calc;
//import SciCal.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class My_Test {
    private static final double DELTA = 1e-15;
    My_Main calculator = new My_Main();
//TruePositive
	@Test
	public void test_root() {
		double actual=calculator.root(25.0);
		double exp=5.0;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact() {
		double actual=calculator.factorial(7);
		double exp=5040;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log() {
		double actual=calculator.log(149.256);
		double exp=5.005662952469698;
		assertEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power() {
		double actual=calculator.power(2.0,4.0);
		double exp=16.0;
		assertEquals(actual,exp, DELTA);
	}
//FalsePositive	
	@Test
	public void test_root2() {
		double actual=calculator.root(17.0);
		double exp=4.0;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_fact2() {
		double actual=calculator.factorial(6);
		double exp=120;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_log2() {
		double actual=calculator.log(245.256);
		double exp=4.978497702968366;
		assertNotEquals(actual,exp, DELTA);
	}
	@Test
	public void test_power2() {
		double actual=calculator.power(3.0,2.0);
		double exp=8.0;
		assertNotEquals(actual,exp, DELTA);
	}
}
