
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET
 */
public class JenisLaundry {
    
    private ArrayList<String> NamaJenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> Harga = new ArrayList<Integer>();
    private ArrayList<Integer> Durasi = new ArrayList<Integer>();
    
    public JenisLaundry() {
        setNamaJenisLaundry("Reguler");
        setDurasi(5);
        setHarga(7000);
        
        setNamaJenisLaundry("Si cepat kilat");
        setDurasi(3);
        setHarga(9000);
        
        setNamaJenisLaundry("Express");
        setDurasi(2);
        setHarga(20000);
              
    }
    
    public int getJmlJenisLaundry(){
        return this.NamaJenisLaundry.size();
    }    public void setNamaJenisLaundry(String NamaJenisLaundry) {
        this.NamaJenisLaundry.add(NamaJenisLaundry);
    }
    String getNamaJenisLaundry(int idJenisLaundry){
        return this.NamaJenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int Durasi ){
        this.Durasi.add(Durasi);
    }
    public int getDurasi(int idJenisLaundry){
        return this.Durasi.get(idJenisLaundry);
    }
    
   public void editDurasi(int idJenisLaundry, int Durasi){
       this.Durasi.set(idJenisLaundry, Durasi);
   }
   
   public void setHarga(int Harga){
       this.Harga.add(Harga);
   }
   public int getHarga(int idJenisLaundry){
       return this.Harga.get(idJenisLaundry);
   }

    
}

