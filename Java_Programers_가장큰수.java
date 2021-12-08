import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
       
        String str = "";
        String tmp = "";
        String[][] ans=new String[numbers.length][2];
        for(int k=0;k<numbers.length;k++)
        {   
            if((int)(Math.log10(numbers[k])+1)==1)
            {
                tmp=Integer.toString(numbers[k])+Integer.toString(numbers[k])+Integer.toString(numbers[k])+Integer.toString(numbers[k]);
            }else if((int)(Math.log10(numbers[k])+1)==2)
            {
                tmp=Integer.toString(numbers[k])+Integer.toString(numbers[k]/10)+Integer.toString(numbers[k]/10);
            }
            else if((int)(Math.log10(numbers[k])+1)==3)
            {
                tmp=Integer.toString(numbers[k])+Integer.toString(numbers[k]/100);
            }
            else tmp=Integer.toString(numbers[k]);
         
            ans[k][0]=tmp;
            ans[k][1]=Integer.toString(numbers[k]);
       
        }
        Arrays.sort(ans,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].equals(o2[0]))
					return (o1[1]+o2[1]).compareTo(o2[1]+o2[1]);
				else
					return o1[0].compareTo(o2[0]);
			}
		});
        
        for(int u=numbers.length-1;u>=0;u--)
        {
            str=str+ans[u][1];
        }
        return str.charAt(0)=='0'?"0":str;
        
    }
}