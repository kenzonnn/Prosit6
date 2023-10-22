public class Dolphin extends Aquatic {

    float swimmingSpeed;
    Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    Dolphin(){

    }
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
