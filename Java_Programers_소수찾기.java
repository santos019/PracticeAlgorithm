import java.util.HashSet;
class Solution {
    public static void comb(String arr[],String out[],boolean[] check,HashSet<Integer> ans,int depth,int n,int r)
    {   if(depth==r)
        { String str="";
          int tmp=0;
            for(int j=0;j<r;j++)
              str=str+out[j];
            
            tmp=Integer.parseInt(str);
      
         if(tmp==1||tmp==0)return;
         for(int b=2;b<tmp;b++)
            if(tmp%b==0)return;
             
            ans.add(tmp);//몰은거 넣기
            return;
        }
        else{
            for(int m=0;m<n;m++)
            {
                if(check[m]!=true)
                {
                    check[m]=true;
                    out[depth]=arr[m];
                    comb(arr,out,check,ans,depth+1,n,r);
                    check[m]=false;
                }
            }
        }
        
        
    }
    public int solution(String numbers) {
        HashSet<Integer> ans =new HashSet<Integer>();
        String[] out =new String[numbers.length()];
        boolean[] check=new boolean[numbers.length()];
        String[] myarray=new String[numbers.length()];
        for(int k=0;k<numbers.length();k++)
            myarray[k]=numbers.substring(k,k+1);    

        for(int h=1;h<=numbers.length();h++)
            comb(myarray,out,check,ans,0,numbers.length(),h);
        
        return ans.size();
    }
}