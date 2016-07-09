package playlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TrackService {
	@Autowired
	TrackDaoService trackDaoService;
	
	public List<String> getPlaylist(List<String> tracks){
		String track="\"";
		for(String t: tracks){
			track+=(t+"\",\"");
		}
		return trackDaoService.getPlaylist(track.substring(0, track.length()-2));
	}
}
