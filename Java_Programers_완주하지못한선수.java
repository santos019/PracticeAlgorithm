import java.util.HashMap;
import java.util.Iterator;

public class myObject{
    
    public String name;
    public int num;
    
    public myObject(String name, int num)
    {
        this.name=name;
        this.num=num;
    }
}
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,myObject> participantmap= new HashMap <>();
        HashMap<String,Integer> completionmap= new HashMap <>();
        myObject[] myObject= new myObject[participant.length];
        
        
       for (int i=0;i<participant.length;i++)
       {   myObject[i]=new myObject("null",0);
           myObject[i].name=participant[i]; 

           if(participantmap.containsKey(participant[i]))//true
            {  myObject[i].num=participantmap.get(participant[i]).num+1;
               participantmap.put(participant[i],myObject[i]);//이게 오리지날배열
                participantmap.put(participant[i]+(participantmap.get(participant[i]).num),myObject[i]);//그뒤의배열

            }
            else
             participantmap.put(participant[i],myObject[i]);
  
       }
       
       for (int k=0;k<completion.length;k++)
       {    if(completionmap.containsKey(completion[k]))//true
            {   completionmap.put(completion[k],completionmap.get(completion[k])+1);
                completionmap.put(completion[k]+(completionmap.get(completion[k])),0);
            }
            else
                completionmap.put(completion[k],0);
       }
        Iterator<String> keys = participantmap.keySet().iterator();

       for(String answer: participantmap.keySet())
       {
            if(completionmap.containsKey(answer)==false)
                return participantmap.get(answer).name;             
       }   
        return "";
    }
}