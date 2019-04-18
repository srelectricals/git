package com.cg.model;

public class Lendingg
{
	private static int Mem_ID;
	private static int LibId;
	private static String LndDate;
	private static String Book_ID1;
	private static String Book_ID2;
	private static String Book_ID3;
	private static String Book_ID4;
	private static String Book_ID5;
	private static String RtrnDate;

	public Lendingg() {
	super();
		// TODO Auto-generated constructor stub
	}
	
	public int getMem_ID() {
		return Mem_ID;
	}

	public void setMem_ID(int mem_ID) {
		Mem_ID = mem_ID;
	}

	public int getLibId() {
		return LibId;
	}
	public void setLibId(int libId) {
		LibId = libId;
	} 
	public String getLndDate() {
		return LndDate;
	}
	public void setLndDate(String date) {
		LndDate = date;
	}
	public String getBook_ID1() {
		return Book_ID1;
	}
	public void setBook_ID1(String book_ID1) {
		Book_ID1 = book_ID1;
	}
	public String getBook_ID2() {
		return Book_ID2;
	}
	public void setBook_ID2(String book_ID2) {
		Book_ID2 = book_ID2;
	}
	public String getBook_ID3() {
		return Book_ID3;
	}
	public void setBook_ID3(String book_ID3) {
		Book_ID3 = book_ID3;
	}
	public String getBook_ID4() {
		return Book_ID4;
	}
	public void setBook_ID4(String book_ID4) {
		Book_ID4 = book_ID4;
	}
	public String getBook_ID5() {
		return Book_ID5;
	}
	public void setBook_ID5(String book_ID5) {
		Book_ID5 = book_ID5;
	}
	
    public String getRtrnDate() {
		return RtrnDate;
	}

	public  void setRtrnDate(String rtrnDate) {
		RtrnDate = rtrnDate;
	}

	@Override
	public String toString() {
		return "Lending [Mem_ID=" + Mem_ID + ", LibId=" + LibId + ", LndDate=" + LndDate + ", Book_ID1=" + Book_ID1
				+ ", Book_ID2=" + Book_ID2 + ", Book_ID3=" + Book_ID3 + ", Book_ID4=" + Book_ID4 + ", Book_ID5="
				+ Book_ID5 + ", RtrnDate=" + RtrnDate + "]";
	}
	
	}
