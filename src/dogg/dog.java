package dogg;

public class dog {
    String name;
    String race;
    int age;


    public dog(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", age=" + age +
                '}';
    }
}
