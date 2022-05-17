package pbouts;
public class rumus2 {
    public int Gaji;
    public int Bulan;
   
    public int getGaji() { return Gaji;}
       public void setGaji(int gaji) {this.Gaji = gaji;}

    public int getBulan() {return Bulan;}   
       public void setBulan(int kerja) {this.Bulan = kerja;}
    
   public int hitung(){
          double Total = 0;
            if (Bulan >= 12) {Total=Gaji;}
        return (int) Total;}
}