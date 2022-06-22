package jana60;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Prodotto telefono2 = new Prodotto("galaxy","samsung",100,22);
        Smartphone telefono = new Smartphone("galaxy","samsung",100,22,"1212341434",128);
        Televisore televisore = new Televisore("tele","lg",300,22,true,32);

        System.out.println(telefono);

    }



}
