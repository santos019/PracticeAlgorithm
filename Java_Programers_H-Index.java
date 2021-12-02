import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int len=citations.length;
        int cnt=1;
        int i=0;
    
        Arrays.sort(citations);
  
        for(i=0;i<len;i++)
        {
            if(citations[i]!=0)
            {         
                if(cnt<=citations[len-cnt])
                cnt++;
                else
                    break;
            }
        }
        return cnt-1;
    }
}