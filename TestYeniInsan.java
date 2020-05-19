package com.bilgeadam.constructor;

public class TestYeniInsan {

	public static void main(String[] args) {
		
		Goz  g=new Goz ("Qara");
		
		Kulak k=new Kulak("Kepce");
		
		Burun b=new Burun("Kemer");
		
		Kafa kafa =new Kafa (g,k,b);
		
		YeniInsan  y=new YeniInsan("Elchin","Gudratli",kafa);
		y.EkranaYaz();

	}

}
