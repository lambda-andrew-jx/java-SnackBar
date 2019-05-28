package snackbar

public class VendingMachine
{
	private int id;
    private String name;

    public VendingMachine( int id, String name)
    {
    	this.id = id;
    	this.name = name;
    }

    public int getId()
    {
    	return id;
    }

    public void setId(int newId)
    {
    	this.id = newId;
    }

    public String getName()
    {
    	return name;
    }

    public void setName(String newName)
    {
    	this.name = newName;
    }
}
