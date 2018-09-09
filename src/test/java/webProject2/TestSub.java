package webProject2;

import com.Sub;

import junit.framework.TestCase;

public class TestSub extends TestCase 
{
	public void test() 
	{
		Sub sub=new Sub();
		int a=sub.subtract(20,10);
		assertEquals(10,a);

		

		
	}

}
