package spring.mvc.spring11.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import spring.mvc.spring11.dto.PeopleDTO;

@Repository
public class PeopleRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertOne(PeopleDTO dto) {
		return jdbcTemplate.update(
				"insert into t_peo02 values(t_peo02_seq.nextval, ?,?,?,?)",
				new Object[]{dto.getName(), dto.getAge(), 
								dto.getOrgName(), dto.getSysName()}
				);
	}

	public List<Object> selectList() {
		
		return jdbcTemplate.query(
				"select * from t_peo02",
				new RowMapper<Object>() {
					@Override
					public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						PeopleDTO dto = new PeopleDTO();
						dto.setNum(rs.getInt("num"));
						dto.setName(rs.getString("name"));
						dto.setAge(rs.getInt("age"));
						dto.setOrgName(rs.getString("orgName"));
						dto.setSysName(rs.getString("sysName"));
						
						return dto;
					}
				});
	}

	public int delete(Integer num) {
		
		return jdbcTemplate.update(
				"delete t_peo02 where num=?",
				new Object[]{num});
	}

	public int update(int num, String newSysName, String newOrgName) {
		return jdbcTemplate.update(
				"update t_peo02 set orgName=?, sysName=? where num=?",
				new Object[]{num, newSysName, newOrgName});
	}

}
