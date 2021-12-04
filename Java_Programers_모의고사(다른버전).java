import java.util.Arrays;
import java.util.ArrayList;
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
   ArrayList<Integer> answer= new ArrayList<>();
        for(int i=0; i<answers.length;i++)
        {
            if(answers[i]==first[i%5])
                cnt[0]++;
             if(answers[i]==second[i%8])
                cnt[1]++;
             if(answers[i]==third[i%10])
                cnt[2]++;
        }
        
        myarray.add(cnt[0]);
        myarray.add(cnt[1]);
        myarray.add(cnt[2]);
    
        Integer maxValue = Collections.max(myarray);
       System.out.println(maxValue);
        for(int value=0;value<cnt.length;value++)
        {
            if(cnt[value]==maxValue.intValue())
            {
                answer.add(value+1);
            }
        }
         Collections.sort(answer);

        int [] answer1= new int[answer.size()];
        for(int u=0;u<answer1.length;u++)
        {
            answer1[u]=answer.get(u).intValue();
        }

    
        return answer1;
    }
}