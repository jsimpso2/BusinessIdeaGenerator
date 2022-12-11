//Idea class is an abstract class it means we cannot create an object of this class but if we want to use this class we must inherit from this class( BusinessIDea class)
public abstract class Idea {
    private String title; // used to store idea name
    private int scalable; // value should be between 0-10 (0 means idea cannot extend more(lowest scalability), and 10 means very good idea  (the highest scalability)  )

    //constructor
    public Idea(String title, int scalable) {
        this.title = title;
        this.scalable = scalable;
    }


    //following are getters and setters for class variables

    //used to getTitle
    public String getTitle() {
        return title;
    }


    //used to set new title
    public void setTitle(String title) {
        this.title = title;
    }

    //used to get scale vale
    public int getScalable() {
        return scalable;
    }

    //used to update scale Value
    public void setScalable(int scalable) {
        this.scalable = scalable;
    }


    //this function when call return a string representation of Idea
    public String toString() {
        return
                "Name= " + title + '\n' +
                "Scalable Probability(1-10)= " + scalable+ '\n' ;
    }
}
