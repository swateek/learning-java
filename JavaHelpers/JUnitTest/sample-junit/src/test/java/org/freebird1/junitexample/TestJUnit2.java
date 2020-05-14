package org.freebird1.junitexample;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJUnit2 {

   String message = "Robert";	
   MessageUtil messageUtil = new MessageUtil(message);
 
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message, messageUtil.salutationMessage());
   }
}