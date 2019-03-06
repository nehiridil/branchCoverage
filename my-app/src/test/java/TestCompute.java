import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  
  @Test
  public void countTestSize0(){
	MessageQueue mq=mock(MessageQueue.class);
	c=new Compute(mq);
	Mockito.when(mq.size()==0).thenReturn(assertEquals(-1,c.countNumberOfOccurrences("1")));
	
  }
 
}