package j�dev2;

public class Main {

	public static void main(String[] args) {
		
		Kurslar kurs1=new Kurslar(1,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(JavaScript)","15 ay s�recek kamp.�cretsiz.");
		Kurslar kurs2=new Kurslar(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C#,Angular)","2 ay s�recek kamp.�cretsiz");
		Kurslar kurs3=new Kurslar(3,"Java&React Kamp�","2 ay s�recek.�cretsiz");
		
		Kurslar[] kurslistesi= {kurs1,kurs2,kurs3};
		
		for(Kurslar kurslarliste:kurslistesi) {
			System.out.println(kurslarliste.name);
		}
		
		Egitmen egitmen1=new Egitmen();
		egitmen1.id=1;
		egitmen1.name="Eengin Demiro�";
		egitmen1.kursadedi=4;
		
	
		Kay�tOl kayit=new Kay�tOl();
		kayit.Kay�t(kurs1);
	}

}
