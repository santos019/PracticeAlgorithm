import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Collections;
class Solution {//1, 2, 3, 4, 5
    //2, 1, 2, 3, 2, 4, 2, 5, 
    //3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
    public int[] solution(int[] answers) {
        int[] first={1,2,3,4,5};
        int[] second={2,1,2,3,2,4,2,5};
        int[] third={3,3,1,1,2,2,4,4,5,5};  
        int[] cnt={0,0,0};
      
        ArrayList<Integer> myarray= new ArrayList<>();
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<answers.length;i++)
        {
            if(answers[i]==first[i%5])
                cnt[0]++;
             if(answers[i]==second[i%8])
                cnt[1]++;
             if(answers[i]==third[i%10])
                cnt[2]++;
        }
        map.put(1,cnt[0]);
        map.put(2,cnt[1]);
        map.put(3,cnt[2]);
    
        Integer maxValue = Collections.max(map.values());
       
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()==maxValue&&maxValue!=0)
                myarray.add(entry.getKey());   
        }
    
        Collections.sort(myarray);
        int [] answer= new int[myarray.size()];
        for(int u=0;u<answer.length;u++)
        {
            answer[u]=myarray.get(u).intValue();
        }

    
        return answer;
    }
}