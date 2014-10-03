package com.tutorial.spring.dao_02._07SpringJDBCWithTransaction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SelectClient {
	SelectInter select = null;
	ClassPathXmlApplicationContext ctx = null;
	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/dao_02/_07SpringJDBCWithTransaction/applicationContext.xml");
		select = (SelectInter) ctx.getBean("sel");
	}

	@After
	public void tearDown() throws Exception {
		ctx.close();
	}
	
	@Test
	public void modifyDesignation() throws Exception {
		boolean bool = select.modifyDesignation(177, "SH_CLERK");
		 System.out.println("Employee designation updated "+bool);
	}
}