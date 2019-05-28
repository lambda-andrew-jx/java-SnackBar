package snackBar;

public class VendingMachine
{
    private static int maxID = 0;
    private int id;
    private String name;

    public VendingMachine(String name)
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

    public int setID()
    {
        this.id = ++maxID;
    }

    public String setName(String name)
    {
        this.name = name;
    }
} 