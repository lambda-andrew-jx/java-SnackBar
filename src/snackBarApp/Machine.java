package snackBarApp;

;

public class Machine {
  // fields
  private static int maxId = 0;
  private int id;
  private String name;

  // constructor
  public Machine(String name) {
    maxId++;
    id = maxId;
    this.name = name;
  }

  // methods
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

}
