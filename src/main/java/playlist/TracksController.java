package playlist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TracksController {

	@Autowired
	TrackService trackService;
	
    @RequestMapping(method=RequestMethod.GET, value="/explore")
    public java.util.List<String> track(@RequestParam(value="track")List<String> tracks) {
    	System.out.println("Track name is "+tracks);
    	return trackService.getPlaylist(tracks);
    }
}
