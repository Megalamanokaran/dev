public class squaremethod {

    unittest calc = new unittest();

    
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    
    public void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }

    
    public void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }

    
    public void testDivide() {
        assertEquals(2, calc.divide(6, 3));
    }

    
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
}
