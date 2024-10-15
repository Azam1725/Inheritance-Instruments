package Music;

public class Piano extends Instruments{
    protected String pianoType;

    public String getpianoType () {
        return this.pianoType;
    }

    public void setpianoType (String pianoType) {
        this.pianoType = pianoType;
    }

    public Piano() {
        pianoType = "Classical";
    }

    public Piano(String nama, double price, String pianoType) {
        super(nama, price);
        this.pianoType = pianoType;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("PianoType : "+pianoType);
    }
}
