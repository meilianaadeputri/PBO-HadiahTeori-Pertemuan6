import java.util.Scanner;
class hitung
{
	float sisi,r,luas,volum;
	
	public void setKubus(float sisi){
		volum=sisi*sisi*sisi;
	}
	
	public float getVolum(){
		return volum;	
	}
	
	public void setLingkaran(float r){
		this.luas=3.14f*r*r;
	}
	
	public float getLuas(){
		return luas;
	}
}

public class hadiah6_1 {
	public static void main(String args[]) {
		hitung a=new hitung();
		Scanner input=new Scanner(System.in);
		System.out.print("Masukkan jari-jari lingkaran: ");
		a.r=input.nextFloat();
		a.setLingkaran(a.r);
		System.out.println("Luas lingkaran	: " + a.getLuas());
		
		System.out.println("============================");
		
		System.out.print("Masukkan sisi kubus: ");
		a.sisi=input.nextFloat();
		a.setKubus(a.sisi);
		System.out.println("Volume kubus	: " + a.getVolum());
	}
}