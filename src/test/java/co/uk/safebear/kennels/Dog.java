package co.uk.safebear.kennels;

public class Dog {

    private String name;
    private int age;
    private String colour;
    boolean isNeutered;
    boolean isFriendly;


    public void setName(String newName){
        name = newName;
    }

    public void setColour(String setColour) {
        colour = setColour;
    }

    public String getColour() {
        return colour;
    }

    public void treat() {
        System.out.println(name + " gets a treat");
    }

}

