package snackbarapp;

public class Main {
    private static void workWithData() {
        // VendingMachine(type)
        VendingMachine food = new VendingMachine("food");
        VendingMachine drink = new VendingMachine("drink");
        VendingMachine office = new VendingMachine("office");

        // Snack(snack, quantity, cost, vendingMachineId)
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("chocolate bar", 36, 1.0, food.getId());
        Snack pretzelsSnack = new Snack("pretzel bag", 30, 2.0, food.getId());
        Snack soda = new Snack("soda", 24, 2.50, drink.getId());
        Snack water = new Snack("water", 30, 2.75, drink.getId());

        // Customer(fullName, cash)
        Customer jane = new Customer("Jane Not-Seinfeld", 45.25);
        Customer bob = new Customer("Bob Not-Seinfeld", 33.14);

        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity
        jane.useCash(soda.buySnack(jane.getCash(), 3));

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity  // of snack 3.
        jane.useCash(pretzelsSnack.buySnack(jane.getCash(), 3));

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity// of snack 4.
        bob.useCash(soda.buySnack(bob.getCash(), 4));

        // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        jane.useCash(10);

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity // of snack 2.
        jane.useCash(chocolateBar.buySnack(jane.getCash(), 1));

        // Add 12 more items to snack 3. Print quantity of snack 3.
        pretzelsSnack.addQuantity(12);

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity// of snack 3.
        bob.useCash(pretzelsSnack.buySnack(bob.getCash(), 3));

    }

    public static void main(String[] args) {
        workWithData();
    }
}