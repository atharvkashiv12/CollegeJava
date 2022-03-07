import java.util.Scanner;
class NumberToWords{
	public static void main(String[]args){
        int a,sum=0;
	    Scanner sc = new Scanner(System.in);  
	    System.out.print("Enter the first number:");  
          a = sc.nextInt();  
        while(a!=0)
        { 
            int r = a%10;
            sum= sum*10+r;
            a=a/10;
        }
        while(sum!=0)
        {
            switch(sum%10)
                {
                    case 0:  System.out.print("zero ");break;
                    case 1: System.out.print("one ");break;
                    case 2:  System.out.print("two ");break;
                    case 3:  System.out.print("three ");break;
                    case 4:  System.out.print("four ");break;
                    case 5: System.out.print("five ");break;
                    case 6:  System.out.print("six ");break;
                    case 7: System.out.print("seven ");break;
                    case 8: System.out.print("eight ");break;
                    case 9:  System.out.print("nine ");break;
                    default: System.out.print("invalid number");break;
                }
            sum=sum/10;
        }
    }
}
