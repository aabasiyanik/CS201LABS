package HomeWork2.first_pikachu;

public class pikachu {
    private String name;
    private char gender;
    private int age;

    public pikachu(String theName, char theGender, int theAge) {
        name = theName;
        gender = theGender;
        age = theAge;

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void sound(String sound) {
        System.out.println(getName() + " says:" + sound + "!");

    }

    public void firstSkill(String skill1) {
        System.out.println(getName() + " uses " + skill1 + "!!!");
    }

    public void secondSkill(String skill2) {
        System.out.println(getName() + " uses " + skill2 + "!!!");
    }

    public String toString() {
        return "My pokemon " + name + " is " + age + " years old";
    }
}
