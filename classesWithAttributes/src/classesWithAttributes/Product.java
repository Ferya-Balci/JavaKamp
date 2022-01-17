package classesWithAttributes;

public class Product {
	//Her classsýn kendi isminde Constructor'ý vardýr.
	//Yapýcý method
	//Sýrasýyla parametreleri verirsen çalýþýr diyor
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Yapýcý blok çalýþtý");
		//new product diyince çalýþýr.
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._renk=renk;
	}
	public Product() {
		
	}//Product classýnýn iki tane const var .Ýstenilen kullanýlýr.Overloading.
	
	//Attribute or field
	//bu ürünü public olarak iþaretlemiþ olduk,diðer classlardan ulaþýlabiliyor.
	//eðer private olarak iþaretlersek.Sadece tanýmlandýðý blokta geçerli olur.
	// int id;-->public
    private int _id;// _ ile ayýrt etmek iyi.Bunlar field
	private String _name;
	private String _description;//açýklama
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	//Sadece get yazar set yazmazsak readonly olur
	//Bu deðerlere baþka yerden ulaþabilmek için getter ve setterdan yararlanýrýz.
	public int getId() { //getter
		return _id;
	}
	public void setId(int id) {//setter
		_id=id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		_name=name;
	}
	public String getDescription() {
		return _description;
	}
	public void setDescription(String _description) {
		this._description = _description;
	}
	public double getPrice() {
		return _price;
	}
	public void setPrice(double _price) {
		this._price = _price;
	}
	public int getStockAmount() {
		return _stockAmount;
	}
	public void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}
	public String getRenk() {
		return _renk;
	}
	public void setRenk(String _renk) {
		this._renk = _renk;
	}
	public String getKod() {
		return this._name.substring(0,1)+_id;
	}
	//Kodu yazýlabilir istemediðim için setter ý sildim.
	
	//Bu getter ve setter iþlemleri.Sað týk Refactorden oto kapsülleyebiliriz.
	
	
}
