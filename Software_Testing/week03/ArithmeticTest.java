package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import software.SimpleArithmetic;

public class ArithmeticTest {  
  
 	  	@Test  
 	  	   public void testAddPass() {  
 	  		// assertEquals( long expected, long actual, String message)         
  			assertEquals(4, SimpleArithmetic.add2no(1, 3),"error in add()");         
 	  		assertEquals(-3, SimpleArithmetic.add2no(-1, -2),"error in add()");         
 	  		assertEquals(9, SimpleArithmetic.add2no(9, 0),"error in add()");  
 	  	   }  
  	  
 	  	@Test  
 	  	   public void testAddFail() {  
 	  		// assertNotEquals(long expected, long actual, String message)   	      
 	  		assertNotEquals(0, SimpleArithmetic.add2no(1, 2),"error in add()");  
 	  	   }  
  	  
 	  	@Test  
	  	   public void testSubPass() {   	      
 	  		assertEquals(1, SimpleArithmetic.sub2no(2, 1),"error in sub()");   	      
 	  		assertEquals(-1, SimpleArithmetic.sub2no(-2, -1),"error in sub()");         
 	  		assertEquals(0, SimpleArithmetic.sub2no(2, 2),"error in sub()");  
 	  	   }  
  	  
 	  	@Test  
 	  	   public void testSubFail() {  
 	  	      assertNotEquals(0, SimpleArithmetic.sub2no(2, 1),"error in sub()");  
 	  	   }  
  
}  
