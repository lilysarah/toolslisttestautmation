package co.uk.safebear.kennels;
//the below is your class name Dog note the capital letters
public class Dog {

    // the following describes the
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

