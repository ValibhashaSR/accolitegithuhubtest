class CustomExceptionExample extends Exception{
    CustomExceptionExample(String s){
        super(s);
        System.out.println(s);

    }
}

public class CustomException {
    public static void  main(String[] args) throws CustomExceptionExample{
        String name="Niket";
        if(!name.equals("Naman")){
            throw new CustomExceptionExample("Not Matached");
        }
    }
}

