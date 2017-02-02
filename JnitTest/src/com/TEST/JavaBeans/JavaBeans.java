package com.TEST.JavaBeans;

import java.util.*;

public class JavaBeans {

	private int iValue;
	private boolean opState;
	private String fName;
	private String lName;
	private List<String> newList = new ArrayList<>();

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}

	public boolean isOpState() {
		return opState;
	}

	public void setOpState(boolean opState) {
		this.opState = opState;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public List<String> getNewList() {
		return newList;
	}

	public void setNewList(List<String> newList) {
		this.newList = newList;
	}

	public static void main(String[] args) {

	}

}
