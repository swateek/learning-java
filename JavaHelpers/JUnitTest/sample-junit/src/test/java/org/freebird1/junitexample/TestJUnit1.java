package org.freebird1.junitexample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit1 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");    
      assertEquals(message, messageUtil.printMessage());     
   }
}