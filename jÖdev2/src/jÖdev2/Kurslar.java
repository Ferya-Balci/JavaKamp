package j�dev2;

public class Kurslar {

	public Kurslar() {
		System.out.println("Parametresiz metod �al��t�.");
	}
	public Kurslar(int id,String name,String detail) {
		this();
		
		this.id=id;
		this.name=name;
		this.detail=detail;
		
	}
	int id;
	String name;
	String detail;
}
