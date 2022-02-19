package kodlamaio.northwind.core.utilities.results;

public class ErrorResult extends Result {

	//mesaj vermek istemiyorsa
	public ErrorResult() {
		super(false);
	}
	
	//mesaj döndürmek istiyorsa
    public ErrorResult(String message) {
		super(false,message);
	}

}
