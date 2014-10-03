package com.tutorial.spring.dao_02._07SpringJDBCWithTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

public class SelectImple implements SelectInter{
		JdbcTemplate template;
		
		@Autowired
		public void setJt(JdbcTemplate template) {
			this.template = template;
		}
		
		/**
		 * 
		 */
		@Transactional(rollbackFor=RuntimeException.class)
		public boolean modifyDesignation(int no, String desig) {
			// TODO Auto-generated method stub
			String qry = "update employees set job_id = ? where employee_id = ?";
			int res = template.update(qry, new Object[]{desig, new Integer(no)});
			
			/*if(true){
				throw new RuntimeException();
			}*/
			
			if(res == 0)
				return false;
			else
				return true;
		}
		/*
		 * (non-Javadoc)
		 * @see com.tutorial.spring.dao_02._07SpringJDBCWithTransaction.SelectInter#registerEmp(int, java.lang.String, java.lang.String, int)
		 */
		@Transactional(rollbackFor=RuntimeException.class)
		public boolean registerEmp(int no, String name, String desg, int sal) {
			// TODO Auto-generated method stub
			String qry = "insert into employees(employee_id, first_name, job_id, salary) values(?, ?, ?, ?)";
			int res = template.update(qry, new Object []{new Integer(no), name, desg, new Integer(sal)});
			if(res == 0)
				return false;
			else	
				return true;
		}
}