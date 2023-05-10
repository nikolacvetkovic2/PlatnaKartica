public class VisaKartica extends PlatnaKartica {
    private String imeOvlascenogLica;
    private String prezimeOvlascenogLica;



    public VisaKartica(double sumaNaRacunu, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartice, String imeOvlascenogLica, String prezimeOvlascenogLica) {
        super(sumaNaRacunu, brojKartice, godinaVazenjaKartice, mesecVazenjaKartice);
        this.imeOvlascenogLica = imeOvlascenogLica;
        this.prezimeOvlascenogLica = prezimeOvlascenogLica;
    }

    public String getImeOvlascenogLica() {
        return imeOvlascenogLica;
    }
    public void setImeOvlascenogLica(String imeOvlascenogLica) {
        this.imeOvlascenogLica = imeOvlascenogLica;
    }
    public String getPrezimeOvlascenogLica() {
        return prezimeOvlascenogLica;
    }
    public void setPrezimeOvlascenogLica(String prezimeOvlascenogLica) {
        this.prezimeOvlascenogLica = prezimeOvlascenogLica;
    }

    @Override
    public void izvrsiTransakciju() {
        double percentage;

            percentage=(1.8/100)*sumaNaRacunu;
            if(percentage<4){
                percentage=4;
            }
            novoStanje=(sumaNaRacunu+percentage);
            System.out.println("Metoda izvrsi transakciju sa min provizijom od 1,8% je: " + novoStanje);
        }
    @Override
    public void podaciOkartici() {
            System.out.println("Visa card:" + " " + brojKartice + "," + " "
                    + mesecVazenjaKartice + "/" + godinaVazenjaKartice + "," + novoStanje + "$");
        }

        // udvostrucena sumu sam ubacio zbog mog vezbanja
        public double udvostrucenaSuma(double putaDva){
             return sumaNaRacunu*putaDva;
        }
        public void ispisUdvostruceneSume(){
            System.out.println("Ispis udvostrucene sume je: " + udvostrucenaSuma(2));
        }
    }



