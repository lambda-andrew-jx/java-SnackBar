package snackBarApp;

public class VendingMachine {

	// variables
	private int maxId = 0;
	private int id;
	private String name;

	public VendingMachine(String name) {
		this.id = maxId++;
		this.name = name;
	}

	// getters
	public int getId() { return id; }

	public String getName() { return name; }

	// setters
	public void setId(int id) { this.id = id; }

	public void setName(String name) { this.name = name; }
}