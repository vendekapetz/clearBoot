package service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathTest {
  @Test
  public void getSumTest(){
    assertEquals(new Math().getSum(4, 5), 9);
  }
}
