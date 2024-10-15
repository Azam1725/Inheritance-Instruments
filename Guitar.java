package Music;

public class Guitar extends StringInstruments{
    protected boolean isElectric;

    public boolean isElectric() {
        return this.isElectric;
    }

    public void setisElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar() {
        isElectric=false;
    }

    public Guitar(String nama, double price, int numString, boolean isElectric) {
        super(nama, price, numString);
        this.isElectric = isElectric;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Gitar klasik : "+ isElectric);
    }

}
