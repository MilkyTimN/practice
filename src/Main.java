import models.Gun;
import models.Pistol;

public class Main {
    public static void main(String[] args) {


        Pistol desertEagle = new Pistol(7, 50);
        desertEagle.makeBullets();
        desertEagle.makeDamage();
    }
}