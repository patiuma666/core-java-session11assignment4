package assignment11; //here package name

import java.io.IOException;

public class ExceptionDemo { //here 

 void show() throws ArithmeticException {
    System.out.println("parent class");
    }
}

 class Child extends ExceptionDemo {
         void show() throws IOException {      		//Cmpile time Error  	  
  
	  System.out.println("child class");
	  } 

   public static void main(String[]args){
 
  try {
   ExceptionDemo sub=new Child();
      sub.show();
   }
  catch(Exception e){
	  
  }
 }  
}