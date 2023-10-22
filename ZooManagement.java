import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";

       /* System.out.println(zooName + " comporte " + nbrCages + " cages");*/

        Zoo zoo = new Zoo("myZoo");
        Animal a1 = new Animal("lion","abc",25, false) ;
        Animal animal = new Animal("abc", "aze", 52, true);

        /*String msg = animal.toString();
        animal.afficherZoo(msg);
        System.out.println(animal.toString());
        System.out.println(animal);
        /*System.out.println(zoo.addAnimal(a1));
        System.out.println(zoo.afficherTableau(zoo.tableau))
*/
       /* Terrestial t = new Terrestial();
        Aquatic a = new Aquatic();
        Penguin p = new Penguin();
        Dolphin d = new Dolphin();
        a.toString();
        t.toString();
        p.toString();
        d.toString();
        a.swim();
        p.swim();
        d.swim();*/

        Aquatic aquatic1 = new Aquatic ("abc", "kenza", 20, true, "Habitat"){
            public void swim(){
                System.out.println("is swim");
            }
        };
        Aquatic aquatic2 = new Aquatic ("dsd", "nour", 10, false, "Habitat"){
            public void swim(){
                System.out.println("is swim");
            }
        };
        Aquatic p1 = new Penguin("aaaa", "eya", 5, true,"2",22);
        Aquatic p11 = new Penguin("aaaa", "eya", 5, true,"2",22);
        Aquatic p2 = new Penguin("sgh", "dhia", 25, true,"23",233);

        zoo.addAquaticAnimal(aquatic1);
        zoo.addAquaticAnimal(aquatic2);
        zoo.addAquaticAnimal(p1);
        zoo.addAquaticAnimal(p2);
        int tailleTab = zoo.aquaticCompteur;
        for (int i = 0; i < tailleTab; i++) {
            Aquatic aquatic = zoo.aquaticAnimals[i];
            System.out.println(aquatic);
            aquatic.swim();
        }

        float maxDepth = zoo.maxPenguinSwimmingDepth();
        System.out.println(maxDepth);

        zoo.displayNumberOfAquaticsByType();
        System.out.println(p1.equals(p11));
        System.out.println(p1.equals(p2));

        }
    }
