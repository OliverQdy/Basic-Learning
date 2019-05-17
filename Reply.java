package com.shiyanlou;

public class Reply {
	public static void main(String[] args) {
	    People dy = new People();
	    dy.height = 175;
	    dy.age = 26;
	    dy.sex = "boy";
	    
	    dy.cry();
	    boolean a = dy.qualification(dy.age, dy.height);
	    System.out.println(a);
	    if(a == true)
	    System.out.println("This"+dy.sex+"is qualified!");
	    }
}
