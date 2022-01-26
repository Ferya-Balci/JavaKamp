package jÖdev2;

public class Kurslar {

	public Kurslar() {
		System.out.println("Parametresiz metod çalıştı.");
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
