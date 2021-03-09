package java.accolitegithuhubtest.niket;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class ExceptionExample {

    public static void main(String[] args) throws ArithmeticException{
        try {
            int a = 50 / 0;
            //int b=10;

        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("It always execute");
            int age =10;
            if(age<=17){
                throw new ArithmeticException("Not eligible to vote");
            }
            else{
                System.out.println("Run");
            }


        }
    }
}
