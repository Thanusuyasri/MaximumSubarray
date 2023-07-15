import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayMaximum {
    public static int minMaxArray(int[] array,int limit)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    if(k==j)
                    {
                        sum+=array[k];
                    }
                }
            }
            result.add(sum);
            sum=0;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<result.size();i++)
        {
            if(result.get(i)>max)
            {
                if (result.get(i) <= limit)
                 {

                    max=result.get(i);
                }
            }
        }
        if(max<0)
        {
            return 0;
        }
        else
        {
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0;i<size;i++)
        {
            array[i]= scanner.nextInt();
        }
        int limit= scanner.nextInt();
        System.out.println(minMaxArray(array,limit));
    }
}
