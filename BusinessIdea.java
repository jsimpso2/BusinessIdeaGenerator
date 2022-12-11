//BusinessIdea class is child class of IDea class (inheritance)
public class BusinessIdea extends Idea{

    //encapsulate data and functions (by making attributes private)
    private String description; //used to store description about business idea
    private boolean hasExistingMarket; //used to indicate if the business has existing market or not.value will be true if its has otherwise false
    private final double costToStart;//this attribute will store total cost to start this business. Final keyword indicate that it is constant value and cannot be changed once assigned in constructor
    private boolean isEducationRequired;//This attribute indicated that either Education is required to start this business or not


    //parametrized constructor
    public BusinessIdea(String title, int scalable, String description, boolean hasExistingMarket, double costToStart, boolean isEducationRequired) {
        //super is used to call parent class's constructor to set its values
        super(title, scalable);

        //set other values to class attributes using this keyword
        this.description = description;
        this.hasExistingMarket = hasExistingMarket;
        this.costToStart = costToStart;
        this.isEducationRequired = isEducationRequired;
    }



    //following are the list of getters and setters for class variables
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasExistingMarket() {
        return hasExistingMarket;
    }

    public void setHasExistingMarket(boolean hasExistingMarket) {
        this.hasExistingMarket = hasExistingMarket;
    }


    public double getCostToStart() {
        return costToStart;
    }

    public boolean isEducationRequired() {
        return isEducationRequired;
    }

    public void setEducationRequired(boolean educationRequired) {
        isEducationRequired = educationRequired;
    }

    //override parent class's toString method
    public String toString()
    {

        //call parent class's toString method using keyword super
         String str=super.toString();

        //concatenate more data with above string
        str+=  "Description: " + description + '\n' +
                "Existing Market: " + (hasExistingMarket?"yes":"NO") + '\n' +
                "Estimated Cost: " + costToStart + '\n' +
                "Education Required: " + (isEducationRequired?"yes":"NO");

        return str;
    }


}
