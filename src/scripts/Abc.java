package scripts;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import generic.BaseTest;

public class Abc extends BaseTest{
	@Test
	public void testAbc(){
		
		Logger l = LogManager.getLogger(Abc.class.getName());	
		
		l.fatal("shashank u didnt created any line here");
	}

}
