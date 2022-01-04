import java.util.Arrays;
import java.util.Stack;

class Solution {
    static int answer=51;
    static Stack <String> stack = new Stack<>();
    public int solution(String begin, String target, String[] words) {
        
        int ch=0;       
        String [][] tmp =new String[words.length][words.length]; 
        boolean visited[]=new boolean[words.length];

        for(int j=0;j<words.length;j++)
        { for(int i=0;i<begin.length();i++)
            {   
                if((begin.charAt(i))==(words[j].charAt(i)))
                    ch++;
            
            }
               if(ch==begin.length()-1)
                    find(j,begin.length(),visited,words,target);
          ch=0;
        }
        
        return answer==51?0:answer;
        
    }
    static void find(int index, int size,boolean[] visited, String[] words,String target)
    {
        visited[index]=true;
        stack.push(words[index]);
        int yop=0;
        if(words[index].equals(target))
        {
            if(answer>stack.size())
                answer=stack.size();
                        
            stack.pop();
            
            return;
        }
        
        for(int y=0;y<words.length;y++)
        {
            for(int u=0;u<size;u++)
            {
                if((words[index].charAt(u))==(words[y].charAt(u)))
                    yop++;
            }
             if(yop==size-1&&visited[y]==false)
                {   find(y,size,visited,words,target);
                    visited[y]=false;                
                }
            yop=0;
        }
        stack.pop();
        
    }
    
}