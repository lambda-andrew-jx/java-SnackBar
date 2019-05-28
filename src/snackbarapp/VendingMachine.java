package snackbarapp;

public class VendingMachine {

    private String type;
    private int id;
    private int maxId = 0;


    public VendingMachine(String type) {
        this.type = type;
        maxId++;
        this.id = maxId;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}