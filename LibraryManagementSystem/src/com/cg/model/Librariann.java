package com.cg.model;

public class Librariann {
	
		private static int Lid;
		private static String Lname;
		private static String Address;
		private static int Numbers;
	    
		public Librariann() {
			super();
			// TODO Auto-generated constructor stub
			
		}
		public int getLid() {
			return Lid;
		}
		public void setLid(int lid) {
			Lid = lid;
		}
		public String getLname() {
			return Lname;
		}
		public void setLname(String lname) {
			Lname = lname;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getNumbers() {
			return Numbers;
		}
		public void setNumbers(int numbers) {
			Numbers = numbers;
		}
		@Override
		public String toString() {
			return "Librarian [Lid=" + Lid + ", Lname=" + Lname + ", Address=" + Address + ", Number=" + Numbers + "]";
		}
		
			
	}


