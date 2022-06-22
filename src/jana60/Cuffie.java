package jana60;

public class Cuffie extends Prodotto{
    boolean isWireless;
    String color;

    //constructor
    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, boolean smart, String color) {
        super(codice, nome, marca, prezzo, iva);
        isWireless=smart;
        this.color=color;
    }
    public Cuffie(String nome, String marca, double prezzo, double iva, boolean smart, String color) {
        super(nome, marca, prezzo, iva);
        isWireless=smart;
        this.color=color;
    }


    //getter/setter

    public boolean isWireless() {
        return isWireless;
    }

    public String getColor() {
        return color;
    }

}
