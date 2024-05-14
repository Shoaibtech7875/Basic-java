package com.Inheritence;

class Animal1{  
void eat(){System.out.println(" eating...");}  
} 

class Dog1 extends Animal{  
void bark(){System.out.println(" barking...");}  
}  

class Cat1 extends Animal{  
void meow(){System.out.println(" meowing...");}  
}  

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Cat1 cat=new Cat1();
		cat.eat();
		cat.meow();

	}

}
