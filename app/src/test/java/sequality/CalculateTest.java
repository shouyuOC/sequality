package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2, 3), 0.1);
  }

  @Test
  public void testSumRange() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.SumRange(1, 10));
  }

  @Test
  public void testAveRange() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.AveRange(1, 10), 0.1);
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.SumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.SumEven(1, 10));
  }
}
