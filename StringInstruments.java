package Music;

public class StringInstruments extends Instruments{
    private int numString;

    public int getNumString() {
        return this.numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    public StringInstruments() {
        numString=7;
    }

    public StringInstruments(String nama, double price, int numString) {
        super(nama, price);
        this.numString=numString;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Jumlah Senar:"+numString);
    }

}