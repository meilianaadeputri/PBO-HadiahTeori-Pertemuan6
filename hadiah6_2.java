import java.util.Scanner;
class Siswa {
	String nama;
	String jurusan;
	String nim;
	
	void setnama(String namasiswa){
		nama=namasiswa;
	}
	
	void setjurusan(String jurusansiswa){
		jurusan=jurusansiswa;
	}
	
	void setnim(String nimsiswa){
		nim=nimsiswa;
	}
	
	void cetak(){
		System.out.println("Nama saya adalah "+nama+" jurusan saya adalah "+jurusan+" dan nim saya "+nim);
	}
}

public class hadiah6_2 {
	public static void main(String args[]) {
		Siswa s;
		s = new Siswa();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nama: ");
		s.nama=input.nextLine();
		s.setnama(s.nama);
		
		System.out.print("Masukkan jurusan: ");
		s.jurusan=input.nextLine();
		s.setjurusan(s.jurusan);
		
		System.out.print("Masukkan nim: ");
		s.nim=input.nextLine();
		s.setnim(s.nim);
		s.cetak();
	}
}