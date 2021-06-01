package com.capg.spring;

import java.util.Iterator;
import java.util.List;

public class SBU {
	private int sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee> empList;
	public int getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(int sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void getEmployees(){  
		System.out.println("SBU Details : ");
		System.out.println("sbuCode="+sbuCode+", sbuHead="+sbuHead+", sbuName="+sbuName);
	    //System.out.println(id+" "+name);  
	    System.out.println("Employee Details : ");  
	    Iterator<Employee> itr=empList.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	@Override
	public String toString() {
		return "SBU Details :  SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}
	

}
