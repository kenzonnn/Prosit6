public class Terrestial extends Animal{
    int nbrLegs;
    Terrestial(String family, String name, int age, boolean isMammal,int nbrLegs){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    Terrestial(){

    }

    @Override
    public String toString() {
        String a = super.toString();
        return "Terrestial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }
}
