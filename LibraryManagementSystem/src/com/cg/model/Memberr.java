package com.cg.model;



public class Memberr {
	
	   private static int Mem_ID1;
	   private static String Name;
	   private static String Address;
	   private static String Gender;
	   private static String DOB;
	   private static String DOJ;
       private static String PhnNo;
	public Memberr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMem_ID1() {
		return Mem_ID1;
	}

	public void setMem_ID1(int str1) {
		Mem_ID1 = str1;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String doj2) {
	    DOJ = doj2;
	    }
	
   public String getPhnNo() {
		return PhnNo;
	}

	public void setPhnNo(String phnNo) {
		PhnNo = phnNo;
	}

	@Override
	public String toString() {
		return "Memberr [Mem_ID=" + Mem_ID1 + ", Name=" + Name + ", Address=" + Address + ", Gender=" + Gender + ", DOB="
				+ DOB + ", DOJ=" + DOJ + ", PhnNo=" + PhnNo + "]";
	}

	
	

	
	} 
  


