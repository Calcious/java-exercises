package clone;

//Marker interface--does not describe behaviour, but let's you know you can do something

/**
 * Created by Calcious on 12/5/16.
 */
public class Sheep implements countable, Cloneable{
    private int count = 0;
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    @Override
    public void incrementCount() {

        count++;
    }

    @Override
    public void resetCount() {

        count = 0;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return count + " " + name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
