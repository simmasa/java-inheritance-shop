package jana60;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {
    //attributes
    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    // constructor
    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    public Prodotto(String nome, String marca, double prezzo, double iva) {
        this.codice = Integer.parseInt(getId());
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //getter/setter
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //altri methods
    public String prezzoFormattato() {
        DecimalFormat df = new DecimalFormat("0.00¤");
        double prezzoFinale = prezzo+((prezzo/100)*iva);
        return df.format(prezzoFinale);
    }

    protected static String getId() {

        String idString ="";
        Random rn = new Random();
        for (int i = 0;i<5;i++) {
            idString += rn.nextInt(10);
        }
        return idString;
    }

    @Override
    public String toString() {
        return "Prodotto "+ codice + ": Nome: " + nome + ", prodotto da: " + marca +". Prezzo :" + prezzoFormattato();
    }
}
