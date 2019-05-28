package snackbar

public class VendingMachine
{
	private static int maxId = 0;
    private String name;

    public VendingMachine( int id, String name)
    {
        maxId++;
    	this.id = maxId;
    	this.name = name;
    }

    public int getId()
    {
    	return id;
    }

    public String getName()
    {
    	return name;
    }

    public void setName(String name)
    {
    	this.name = name;
    }
}
