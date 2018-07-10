package com.tool.utils;

public class CatchMultiException {

	   public static void main(String[] args) throws Exception {
	        try {
	            test(2);
	        } catch (Exception e) {
	            if (e instanceof TestAException || e instanceof TestBException
	                    || e instanceof TestCException) {
	                e.printStackTrace();
	            } else {
	                throw e;
	            }
	        }
	    }
	 
	    public static void test(int a) throws TestAException, TestBException,
	            TestCException {
	        if (a == 0) {
	            throw new TestAException();
	        }
	        if (a == 1) {
	            throw new TestBException();
	        }
	        if (a == 2) {
	            throw new TestCException();
	        }
	    }
	}
	 
	class TestAException extends Exception {
	    private static final long serialVersionUID = 1L;
	}
	 
	class TestBException extends Exception {
	    private static final long serialVersionUID = 1L;
	}
	 
	class TestCException extends Exception {
	    private static final long serialVersionUID = 1L;
	}