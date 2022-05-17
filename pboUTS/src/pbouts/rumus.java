package pbouts;
public class rumus {

public int Bulan;
public int Gaji;
public int Total;

private int getBulan() {return Bulan;}       
    public double setBulan(double bulan) {return bulan = getBulan();}
              
private int getGaji() {return Gaji;}       
    public void setGaji(int gaji) {this.Gaji = gaji;} 

public double hitung(){
    return Total = (getGaji()/12) * getBulan();
    }
}