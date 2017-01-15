package spring.mvc.spring11.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.mvc.spring11.dto.TestDTO;

@Repository
public class TestRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<TestDTO> selectList(){
		return jdbcTemplate.query("select * from t_peo order by num desc",
				new RowMapper<TestDTO>(){

					@Override
					public TestDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
					
						TestDTO dto = new TestDTO();
						dto.setNum(rs.getInt("num"));
						dto.setName(rs.getString("name"));
						dto.setAge(rs.getInt("age"));
						return dto;
					}
					
				});
	}

}
