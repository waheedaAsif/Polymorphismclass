package polymorphoismClass;

import java.util.ArrayList;

public class ArraylistTopic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> data = new ArrayList<String>();
	
		 data.add("first");
		 data.add("second");
         data.add("third");
         
         // for loop
         
         for(int i = 0; i < data.size(); i++) {
         System.out.println(data.get(i));
         } 
         
         
         // with for each loop
         
         for (String i : data) {
        	 System.out.println("foreach " + i);
        	  }
         
         ArrayList<Integer> data2 = new ArrayList<Integer>();
         
          data2.add(12);
          data2.add(13);
          data2.add(14);
          data2.add(15);
          data2.add(16);
          
          for ( Integer i : data2) {
        	  System.out.println(i);
          }
         }
}
