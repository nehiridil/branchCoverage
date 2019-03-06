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
	when(mq.size()).thenReturn(0);
	assertEquals(-1,c.countNumberOfOccurrences("string"));
  }


  @Test
  public void countContains(){
	MessageQueue mq=mock(MessageQueue.class);
	c=new Compute(mq);
	when(mq.size()).thenReturn(-1);
	when(mq.contains("string")).thenReturn(false);
	assertEquals(0,c.countNumberOfOccurrences("string"));

  }

    @Test
  public void containsTrueTest(){
	MessageQueue mq=mock(MessageQueue.class);
	c=new Compute(mq);
	int counter=0;
	when(mq.size()).thenReturn(1);
	when(mq.contains("string")).thenReturn(true);
	when(mq.getAt(0)).thenReturn("string");
	assertEquals(1,c.countNumberOfOccurrences("string"));

  }

}
