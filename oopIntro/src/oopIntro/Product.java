package oopIntro;


public class Product {

	private int id; //nesneyi diðer nesnelerden ayýran özellik
	private String name;
	private double unitPrice;//birim fiyatý
	private String detail;//açýklama
	private double discount;//indirim oraný
	
	
	public Product() {
		
	}
	
	//kýsa yol.sað týk source.generate cons. using fields
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
	
	
	
	
	
	//**constructor--yapýcý blok--classý oluþtururken yapmasýný istediðin birþey varsa buraya yazýyorsun
	/*public Product() {
		System.out.println("Ben çalýþtým.");
		
	}
	//Bir imza oluþturduk.Nesneyi oluþtururken bana id,.. bunlarý yolla dedik.
	//Tek satýrda ürün özelliklerini çekebiliriz.Kodu yapýcý blok vasýtasýyla kýsalttýk.
	public Product(int id,String name,double unitPrice,String detail) {
		this();//bu claasýn parametresiz metodunu çalýþtýr.
		//içini doldurmak için bu deðerleri tanýmlý deðerlere eþitliyoruz.
		this.id=id;//bu class'taki id=bu id'dir.
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}*/
	
	
	
	
}
