public class MasterKartica extends PlatnaKartica {

    public MasterKartica(double sumaNaRacunu, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartice) {
        super(sumaNaRacunu, brojKartice, godinaVazenjaKartice, mesecVazenjaKartice);
    }

    @Override
    public void izvrsiTransakciju() {
        double percentage;
        percentage=(1.5/100)*sumaNaRacunu;
        novoStanje=(sumaNaRacunu+percentage);
   System.out.println("Metoda izvrsi transakciju sa min provizijom od 1,5% je: " + novoStanje);
    }

    @Override
    public void podaciOkartici() {
        System.out.println("Master card: " + mesecVazenjaKartice +
                "/" + godinaVazenjaKartice + "," + brojKartice + "," + " " + novoStanje + "$");
    }
    public void naplatiOdrzavanje(){
        double odrzavanjeSumeNaRacunu;
        odrzavanjeSumeNaRacunu=novoStanje-2;
        System.out.println("Trenutna sredstva umanjena za 2 $ na racunu su: " + odrzavanjeSumeNaRacunu);
    }

}
