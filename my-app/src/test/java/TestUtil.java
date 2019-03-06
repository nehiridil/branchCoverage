import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void with1Arg(){ assertFalse(c.compute(1));}

  @Test
  public void withEvenArgs(){ assertFalse(c.compute(1,2));}

  @Test(expected=RuntimeException.class)
  public void whileArgIs0() throws RuntimeException{
  c.compute(0,1,2);}

  @Test
  public void testSum(){
  assertTrue(c.compute(1,2,3));
  }


}
