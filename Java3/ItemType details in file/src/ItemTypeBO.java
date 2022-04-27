
import java.util.*;
import java.io.*;


public class ItemTypeBO {
     public List<ItemType> readFromFile(BufferedReader br) throws Exception{
         List<ItemType> ItemType1 = new ArrayList<ItemType>();
         String line=new String();
         while((line=br.readLine())!=null) {
        	 //any number of spaces
        	 String val[]=line.split("\\s+");
        	 //System.out.println("hi");
        	 ItemType it = new ItemType(val[0],Double.parseDouble(val[1]),Double.parseDouble(val[2]));
        	 //	System.out.println("hi");
        	 ItemType1.add(it);
        	 val=null;
        	 it=null;
        	 line=null;
         }
           return ItemType1;
           
      } 
      public List<ItemType> depositList(List<ItemType> list) {
          List<ItemType> ItemType2 = new ArrayList<ItemType>();
          for(int i=0; i<list.size(); i++) {
        	  if((list.get(i).getDeposit())>2000) {
        		  ItemType it = new ItemType(list.get(i).getName(),list.get(i).getDeposit(),list.get(i).getCostPerDay());
        		  ItemType2.add(it);
        		  
        	  }
          }
          return ItemType2;
          
      }
      public void display(List<ItemType> list) {
    	  if(list.size()==0) {
    		  System.out.println("No item type has deposit more than 2000");
    	  }else {
    		  System.out.printf("%-15s %-15s %s\n","Item type","Deposit","Cost per day");
        	  for(ItemType it:list) {
        		  System.out.printf("%-15s %-15s %s\n",it.getName(),it.getDeposit(),it.getCostPerDay());
        	  }
    	  }
    	  
      }
}
      