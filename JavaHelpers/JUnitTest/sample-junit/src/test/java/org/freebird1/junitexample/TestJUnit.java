package org.freebird1.junitexample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}