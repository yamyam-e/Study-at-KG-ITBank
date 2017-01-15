package mvc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mvc.dto.PeopleDTO;

@Repository("repository")
public class PeopleRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertOne(PeopleDTO dto) {
		
		return jdbcTemplate.update(
				"insert into t_peo values(t_peo_seq.nextval, ?, ?)",
				new Object[]{dto.getName(), dto.getAge()}
				);
	}

	public List<PeopleDTO> selectList() {
		
		
		
		return jdbcTemplate.query(
				"select * from t_peo order by num desc", 
				new RowMapper<PeopleDTO>() {

					@Override
					public PeopleDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
						System.out.println("rowNum : " + rowNum);
						
						PeopleDTO dto = new PeopleDTO();
						dto.setNum(rs.getInt("num"));
						dto.setName(rs.getString("name"));
						dto.setAge(rs.getInt("age"));
						
						return dto;
					}
				
				}
			);
	}

	public PeopleDTO selectOne(PeopleDTO rcvDto) {
		
		return (PeopleDTO) jdbcTemplate.queryForObject(
							"select * from t_peo where name=?",
							new Object[]{rcvDto.getName()},
							new RowMapper<PeopleDTO>() {

								@Override
								public PeopleDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
									PeopleDTO dto = new PeopleDTO();
									dto.setNum(rs.getInt("num"));
									dto.setName(rs.getString("name"));
									dto.setAge(rs.getInt("age"));
									return dto;
								}
							});
	}
	
}
