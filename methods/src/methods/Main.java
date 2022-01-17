package methods;

public class Main {

	public static void main(String[] args) {
		//Ayn� class�n i�inde oldu�u i�in metodu bu �ekilde �a��rarak �al��t�rabiliriz.
		sayiBulmaca();
		//metodu projenin istedi�in yerinden �a��rabilirsin.de�i�iklik yapmak i�in avantaj.
	    sayiBulmaca();
	    sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,5,7,9,0};
		int aranacak=6;
		boolean varMi=false;
		
		for(int sayi:sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			mesajVer("Say� mevcuttur: "+aranacak);
		}
		else {
			mesajVer("Say� mevcut de�ildir: "+aranacak);
		}
	}
	public static void mesajVer(String mesaj){
		System.out.println(mesaj);
}

}

 