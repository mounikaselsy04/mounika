import java.util.*;
import java.util.stream.*;

public class StreamExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(75);
		marks.add(65);
		marks.add(55);
		marks.add(45);
		marks.add(35);
		marks.add(25);
		marks.add(15);
		//print failure candidates count
		long failuremarkslist = marks.stream().filter(x -> x<35).count();
		System.out.println(failuremarkslist);
		
	
				List<Integer> failuremarkslist1 = marks.stream().map(x -> x+5).collect(Collectors.toList());
				System.out.println(failuremarkslist1);
		
		//print the values sorted order
		List<Integer> sortedlist = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedlist);
		
		//print values in descending order
		List<Integer> sortedlist1 = marks.stream().sorted((i1,i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sortedlist1);
		 
		//print values in descending order(using customized sorting order)
		List<Integer> descorderlist = marks.stream().sorted((i1,i2) -> ((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
		System.out.println(descorderlist);
		
		ArrayList<String > n = new ArrayList<String>();
		n.add("mounimadhu");
		n.add("manu");
		n.add("diya");
		n.add("sharu");
		n.add("apple");
		
		//print the values sorted order
		List<String> value = n.stream().sorted().collect(Collectors.toList());
		System.out.println(value);
		
		//print the values customized sorted order
				List<String> value1 = n.stream().sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());
				System.out.println(value1);
				
				List<String> value2 = n.stream().sorted((s1,s2)-> s2.compareTo(s1)).collect(Collectors.toList());
				System.out.println(value2);
				
				List<String> value3 = n.stream().sorted((s1,s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
				System.out.println(value3);
				
				Comparator<String> s = (s1,s2) ->{
						int l1= s1.length();
						int l2= s2.length();
						if(l1<l2) return -1;
						else if(l1>l2) return +1;
						else return s1.compareTo(s2);
				    };
				List<String> value4 = n.stream().sorted(s).collect(Collectors.toList());
				System.out.println(value4);
	
    
      Integer min = marks.stream().min((s1,s2) -> s1.compareTo(s2)).get();
      System.out.println(min);
      
      Integer max = marks.stream().min((s1,s2) -> -s1.compareTo(s2)).get();
      System.out.println(max);
				
	}
}
	
	


