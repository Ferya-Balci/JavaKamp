package jÖdev2;

public class Main {

	public static void main(String[] args) {
		
		Kurslar kurs1=new Kurslar(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(JavaScript)","15 ay sürecek kamp.Ücretsiz.");
		Kurslar kurs2=new Kurslar(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(C#,Angular)","2 ay sürecek kamp.Ücretsiz");
		Kurslar kurs3=new Kurslar(3,"Java&React Kampý","2 ay sürecek.Ücretsiz");
		
		Kurslar[] kurslistesi= {kurs1,kurs2,kurs3};
		
		for(Kurslar kurslarliste:kurslistesi) {
			System.out.println(kurslarliste.name);
		}
		
		Egitmen egitmen1=new Egitmen();
		egitmen1.id=1;
		egitmen1.name="Eengin Demiroð";
		egitmen1.kursadedi=4;
		
	
		KayýtOl kayit=new KayýtOl();
		kayit.Kayýt(kurs1);
	}

}
