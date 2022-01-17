package classesWithAttributes;

public class Product {
	//Her classs�n kendi isminde Constructor'� vard�r.
	//Yap�c� method
	//S�ras�yla parametreleri verirsen �al���r diyor
	public Product(int id,String name,String description,double price,int stockAmount,String renk) {
		System.out.println("Yap�c� blok �al��t�");
		//new product diyince �al���r.
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._renk=renk;
	}
	public Product() {
		
	}//Product class�n�n iki tane const var .�stenilen kullan�l�r.Overloading.
	
	//Attribute or field
	//bu �r�n� public olarak i�aretlemi� olduk,di�er classlardan ula��labiliyor.
	//e�er private olarak i�aretlersek.Sadece tan�mland��� blokta ge�erli olur.
	// int id;-->public
    private int _id;// _ ile ay�rt etmek iyi.Bunlar field
	private String _name;
	private String _description;//a��klama
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;

	//Sadece get yazar set yazmazsak readonly olur
	//Bu de�erlere ba�ka yerden ula�abilmek i�in getter ve setterdan yararlan�r�z.
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
	//Kodu yaz�labilir istemedi�im i�in setter � sildim.
	
	//Bu getter ve setter i�lemleri.Sa� t�k Refactorden oto kaps�lleyebiliriz.
	
	
}
