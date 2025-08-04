import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class learnHashMap {
    public static void majorityElement(int nums[])
    {
        int n = nums.length;
        Map<Integer,Integer>  map = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            } else
            {
                map.put(nums[i],1);
            }
        }

        for(int key:map.keySet())
            if(map.get(key)>n/3)
                System.out.print(key +" ");
    }

    public static void main(String[] args) {
        int a[]={1,2,2,2,1,1,1,2,1};
        majorityElement(a);

    }

}
