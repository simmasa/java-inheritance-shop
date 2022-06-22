package jana60;

import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel catalogo ------");
        Scanner sc = new Scanner(System.in);
        int itemNumber = 0;
        Prodotto[] lista = new Prodotto[3];

        boolean addItem=true;
        do {

            System.out.println("Che prodotto vuoi aggiungere? Smartphone, Televisore, Cuffie o digita \"Exit\" per Uscire");

            String option= sc.nextLine();


            switch (option.toLowerCase()) {
                case "smartphone":
                    System.out.println("Inserisci nome prodotto");
                    String nomeS = sc.nextLine();
                    System.out.println("Inserisci marca prodotto");
                    String marcaS = sc.nextLine();
                    System.out.println("Inserisci prezzo prodotto");
                    double prezzoS = Double.parseDouble(sc.nextLine());
                    System.out.println("Inserisci iva prodotto");
                    double ivaS = Double.parseDouble(sc.nextLine());
                    System.out.println("Inserisci imei prodotto");
                    String imeiS = sc.nextLine();
                    System.out.println("Inserisci memoria prodotto");
                    int memoriaS = Integer.parseInt(sc.nextLine());

                    Smartphone nuovoSmart = new Smartphone(nomeS,marcaS,prezzoS,ivaS,imeiS,memoriaS);
                    lista[itemNumber] = nuovoSmart;
                    itemNumber++;
                    break;

                case "televisore":
                    System.out.println("Inserisci nome prodotto");
                    String nomeT = sc.nextLine();
                    System.out.println("Inserisci marca prodotto");
                    String marcaT = sc.nextLine();
                    System.out.println("Inserisci prezzo prodotto");
                    double prezzoT = Double.parseDouble(sc.nextLine());
                    System.out.println("Inserisci iva prodotto");
                    double ivaT = Double.parseDouble(sc.nextLine());
                    System.out.println("Il prodotto è smart? y/n");
                    String smartT = sc.nextLine();
                    boolean isSmartT = (smartT.equals("y"));
                    System.out.println("Inserisci la grandezza dello schermo");
                    int inchesT = Integer.parseInt(sc.nextLine());

                    Televisore nuovoTele = new Televisore(nomeT,marcaT,prezzoT,ivaT,isSmartT,inchesT);
                    lista[itemNumber] = nuovoTele;
                    itemNumber++;
                    break;

                case "cuffie":
                    System.out.println("Inserisci nome prodotto");
                    String nomeC = sc.nextLine();
                    System.out.println("Inserisci marca prodotto");
                    String marcaC = sc.nextLine();
                    System.out.println("Inserisci prezzo prodotto");
                    double prezzoC = Double.parseDouble(sc.nextLine());
                    System.out.println("Inserisci iva prodotto");
                    double ivaC = Double.parseDouble(sc.nextLine());
                    System.out.println("Il prodotto è wireless? y/n");
                    String wirelessC = sc.nextLine();
                    boolean isWireless = (wirelessC.equals("y"));
                    System.out.println("Inserisci il colore");
                    String colorC = sc.nextLine();

                    Cuffie nuovoCuffie = new Cuffie(nomeC,marcaC,prezzoC,ivaC,isWireless,colorC);
                    lista[itemNumber] = nuovoCuffie;
                    itemNumber++;
                    break;
                case "exit":
                    System.out.println("Grazie per aver aggiunto prodotti al catalogo");
                    addItem=false;
                    break;
                default:
                    System.out.println("Comando non riconosciuto");
                    break;

            }
        } while (addItem &&(itemNumber< lista.length));

        System.out.println("Ecco il catalogo aggiornato");
        for (int i=0;i<itemNumber;i++) {
            System.out.println(lista[i].toString());
        }
    }
}
