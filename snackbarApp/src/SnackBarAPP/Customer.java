package SnackBarAPP; 

public class Customer
{
   private static int maxID = 0;
   private int id;
   private String name;
   private double cashonhand; 

   public Customer(String name, double cashonhand)
   {
      maxID++;
      id=maxID;
      
      this.name = name;
      this.cashonhand = cashonhand;
   }
      //getters
      public String getName()
      {
         return name;
      }
      public void setName(String name)
      {
         this.name = name;
      }

}

//Customer has id, name, cash on hand. 
//Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.  
//* Jane with $45.25
//* Bob with $33.14