package lab11;

public class Cynemas {
	private String category;
	private String pickMovie;

	public Cynemas() {

	}
	
	public Cynemas(String pickMovie, String category) {
		this.category = category;
		this.pickMovie = pickMovie;
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPickMovie() {
		return pickMovie;
	}

	public void setPickMovie(String pickMovie) {
		this.pickMovie = pickMovie;
	}
}
