package com.shiyanlou;




public class People {
   int height = 0;
   int age = 0;
   String sex;        //ÊôĞÔ
   
   void laugh() {
	   System.out.println("I'm laughing");
   }
   
   void cry() {
	   System.out.println("I'm crying");
   }
   
   boolean qualification(int age,int height) {
	   boolean result = false;
	   if(age+height>200) result = true;
	   return result;
   }
}

