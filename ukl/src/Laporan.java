/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET
 */
public class Laporan {

    
    public void Laporan(Petugas petugas) {
        System.out.println("------------------------");
        System.out.println("Nama petugas : " + petugas.getNama(0));
        System.out.println("No telp : " + petugas.getTelepon(0));
        String Jabatan = (petugas.getJabatan(0) == 0)? "Owner" : "Pegawai";
        System.out.println("Status : " + Jabatan);
        System.out.println("------------------------");
    }
    
    public void Laporan(JenisLaundry jenislaundry) {
        int x = jenislaundry.getJmlJenisLaundry();
        
        
        System.out.println("Tabel Jenis Laundry");
        System.out.println("----------------------");
        System.out.println("ID \tNama jenis laundry \tDurasi \tHarga/kg ");
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1)+"\t" + jenislaundry.getNamaJenisLaundry(i) + "\t" 
            + jenislaundry.getDurasi(i) + "hr" + "\t" + "\t" +jenislaundry.getHarga(i) +"/kg");
        }
        System.out.println("---------------------");
    }
    
    public void Laporan(Client client ) {
        int x = client.getJmlClient();
        
        System.out.println("Tabel Client");
        System.out.println("----------------------");
        System.out.println("ID \tNama \tAlamat \t      Telp \t      Saldo");
        
        for (int i = 0; i < x; i++) {
            System.out.println((i + 1)+ "\t"+ client.getNama(i)+"\t" + client.getAlamat(i)+ "\t"
            + client.getTelepon(i)+ "\t"+ client.getSaldo(i));
        }
        System.out.println("---------------------");
    }
    
    public void Laporan(Transaksi transaksi, JenisLaundry jenislaundry) {
        int x = transaksi.getJmlTransaksi();
        
        System.out.println();
        System.out.println("Laporan Transaksi Laundry");
        System.out.println();
        System.out.println("ID \tNama Jenis Laundry\tJumlah(kg) \tHarga/kg \tJumlah");
        
        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyak(i)*jenislaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;
            
            System.out.println((i+1) + "\t" + jenislaundry.getNamaJenisLaundry(transaksi.getIdJenisLaundry(i))+"\t"+
           transaksi.getBanyak(i)+ "kg"+ "\t" +"\t"+jenislaundry.getHarga(transaksi.getIdJenisLaundry(i))+ "/kg" + "\t" + "\t"
           + jumlah);
        }
        
        System.out.println("Total : " +total);
    }

}

