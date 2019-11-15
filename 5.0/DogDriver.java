public class DogDriver {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fang", 5, "Husky", 80);
        Dog dog2 = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("widePeepoHappy", 78, "Emote", 10);

        System.out.println("Fang's breed is " + dog1.getBreed() + ", and his age is: " + dog1.getAge());
        System.out.println("Nutmeg's wight is: " + dog2.getWeight());
        System.out.println(dog3.toString());
        System.out.println("with a total of " + dog3.totalDogs() + " dogs");

        if(dog2.compareTo(dog1) < 0)
        {
            System.out.println("Nutmeg is younger than Fang");
        }
        else
        {
            System.out.println("Fang is younger than Nutmeg");
        }

        if(dog1.compareTo(dog3) < 0)
        {
            System.out.println(" My Dog is younger than Fang");
        }
        else
        {
            System.out.println("Fang is younger than My Dog");
        }
    }
}
