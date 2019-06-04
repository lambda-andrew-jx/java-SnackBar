package SnackBarAPP; 

public class VendingMachine 
{
    private static int maxId = 0;
    private String type;
    

    private VendingMachine(String type)
    {
    maxId++;
    id = maxId;
    this.type = type;
   
    }
    public int getID()
    {
        return id;
    }
    public String gettype()
    {
        return type;
    }
}