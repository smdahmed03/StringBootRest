package com.rest.beans;

import java.util.ArrayList;

public class StandardCalBean {
	
	double firstnum;
	double secondnum;
	//String operator;
	String operator;
	String mesgval;
	double totalval;
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getMesgval() {
		return mesgval;
	}
	public void setMesgval(String mesgval) {
		this.mesgval = mesgval;
	}
	
	
	public double getFirstnum() {
		return firstnum;
	}
	public void setFirstnum(double firstnum) {
		this.firstnum = firstnum;
	}
	public double getSecondnum() {
		return secondnum;
	}
	public void setSecondnum(double secondnum) {
		this.secondnum = secondnum;
	}
	public double getTotalval() {
		return totalval;
	}
	public void setTotalval(double totalval) {
		this.totalval = totalval;
	}

}
