package snackApp;

public class Vendingmachine
{
    private static int maxID = 0;
    private int id;
    private String name;

    public Vendingmachine(String name)
    {
        setID();
        this.name = name;
    }

    public int getID()
    {
        return id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setID()
    {
        this.id = ++maxID;
    }

    public void setName(String name)
    {
        this.name = name;
    }

} 