package com.in28Minutes.trainingoops.encapsulation;

public class MenuItemRunner {

	public static void main(String[] args) {
		
	  System.out.println("=== Basic creation and total ===");	
	  MenuItem menu = new MenuItem("Dosa",100,"A2B", true);
	  System.out.println(menu);
	  System.out.println("Total for 3: " + menu.getTotalCost(3));
      System.out.println();
	  
	  //menu.getTotalCost();
      
    
      
      System.out.println("=== Mutations with clear printing ===");
      
      MenuItem menu1 = new MenuItem("Biriyani",200,"Thalapakatti",false);
	  System.out.println(menu1);
      System.out.println();
	
      boolean ok;

      ok = menu1.setItemName(null);
      System.out.println("item  name is null:  " + ok  );
      System.out.println(menu1);
      System.out.println();
      
      ok = menu1.setPrice(0);
      System.out.println("Price 0:  " + ok  );
      System.out.println(menu1);
      System.out.println();
      
      ok = menu1.setItemName(" ");
      System.out.println("ItemName Empty:  " + ok  );
      System.out.println(menu1);
      System.out.println();
	    

	}

}
