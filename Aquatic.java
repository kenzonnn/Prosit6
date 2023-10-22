abstract class Aquatic extends Animal{
    String habitat;
    Aquatic (String family, String name, int age, boolean isMammal,String habitat){
        super(family, name, age, isMammal);
        this.habitat= habitat;
    }
    Aquatic(){

    }
    public abstract void swim();

    @Override
    public String toString() {
        String a =super.toString();
        return a+ "Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (Aquatic.class == obj.getClass()) {
            Aquatic aquatic = (Aquatic) obj;
            return name.equals(aquatic.name) && age == aquatic.age && habitat.equals(aquatic.habitat);
        }
        return false;
    }

}
