
public class Person
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {return;}
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {this.age = age;}
    }

    public void getOld()
    {
        this.age++;
    }

    public interface printInfo {}
}
