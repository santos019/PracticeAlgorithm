
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class makeCombination {

	
	ArrayList <String> myarray = new ArrayList <>();
	ArrayList <String> ansarray = new ArrayList <>();
	ArrayList <String> boolarray = new ArrayList <>();
	ArrayList <String> lastarray = new ArrayList <>();
	public static void combination(ArrayList<String> myarray,ArrayList<String> ansarray,ArrayList<String> boolarray,ArrayList<String> lastarray,int depth,int n, int r){
		
		if(depth==r) {
			System.out.println("wow");
			lastarray.add(ansarray.get(0)+ansarray.get(1)+ansarray.get(2));
			print(ansarray,r);
			return;
		}
		for(int i=0;i<n;i++)
		{
			if(boolarray.get(i).equals("true")!=true)
			{//System.out.println(i);
				boolarray.set(i,"true");
				ansarray.set(depth,myarray.get(i));
				combination(myarray,ansarray,boolarray,lastarray,depth+1,n,r);
				boolarray.set(i,"false");
			}
		}
		//System.out.println("여기는 인자"+myarray.get(2));
		
	}
	  static void print(ArrayList<String> arr, int r) {
	        for (int i = 0; i < r; i++)
	            System.out.print(arr.get(i)+ " ");
	        System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeCombination makeC = new makeCombination();
	
		makeC.ansarray.add("1");
		makeC.ansarray.add("1");
		makeC.ansarray.add("1");
		Scanner scan = new Scanner(System.in);
		System.out.println("입력하세요");
		String str="start";
		
		while(str.equals("end")==false)
		{
			str=scan.next();
			System.out.println("통과");
			System.out.println("값은"+str);
			makeC.myarray.add(str);
			makeC.boolarray.add("false");
			//System.out.println(makeC.myarray.get(makeC.myarray.size()-1));
		
		}
		
		combination(makeC.myarray,makeC.ansarray,makeC.boolarray,makeC.lastarray,0,makeC.myarray.size()-1,3);
		//System.out.println("배열"+makeC.myarray);
		for(int j=0;j<makeC.ansarray.size();j++)
		{
			System.out.println("여기"+makeC.ansarray.get(j));
		}
		System.out.println(makeC.lastarray);
	}

}
