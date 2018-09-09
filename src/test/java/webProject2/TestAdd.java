package webProject2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Add;

public class TestAdd {

	@Test
	public void test() 
	{
		Add ad=new Add();
		int a=ad.addition(22, 11);
		assertEquals(33,a);
		
	}

}
