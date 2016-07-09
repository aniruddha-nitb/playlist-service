package playlist;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class TrackDaoService {
	@Autowired
    JdbcTemplate jdbcTemplate;
	
    public List<String> getPlaylist(String tracks) {
        	return jdbcTemplate.query("select t.TRACK_NAME, a.TAG_NAME from TRACKS as t, TAGS as a where TAG_NAME in ("+tracks+") and a.ID=t.TAG_ID", new RowMapper<String>() {
                @Override
                public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                    String res=rs.getString("TRACK_NAME")+" => "+rs.getString("TAG_NAME");
                	return res;
                }
            });
    }
}