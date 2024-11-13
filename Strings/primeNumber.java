package JavaPrograms.Strings;

public class primeNumber {

    public static void main(String[] args)
    {
        int num=8;
        boolean flag = false;
        //0 and 1 are not prime numbers
        if(num ==0||num==1)
        {
            flag =true;
        }
        for(int i =2; i<=num/2;i++)
        {
            //condition for non-prime
            if(num%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)

        {
            System.out.println(num + " : " + "primeNumber");
        }

        else {
            System.out.println(num + " : " + "not a primeNumber");
        }
    }
}
