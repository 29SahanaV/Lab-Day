package com.labday;

import java.util.ArrayList;

public class electronicsShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		electronics e1=new electronics(121,"volts","Siemens",2080);
		electronics e2=new electronics(122,"diode","panasonic",5000);
		electronics e3=new electronics(123,"vaccum tube","crompton",1150);
		electronics e4=new electronics(124,"transistor","bosch",1480);
		electronics e5=new electronics(125,"sensor","voltas",4100);
		electronics e6=new electronics(126,"switche","orient",3650);
		
		ArrayList<electronics> a1=new ArrayList<electronics>();
		a1.add(e6);
		a1.add(e5);
		a1.add(e4);
		a1.add(e3);
		a1.add(e2);
		a1.add(e1);
		
		a1.stream().filter(ele->ele.elePrice<3000)
		    .forEach(ele->{System.out.println(ele.eleCompany  + " " +  ele.eleName +  " is " +  ele.elePrice);});
	}

}
