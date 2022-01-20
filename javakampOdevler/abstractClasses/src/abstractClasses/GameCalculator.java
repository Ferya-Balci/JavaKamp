package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
	
	
	//Oyun biti�i t�m kullan�c�lar i�in ayn�(de�i�tirilemez-final) ancak hesaplama kullan�c� tipine g�re de�i�im g�steriyor.
    //hesapla operasyonu var .S�n�f� kim implemente ediyorsa kendi hesapla metodunu yazmak(override) zorunda.

}
