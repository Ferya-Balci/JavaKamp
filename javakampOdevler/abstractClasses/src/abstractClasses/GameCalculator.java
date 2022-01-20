package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
	
	
	//Oyun bitiþi tüm kullanýcýlar için ayný(deðiþtirilemez-final) ancak hesaplama kullanýcý tipine göre deðiþim gösteriyor.
    //hesapla operasyonu var .Sýnýfý kim implemente ediyorsa kendi hesapla metodunu yazmak(override) zorunda.

}
