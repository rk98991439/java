import java.lang.reflect.Array;

public class ps6_5 
{
    public static void main(String[] args) 
    {
        int []table = {1,2,3,4,5,6,7,8};
        int cnt = 0;
    
        for (int i = table.length-1 ; i >= 0;i--) 
        {
            System.out.println("from table 1 ="+table [i]);
            cnt = table [i];
            System.out.println("from table 2 ="+cnt);
            

            for (int j = 0 ; j <= 0;)
            {
            table[i]=table[j];
            table[j] = cnt;
            System.out.println(table[i]+" "+table[j]);
            j++;

            }
   
            
        }

    }
}