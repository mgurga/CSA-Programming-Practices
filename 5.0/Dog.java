public class Dog implements Comparable<Dog> {

    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount = 0;

    public Dog(String _name, int _age, String _breed, double _weight)
    {
        this.name = _name;
        this.age = _age;
        this.breed = _breed;
        this.weight = _weight;
        dogCount++;
    }

    public Dog()
    {
        this.name = "DefaultDog";
        this.age = 5;
        this.breed = "DefaultBreed";
        this.weight = 50;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public void setBreed(String newBreed)
    {
        this.breed = newBreed;
    }

    public void setWeight(double newWeight)
    {
        this.weight = newWeight;
    }

    public String getName()
    {
        return this.name;
    }

    public String getBreed()
    {
        return this.breed;
    }

    public int getAge()
    {
        return this.age;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public double getWeightInKilos()
    {
        return this.weight / 2.205;
    }

    public String toString()
    {
        return "dog name: " + this.name + ", dog age: " + this.age + ", dog weight: " + this.weight + ", dog breed: " + this.breed;
    }

    public int totalDogs()
    {
        return this.dogCount;
    }

    public int compareTo(Dog o)
    {
        if(this.age == o.getAge()) {
            return 0;
        }
        else if(this.age - o.getAge() < 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }

    }
}
