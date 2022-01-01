class Solution {
  static int cnt=0;
    public int solution(int n, int[][] computers) {
        //System.out.println(computers.length);
   
         boolean[] visited =new boolean[computers.length];
       
        for(int k=0;k<computers.length;k++)
        {   if(visited[k]!=true)       
            {
            dfs(k,visited,computers); 
            cnt++;
            }
          
        }
        //System.out.println("cnt"+cnt);
        return cnt;
    }

static void dfs(int node, boolean[] visited,int[][] computers)
{   //if(visited[node]==true)return;
    visited[node]=true;
    //System.out.println(node+" ");
    
    for(int next=0;next<computers.length;++next)
    {
        if(!visited[next] && computers[node][next]!=0)
        dfs(next,visited,computers);
     
        
    }
    
}

}