public class Zoo {
    private Animal[] animals = new Animal[25];
    int aquaticCompteur = 0;
    Aquatic[] aquaticAnimals = new Aquatic[10];
    private String name;
    private String city;
    private static int nbrAnimalCree;


    private final int nbrCages = 20;

    private int i = 0;

    Zoo(String name) {

        this.setName(name);
    }

    Zoo(int nbAnimals, String name, String city) {
        this.setName(name);
        setAnimals(new Animal[nbAnimals]);
    }

    Zoo() {
    }

    public static int getNbrAnimalCree() {
        return nbrAnimalCree;
    }

    public static void setNbrAnimalCree(int nbrAnimalCree) {
        Zoo.nbrAnimalCree = nbrAnimalCree;
    }
    /*public String toString(){
        String s = "zoo : " + name + " city"
        return
    }*/

    Boolean isZooFull() {
        if (getNbrAnimalCree() < 25) {
            return false;
        }
        return true;
    }


    /*Boolean addAnimal(Animal animal){

        if(nbrAnimalCree<animals.length) {
            animals[nbrAnimalCree] = animal ;
            nbrAnimalCree++;
            return true;
        }
        return false;
    }
     */
    Boolean addAnimal(Animal animal) {
        if (isZooFull() == false) {
            getAnimals()[getNbrAnimalCree()] = animal;
            setNbrAnimalCree(getNbrAnimalCree() + 1);
            return true;
        }
        return false;
    }

    void display() {

    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNbrAnimalCree() > z2.getNbrAnimalCree()) {
            return z1;
        }
        return z2;
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        aquaticAnimals[aquaticCompteur] = aquatic;
        aquaticCompteur++;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1.0f;
        for (int i = 0; i < aquaticCompteur; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                float depth = penguin.swimmingDepth;

                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int nbrDolphins = 0;
        int nbrPenguins = 0;
        for (int i = 0; i < aquaticCompteur; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
            else if (aquaticAnimals[i] instanceof Dolphin){
                nbrDolphins++;
            }
        }
        System.out.println("le tableau contient "+ nbrDolphins + " dolphins et "+ nbrPenguins + " penguins.");


    }
}
