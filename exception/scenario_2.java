import java.util.Scanner;

class DivisiblebyFiveException extends Exception{
    DivisiblebyFiveException(String s)
    {
        super(s);
    }
}
public class scenario_2 {
    static void fun(int n) throws DivisiblebyFiveException
    {
        if(n%5==0)
        {
            throw new DivisiblebyFiveException("number not divi by 5");
        }
        else{
            System.out.println("valid number");
        }


    }
    public static void main(String[] args)  throws DivisiblebyFiveException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fun(n);
    }
}
