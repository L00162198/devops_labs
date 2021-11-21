package addition;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class junit_test {

	@Test
	public void testaddition() {
	

		{
			myaddition myaddition = new myaddition ();
			
			String result = myaddition.concatenate("one","two");
			
			assertEquals("onetwo", result);
			
		}
		
	
		
	}

}
