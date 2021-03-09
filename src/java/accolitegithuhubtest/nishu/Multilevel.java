package accolitegithuhubtest.nishu;
class Animals{  
void eat(){System.out.println("eating");}  
}  
class Dogs extends Animal{  
void bark(){System.out.println("barking");}  
}  
class BabyDog extends Dogs{  
void weep(){System.out.println("weeping");}  
}  
public class Multilevel{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}} 