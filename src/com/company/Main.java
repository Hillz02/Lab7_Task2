//Hilary Tabra 55750

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Falcon fal = new Falcon();
        Tuna tuna = new Tuna();

        dog.DogDisplay();
        dog.Voice();

        fal.FalconDisplay();
        fal.Voice();

        tuna.TunaDisplay();
        tuna.Voice();
    }
}

abstract class Animal {
    public static String name, age, weightFields;

    public static void Eat() {
        System.out.println("Nom Nom Nom!");
    }

    public abstract void Voice();
}

public class Mammal extends Animal {
    private String breed, species, legs;

    Mammal(String breed, String species, String legs) {
        this.breed = breed;
        this.species = species;
        this.legs = legs;
    }

    public Mammal() {

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLegs() {
        return this.legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Bark Bark!!");
    }
}

class Dog extends Mammal {
    public static String Breed, Species, Legs;

    Dog(String breed, String species, String legs) {
        super(breed, species, legs);
        Breed = breed;
        Species = species;
        Legs = legs;

        // TODO Auto-generated constructor stub
        Animal.age = "2 years";
        Animal.name = "Ricky";
        Animal.weightFields = "12kg";
        breed = "German Shepherd";
        species = "Dog";
        legs = "4";
    }

    Dog() {

    }

    public static void DogDisplay() {
        System.out.println(String.format("Name: %s, Age: %s, Weight: %s, " +
                        "Breed: %s, Species: %s, Legs: %s", Animal.name, Animal.age, Animal.weightFields,
                Breed, Species, Legs));
        Animal.Eat();
    }
}

class Bird extends Animal {
    private String featherColour, breed;

    Bird(String featherColour, String breed) {
        this.featherColour = featherColour;
        this.breed = breed;
    }

    Bird() {

    }

    public String getFeatherColour() {
        return this.featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Jib Jib Jib!");
    }
}

class Falcon extends Bird {
    public static String FeatherColour, Breed;

    Falcon(String featherColour, String breed) {
        super(featherColour, breed);
        FeatherColour = featherColour;
        Breed = breed;
        // TODO Auto-generated constructor stub
        Animal.name = "Sky";
        Animal.age = "1 year";
        Animal.weightFields = "3.5kg";
        featherColour = "Brown";
        breed = "Falcon";

    }

    Falcon() {

    }

    public static void FalconDisplay() {
        System.out.println(String.format("Name: %s, Age: %s, Weight: %s, " +
                        "Feather Colour: %s, Breed: %s", Animal.name, Animal.age, Animal.weightFields,
                FeatherColour, Breed));
        Animal.Eat();
    }
}

class Fish extends Animal {
    private String oxygen;

    Fish(String oxygen) {
        this.oxygen = oxygen;
    }

    Fish() {

    }

    public String getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Bladder Bladder!");
    }
}

class Tuna extends Fish {
    public static String Oxygen;

    Tuna(String oxygen) {
        super(oxygen);
        Oxygen = oxygen;
        // TODO Auto-generated constructor stub
        Animal.name = "Mr.Tuna";
        Animal.age = "3 years";
        Animal.weightFields = "300g";
        oxygen = "No";

    }

    Tuna() {

    }

    public static void TunaDisplay() {
        System.out.println(String.format("Name: %s, Age: %s, Weight: %s, Oxygen: %s",
                Animal.name, Animal.age, Animal.weightFields, Oxygen));
        Animal.Eat();
    }
}