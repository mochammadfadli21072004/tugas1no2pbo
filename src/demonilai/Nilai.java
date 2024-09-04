/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demonilai;

/**
 *
 * @author 23106
 */
public class Nilai {
    
    	String nim;
	String nama;
	
	float Nilaiabsen;
	float Nilaitugas;
	float UTS;
	float UAS;
	float Nilaiakhir;
	
	void nilai() {
		Nilaiabsen = Nilaiabsen * 10/100;
		Nilaitugas = Nilaitugas * 20/100;
		UTS = UTS * 30/100;
		UAS = UAS * 40/100;
		Nilaiakhir = Nilaiabsen + Nilaitugas + UTS + UAS;
		
	}
	void CN() {
		System.out.println("Nim anda : " + this.nim);
		System.out.println("Nama anda : " + this.nama);
		System.out.println("Nilai Absen lu : " + this.Nilaiabsen);
		System.out.println("Nilai tugas lu : " + this.Nilaitugas);
		System.out.println("Nilai UTS lu : " + this.UTS);
		System.out.println("Nilai UAS lu : " + this.UAS);
		System.out.println("Nilai nilai akhir lu : " + this.Nilaiakhir);
	}
}

