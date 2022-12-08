package data;

import org.testng.annotations.Test;

public class Testrunner {
	@Test(dataProvider="login",dataProviderClass = Customizedp.class)
	public void test1(String email,String pwd)
	{
		System.out.println(email+"  "+pwd);
	}

}
