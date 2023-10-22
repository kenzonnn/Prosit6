public class Animal {
    private String family;
    protected String name;
    protected int age;
    private boolean isMammal;

    Animal() {
    }

    Animal(String family, String name, int age, boolean isMammal) {
        this.setFamily(family);
        this.setName(name);
        this.setAge(age);
        this.setMammal(isMammal);
    }

    public String toString() {
        return "This animal with name " + getName() + " and family: " + getFamily() + ", age: " + getAge() + ", is mammal: " + isMammal();
    }
    private String message = toString();
    void afficherZoo(String message) {

        System.out.println(message);
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("l'age doit etre positive");
        }
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}