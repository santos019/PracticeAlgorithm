class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String number="";
        String number1="";
        int[] my=new int[numbers.length];
        int con=0;
        char[] digits1;
        for(int i=0;i<numbers.length;i++)
        {
         number = String.valueOf(numbers[i]);
         digits1 = number.toCharArray();
         my[i]= Character.getNumericValue(digits1[0]);
       
        }
         for(int i=0;i<numbers.length;i++)
         {
             for(int j=i+1;j<numbers.length;j++)
             {
                 if(my[i]<my[j])
                 {
                     con=numbers[j];
                     numbers[j]=numbers[i];
                     numbers[i]=con;
                     con=my[j];
                     my[j]=my[i];
                     my[i]=con;
                 }
             }
         }
        for(int k=0;k<numbers.length;k++)
        {
             number1 = String.valueOf(numbers[k]);
            answer=answer+number1;
        }

        return answer;
    }
}