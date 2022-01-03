import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//To print unique elements from an array of numbers
public class Collections2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner sin=new Scanner(System.in);
		System.out.print("Enten no of items : ");
		int len=sin.nextInt();
		int input[]=new int[len];
		System.out.print("Enter "+len+" no of items :");
		for(int i=0;i<len;i++)
			input[i]=sin.nextInt();
		System.out.println("Input Arary :");
		for(int i=0;i<len;i++)
			System.out.print(input[i]+"  ");
		*/
		int input[]= {1,2,3,4,4,2,3,5,6,8};
		Boolean Result1=arraylistMethod(input);
		Boolean Result2=mapMethod(input);
		Boolean Result3=setMethod(input);	
		System.out.println("kjgu4kiu5i");
	}

	
	private static Boolean setMethod(int[] input3) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();

		for(int i=0;i<input3.length;i++)
		 {  
			int k=1;
			if(!hs.add(input3[i]))
			{
				hs.remove(input3[i]);
			}
			
		 }
		System.out.println("\nUnique Items :"+hs);
		return null;
	}


	private static Boolean mapMethod(int[] input2) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<input2.length;i++)
		  {
			int k=1; 
		
			if(!hm.containsKey(input2[i]))
			{
				hm.put(input2[i], k);
			}
			else
			{
				hm.put(input2[i], hm.get(input2[i])+1);
			}
		  }
		System.out.println("\nMap :"+hm);
		System.out.println("Unique Elements are :");
	    Set<Integer> keys=hm.keySet();
	    for(int key:keys)
	    {
	    	if(hm.get(key)==1)
	    	{
	    	
	    		System.out.print(key+" ");
	    	}
	    }
		return null;
	}


	private static Boolean arraylistMethod(int input1[]) {
		// TODO Auto-generated method stub
	        ArrayList alist=new ArrayList();
		
		System.out.println("\nUnique items in method arraylistMethod :");
		for(int i=0;i<input1.length;i++)
		{   
			int k=0;
			if(!alist.contains(input1[i]))
			{
				alist.add(input1[i]);
				k++;
				
			}
			
		 for(int j=i+1;j<input1.length;j++)
		 {
			 if(input1[i]==input1[j])
				 k++;
		 }
		 
		 if(k==1)
			 System.out.print(input1[i] +"  ");
		 
	}
 return true;
}
}
