package com.test;

public class StringImmutable {

	public static void main(String[] args) {
              
               String string1="string is";
               String string2="Immutable";
               string1.concat (string2);
               System.out.println("string is: "+string1);
              }

            }

  /*String st1 = "maha";  
String st2 = "maha";  
System.out.println("Before Modification");
System.out.println(st1==st2);
System.out.println(st1.hashCode()+"="+st2.hashCode());
 st1 += "shanmugam";    
System.out.println("After Modification");  
System.out.println(st1==st2);
   System.out.println(st1.hashCode()+"!="+st2.hashCode());
	}
}*/