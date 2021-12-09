class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x=3,y=1;
        for(int n=3; n<brown/2;n++)
        {
            y=(brown/2)-n;
            if((n>=y+2)&&(y*(n-2)==yellow) )
            {  
                    answer[0]=n;
                    answer[1]=y+2;
                    break;
            }
        }
        return answer;
    }
}