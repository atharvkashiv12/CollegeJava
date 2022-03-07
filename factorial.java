class Factorial
{
    public static void main(String[]args)
    {
        int n=5,f=1;
        while(n!=1)
        {
            f=f*n--;
        }
        System.out.println(f);
    }
}