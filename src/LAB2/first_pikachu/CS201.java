package HomeWork2.first_pikachu;

public class CS201 {
    public static void main(String[] args) {
        pikachu myPokemon = new pikachu("Hams", 'm', 13);
        System.out.println(myPokemon);
        System.out.println("The gender of " + myPokemon.getName() + " is " + myPokemon.getGender());
        myPokemon.sound("PikaPika");
        myPokemon.firstSkill("Thunderbolt");
        myPokemon.secondSkill("Quick Attack");
        myPokemon.setName("pikachu");
        System.out.println(myPokemon);


    }
}
