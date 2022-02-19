package kodlamaio.northwind.core.utilities.results;

public class SuccessResult extends Result{
	
	//mesaj vermek istemiyorsa
	public SuccessResult() {
		super(true);
	}
	
	//mesaj döndürmek istiyorsa
    public SuccessResult(String message) {
		super(true,message);
	}

}
