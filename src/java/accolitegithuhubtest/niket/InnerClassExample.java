package java.accolitegithuhubtest.niket;

public class InnerClassExample {
    static int var1=0;
    private int var2=10;

    static  class StaticClassExample{
        StaticClassExample(){
            System.out.println("Static Inner Class (Static) "+var1);
        }
    }

    class MemberInnerClass{
        MemberInnerClass(){
            System.out.println("Member Inner Class "+var2);
            System.out.println("Member Inner Class (Static) "+var1);
        }
    }

    void msg(){
        class LocalInnerClass{

            LocalInnerClass(){
                System.out.println("Local Inner Class "+var1);
                System.out.println("Local Inner Class (Static) "+var2);
            }
        }
        LocalInnerClass localInnerClass= new LocalInnerClass();

    }

    public static  void main(String[] args){

        InnerClassExample.StaticClassExample staticClassExample= new StaticClassExample();// Static Inner Class

        InnerClassExample innerClassExample= new InnerClassExample();
        InnerClassExample.MemberInnerClass memberInnerClass=  innerClassExample.new MemberInnerClass();// Member Inner Class

        innerClassExample.msg();







    }
}
