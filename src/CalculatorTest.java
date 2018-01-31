public class CalculatorTest {
public void testAdd() {
		Calculator cal = new Calculator();
		
		assertEquals(cal.add(50,10),60);
	}
	

	public void testMinus() {
		Calculator cal = new Calculator();
		assertEquals(cal.minus(50,10),40);
	
	}

	public void testMultiply() {
		Calculator cal = new Calculator();
		assertEquals(cal.multiply(50,10),500);
	}


	private void assertEquals(int multiply, int i) {
		// TODO Auto-generated method stub
		
	}

}