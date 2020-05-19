package com.bilgeadam.constructor;

public class YeniInsan {
	
	public Kafa k=null;
	public String ad=null;
	public String soyad=null;
	
	public YeniInsan()
	{
		
	}
	
	public YeniInsan(String adi,String soyadi,Kafa kafa)
	{
		ad=adi;
		soyad=soyadi;
		k=kafa;
	}
	
	public void EkranaYaz()
	{
		System.out.println("Kisinin adi: "+ad+" Soyadi: "
	                        +soyad+" Goz rengi: "+k.g.Rengi+" Kulagi: "
				            +k.k.Tip+" Burnu: "+k.b.Tip);
	}

}
