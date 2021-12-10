import java.util.HashSet;
import java.util.Map;
import java.util.Iterator;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        String up="";
        int test=phone_book.length;
        HashSet<String> tmp=new HashSet<String>();
        for(int k=0;k<test;k++)
        {
            tmp.add(phone_book[k]);
        }
Iterator<String> iter = tmp.iterator();

        while(iter.hasNext())
        {
            up=iter.next();
            for(int m=0; m<up.length();m++)  
            {   
               
             if(tmp.contains(up.substring(0,m))) return false;

           }
        }
        return true;
    }
}