package SnackBarAPP; 

public class Snack
{
private static int maxID = 0;
private int id;
private String name;
private String type;
private int quantity;
private double price;

public Snack(String name, String type, int quantity, double price)
{
    maxId++;
    id= maxID;
    this.name = name;
    this.type = type;
    this. quantity = quantity;
    this.price = price;
}
}