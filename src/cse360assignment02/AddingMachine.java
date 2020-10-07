package cse360assignment02;

public class AddingMachine {
    private int total;
    private String calls;

    // constructor for the AddingMachine class
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    // Returns the total of what has been added up
    public int getTotal () {
        return total;
    }

    // Performs the add
    public void add (int value) {
        total = total + value;
        calls = calls + "+" + value;
    }

    // Subtracts the parameter from the value
    public void subtract (int value) {
        total = total - value;
        calls = calls + "-" + value;
    }

    // Converts to a string value
    public String toString () {
        return calls;
    }


    public void clear() {
        total = 0;
        calls = " ";
    }
}

