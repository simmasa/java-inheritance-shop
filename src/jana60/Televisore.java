package jana60;

public class Televisore extends Prodotto {
    boolean isSmart;
    int inches;

    //constructor
    public Televisore(int codice, String nome, String marca, double prezzo, double iva, boolean smart, int inches) {
        super(codice, nome, marca, prezzo, iva);
        isSmart=smart;
        this.inches=inches;
    }
    public Televisore(String nome, String marca, double prezzo, double iva, boolean smart, int inches) {
        super(nome, marca, prezzo, iva);
        isSmart=smart;
        this.inches=inches;
    }

    //getter/setter

    public boolean isSmart() {
        return isSmart;
    }

    public int getInches() {
        return inches;
    }

}
