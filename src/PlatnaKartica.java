public abstract class PlatnaKartica {
   public double sumaNaRacunu;
   public String brojKartice;
    int godinaVazenjaKartice;
    int mesecVazenjaKartice;
    protected double novoStanje; // njega ne unosimo u konstruktor, ova suma se racuna

    public PlatnaKartica(double sumaNaRacunu, String brojKartice, int godinaVazenjaKartice, int mesecVazenjaKartice) {
        this.sumaNaRacunu = sumaNaRacunu;
        this.brojKartice = brojKartice;
        this.godinaVazenjaKartice = godinaVazenjaKartice;
        this.mesecVazenjaKartice = mesecVazenjaKartice;
    }
    public double getSumaNaRacunu() {
        return sumaNaRacunu;
    }
    public String getBrojKartice() {
        return brojKartice;
    }
    public int getGodinaVazenjaKartice() {
        return godinaVazenjaKartice;
    }
    public int getMesecVazenjaKartice() {
        return mesecVazenjaKartice;
    }

    public void dodajSredstva(){
        System.out.println("Trenutna sredstva na racunu su:" + sumaNaRacunu);
    }
    public abstract void izvrsiTransakciju();
    public abstract void podaciOkartici();
}
