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
	                public void test2()
                {
                                Sub s=new Sub();
                                int result2=s.subtract(500, 100);
                                assertEquals(400,result2);
                                
                }
                public void test3()
                {
                                Multiplication m1=new Multiplication();
                                int result3=m1.mul(24, 2);
                                assertEquals(48,result3);
                }
                public void test4()
                {
                                Div d1=new Div();
                                int result4=d1.division(500, 10);
                                assertEquals(50,result4);
                }



}
