
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET
 */
public class Transaksi {

    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> Banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    
    public void ProsesTransaksi (Client client, Transaksi transaksi, JenisLaundry jenislaundry) {
        Scanner myObj = new Scanner(System.in) ;
        System.out.println("Selamat datang di UncukLaundry");
        System.out.print("Masukkan id Client : ");
        int idClient = myObj.nextInt()-1;
        System.out.println("Halo " + client.getNama(idClient));
        
        int i = 0;
        int temp = 0;
        do {
            System.out.println("Masukkan kode jenis Laundry (ketik 00 jika sudah selesai memilih) : ");
            temp = myObj.nextInt();
            if(temp != 00) {
                idJenisLaundry.add(temp-1);
                System.out.print(jenislaundry.getNamaJenisLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                Banyak.add(myObj.nextInt());
                i++;
            }    
        } while(temp !=00);
        
        System.out.println();
        System.out.println("Transaksi " + client.getNama(idClient) + "sebagai berikut :");
        System.out.println("Nama barang \t \tBanyak(kg) \tHarga \tJumlah \t");
        
        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = Banyak.get(j)*jenislaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenislaundry.getNamaJenisLaundry(idJenisLaundry.get(j)) + "\t"
            + Banyak.get(j) + "\t" + "\t" + jenislaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t"
            + jumlah);
         transaksi.setTransaksi(jenislaundry, idClient, idJenisLaundry.get(j),Banyak.get(j));
            
        }
        
        System.out.println("Jumlah total Laundry : " +total);
        if(total > client.getSaldo(idClient)) {
            System.out.println("Maaf.. saldo anda tidak cukup");
            System.exit(0);
        }
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        System.out.println("Sisa saldo anda : " +client.getSaldo(idClient));
    }

    private void setTransaksi(JenisLaundry jenislaundry, int idClient, Integer idJenisLaundry, Integer Banyak) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.Banyak.add(Banyak);
        jenislaundry.editDurasi(idJenisLaundry, jenislaundry.getDurasi(idJenisLaundry));
        
    }

    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyak(int id) {
        return this.Banyak.get(id);
    }


     int getJmlTransaksi() {
         return this.idClient.size();
    }

   
}

