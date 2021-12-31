import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0,"Sreeja");
		hm.put(1,"PT");
		hm.put(2,"Bachan");
		hm.put(3,"Praveen");
		String pr=new String("Prithvik");
		hm.put(4,pr);
		hm.put(5,"SreejaPraveen");
		System.out.println(hm);
		
		hm.remove(0);
		System.out.println(hm);
		
		
		hm.putIfAbsent(0,"SreejaPT");
		System.out.println(hm);

	//	Set<Entry<Integer, String>> ent=hm.entrySet();
		Set ent=hm.entrySet();
	//	Iterator<Entry<Integer,String>> it=ent.iterator();
		Iterator it=ent.iterator();
		System.out.println("\n");
		System.out.println("Map ..Set");
		
		while(it.hasNext())
		{
		//	System.out.println(it.next());
		//	System.out.println("==========================");
			
			Map.Entry<Integer,String> mp=(Map.Entry<Integer,String>)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}	
		System.out.println(hm);
		
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		if(hm.containsKey(1))
			System.out.println("Key 1 present...");
		else
			System.out.println("Key 1 not prsent");
        if(hm.containsValue("Sreeja"))
        	System.out.println("Sreeja Present ..");
        else
        {
        	System.out.println("Sreeja added .");
            hm.put(hm.size(),"Sreeja");	
        }
		
        hm.put(null,"Value for Null");
        System.out.println(hm);

	}

}
