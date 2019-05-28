// Instantiate 2 customers

// Jane with $45.25
// Bob with $33.14

package snackbarapp;

public class Customer {
    private String fullName;
    private double cash;

    public Customer(String fullName, double cash) {
        this.fullName = fullName;
        this.cash = cash;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the cash
     */
    public double getCash() {
        return cash;
    }

    /**
     * @param cash the cash to set
     */
    public void useCash(double cash) {
        double beforeBuy = this.cash;
        this.cash = cash;
        System.out.println(this.fullName + " had $" + beforeBuy + " and has $" + cash + " left \n");

    }

}