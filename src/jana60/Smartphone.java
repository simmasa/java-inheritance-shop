package jana60;

public class Smartphone extends Prodotto{
    String imei;
    int gbRam;

    //constructor
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memory) {
        super(codice, nome, marca, prezzo, iva);
        this.imei=imei;
        gbRam=memory;
    }
    public Smartphone(String nome, String marca, double prezzo, double iva, String imei, int memory) {
        super(nome, marca, prezzo, iva);
        this.imei=imei;
        gbRam=memory;
    }

    //getter/setter
    public String getImei() {
        return imei;
    }

    public int getGbRam() {
        return gbRam;
    }
    //others
    public String autoSetImei() {
        return getId()+ getId()+ getId();
    }

    @Override
    public String toString() {
        return "Smartphone. " + super.toString() +
                ". Imei '" + imei + "'" +
                " con " + gbRam +
                "gb di RAM";
    }
}
