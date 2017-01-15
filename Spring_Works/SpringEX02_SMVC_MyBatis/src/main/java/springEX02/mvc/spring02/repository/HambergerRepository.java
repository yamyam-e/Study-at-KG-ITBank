package springEX02.mvc.spring02.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springEX02.mvc.spring02.dto.HambergerDTO;

@Repository
public class HambergerRepository {
	
	@Autowired
	private SqlSession jdbcTemplate;
	
	public List<HambergerDTO> selectList() {
		return jdbcTemplate.selectList("hamMapper.selectList");
	}

	public int insertOne(HambergerDTO dto) {
		return jdbcTemplate.insert("hamMapper.insertOne", dto);
	}

	public int deleteOne(String num) {
		return jdbcTemplate.delete("hamMapper.deleteOne", num);
	}

	public int updateOne(HambergerDTO dto) {
		return jdbcTemplate.update("hamMapper.updateOne", dto);
	}

	public HambergerDTO selectOne(String num) {
		return jdbcTemplate.selectOne("hamMapper.selectOne", num);
	}
	
}
