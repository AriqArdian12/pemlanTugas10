public class Player {
    private int tinggi;
    private int berat;
    private String tim;
    private int nomor;

    public Player(int nomor, int tinggi, int berat, String tim) {
        this.nomor = nomor;
        this.tinggi = tinggi;
        this.berat = berat;
        this.tim = tim;
    }

    public int getTinggi() { 
        return tinggi; 
    }
    public int getBerat() { 
        return berat; 
    }
    public String getTim() { 
        return tim; 
    }
    public int getNomor() { 
        return nomor; 
    }

    @Override
    public String toString() {
        return String.format("Player %d (%s): %d cm, %d kg", nomor, tim, tinggi, berat);
    }
}
