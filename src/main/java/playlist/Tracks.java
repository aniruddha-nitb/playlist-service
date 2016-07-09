package playlist;

public class Tracks {

	private final long id;
    private final String trackName;
    
    public Tracks(long id, String trackName) {
        this.id = id;
        this.trackName = trackName;
    }

    public long getId() {
        return id;
    }
    
    public String getTrackName() {
		return trackName;
	}
}
