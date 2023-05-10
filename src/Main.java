

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        VisaKartica visaKartica=new VisaKartica(1000,"123-56789-789",
                2025,20,"NIkola","Cvetkovic");
             visaKartica.setImeOvlascenogLica("Pera");
             System.out.println(visaKartica.getImeOvlascenogLica());
             visaKartica.setPrezimeOvlascenogLica("Markovic");
             System.out.println(visaKartica.getPrezimeOvlascenogLica());

        visaKartica.dodajSredstva();
        visaKartica.izvrsiTransakciju();
        visaKartica.podaciOkartici();
        visaKartica.udvostrucenaSuma(2); // ovo sam ja dodao zbog moje vezbe
        visaKartica.ispisUdvostruceneSume();  // ovo sam ja dodao zbog moje vezbe

        System.out.println();

        MasterKartica masterKartica= new MasterKartica(4000,
                "123-456789-448",2023,4);
        masterKartica.dodajSredstva();
        masterKartica.izvrsiTransakciju();
        masterKartica.podaciOkartici();
        masterKartica.naplatiOdrzavanje();

    }
}