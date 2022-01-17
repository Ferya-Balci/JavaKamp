package oopIntro;


public class Product {

	private int id; //nesneyi di�er nesnelerden ay�ran �zellik
	private String name;
	private double unitPrice;//birim fiyat�
	private String detail;//a��klama
	private double discount;//indirim oran�
	
	
	public Product() {
		
	}
	
	//k�sa yol.sa� t�k source.generate cons. using fields
	public Product(int id, String name, double unitPrice, 
			String detail,double discount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
	}

	//Encapsulation
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
  
	//sadece okunabilir.
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
	
	
	
	
	
	//**constructor--yap�c� blok--class� olu�tururken yapmas�n� istedi�in bir�ey varsa buraya yaz�yorsun
	/*public Product() {
		System.out.println("Ben �al��t�m.");
		
	}
	//Bir imza olu�turduk.Nesneyi olu�tururken bana id,.. bunlar� yolla dedik.
	//Tek sat�rda �r�n �zelliklerini �ekebiliriz.Kodu yap�c� blok vas�tas�yla k�saltt�k.
	public Product(int id,String name,double unitPrice,String detail) {
		this();//bu claas�n parametresiz metodunu �al��t�r.
		//i�ini doldurmak i�in bu de�erleri tan�ml� de�erlere e�itliyoruz.
		this.id=id;//bu class'taki id=bu id'dir.
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}*/
	
	
	
	
}
