//This program shows Different types of "for loop" in java 

public class forloop {
    public static void main(String args[])
    {
        //for loop - 
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }

        //Nested for loop - 
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Infinite for loop - 
        for(int i=1;i>=1;i++)
        {
            System.out.println(i);
        }

        //Infinite for loop(Another way) -
        for( ; ; )
        {
            System.out.println("Infinite loop");
        }
    }
}