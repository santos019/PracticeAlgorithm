import java.util.ArrayList;
import java.util.Collections;
class Solution {
    
public static void comb(int[] numbers,int[] out,boolean[] check, ArrayList<String> myarray,int depth, int n, int r)
    {
     if(depth==r)
     {  String str="";
         for(int k=0;k<n;k++)
            str=str+Integer.toString(out[k]);
        myarray.add(str);
      return;
      }
    for(int i=0;i<n;i++)
    {
        if(check[i]!=true)
        {
            check[i]=true;
            out[depth]=numbers[i];
            comb(numbers,out,check,myarray,depth+1,n,r);
            check[i]=false;
        }
     }
    }
    
    
    public String solution(int[] numbers) {
        int[] out= new int[numbers.length];
        boolean[] check= new boolean[numbers.length];
        ArrayList <String> myarray =new ArrayList<>();      
        comb(numbers,out,check,myarray,0,numbers.length,numbers.length);
        Collections.sort(myarray,Collections.reverseOrder()); 
        return  Integer.parseInt(myarray.get(0))/Math.pow(10,myarray.size()-1)==0?"0":myarray.get(0);
    }
}