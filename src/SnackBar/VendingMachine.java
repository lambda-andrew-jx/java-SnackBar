package SnackBar;

public class VendingMachine
{
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(string name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public setName(String name)
    {
        this.name = name;
    }
}