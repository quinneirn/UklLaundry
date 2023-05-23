
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
    public class Client implements User {
    
    private ArrayList<String> NamaClient = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<Integer> Saldo = new ArrayList<Integer>();
    
    public Client(){
        setNama("gavin");
        setAlamat("jalan pertigaan");
        setTelepon("081534249289");
        setSaldo(500000);
        
        setNama("awann");
        setAlamat("jalan perempatan");
        setTelepon("087863499088");
        setSaldo(700000);
        
        setNama("yucil");
        setAlamat("jalan sebelah");
        setTelepon("0868492342");
        setSaldo(400000);

    }
    
    public void setSaldo(int Saldo){
        this.Saldo.add(Saldo);
    }
    public int getSaldo(int idClient){
        return this.Saldo.get(idClient);
    }
    public void editSaldo (int idClient, int Saldo){
        this.Saldo.set( idClient, Saldo);
    }
    public int getJmlClient(){
        return this.Saldo.size();
    }

    @Override
    public void setNama(String namaClient) {
        this.NamaClient.add(namaClient);
    }

    @Override
    public void setAlamat(String alamat) {
        this.Alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.Telepon.add(telepon);
    }

    @Override
    public String getNama(int idClient) {
        return this.NamaClient.get(idClient);
    }

    @Override
    public String getAlamat(int idClient) {
        return this.Alamat.get(idClient);
    }

    @Override
    public String getTelepon(int idClient) {
    return this.Telepon.get(idClient);
    }

    
    
}

