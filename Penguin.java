class Penguin extends Aquatic{

    float swimmingDepth;
    Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth) {
        super(family, name, age, isMammal,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    Penguin(){

    }
    public void swim(){
        System.out.println("This penguin is swimming.");
    }

}
