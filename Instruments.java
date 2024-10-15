package Music;
//superclass
public class Instruments {
   protected String nama;
   protected double price;

   public String getNama() {
      return this.nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

     public Instruments() {
      nama="";
      price=0;
     }
     public Instruments(String nama, double price) {
      this.nama=nama;
      this.price=price;
     }

   public void print() {
        System.out.println("Nama: "+ nama);
        System.out.println("Harga: "+ price);
     }
}
