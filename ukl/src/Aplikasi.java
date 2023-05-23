/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET
 */
public class Aplikasi {
    static JenisLaundry daftarJenisLaundry = new JenisLaundry();
    static Client daftarClient = new Client();
    static Petugas petugaslaundry = new Petugas();
    static Transaksi transaksilaundry = new Transaksi();
    static Laporan laporanlaundry = new Laporan();
    public static void main(String[] args) {
        laporanlaundry.Laporan(daftarClient);
        System.out.println();
        laporanlaundry.Laporan(daftarJenisLaundry);
        System.out.println();
        transaksilaundry.ProsesTransaksi(daftarClient, transaksilaundry, daftarJenisLaundry);
        System.out.println();
        laporanlaundry.Laporan(petugaslaundry);
        laporanlaundry.Laporan(transaksilaundry, daftarJenisLaundry);
    }
}

