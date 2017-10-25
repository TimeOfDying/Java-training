import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class BubbleSort {

    public static void BubbleSort(ArrayList<Integer> someList)
    {
        int temp = 0;
        for(int i=0; i<someList.size()-1; i++)
        {
            for(int j=0; j<someList.size()-i-1; j++)
            {
                if (someList.get(j) > someList.get(j + 1)) {
                    temp = someList.get(j);
                    someList.set(j, someList.get(j+1));
                    someList.set(j+1, temp);
                }
            }
        }
    }

    public static void PrintList(ArrayList<Integer> someList)
    {
        for(int i=0; i<someList.size(); i++)
        {
            System.out.print(someList.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList randomList = new ArrayList();
        Random rand = new Random();
        for(int i=0; i<100; i++)
        {
            randomList.add(rand.nextInt(100));
        }
        PrintList(randomList);
        BubbleSort(randomList);
        PrintList(randomList);
    }
}
