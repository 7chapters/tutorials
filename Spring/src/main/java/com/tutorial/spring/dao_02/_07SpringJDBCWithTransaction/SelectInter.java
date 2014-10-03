package com.tutorial.spring.dao_02._07SpringJDBCWithTransaction;

public interface SelectInter {
	boolean registerEmp(int no, String name, String desg, int sal);
	boolean modifyDesignation(int no, String newDesig);
}