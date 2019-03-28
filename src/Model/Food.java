package Model;

public class Food {
    private String First_Food;
public Food[] Weekly_Schedule= new Food[5];

    public String getFirst_Food() {
        return First_Food;
    }

    public void setFirst_Food(String first_Food) {
        First_Food = first_Food;
    }

    public String getSecond_Food() {
        return Second_Food;
    }

    public void setSecond_Food(String second_Food) {
        Second_Food = second_Food;
    }

    private String Second_Food;
    public String toString()
    {
        return this.getFirst_Food();
    }

}
