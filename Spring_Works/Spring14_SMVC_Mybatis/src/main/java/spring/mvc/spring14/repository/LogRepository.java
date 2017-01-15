package spring.mvc.spring14.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.spring14.dto.LogValidateDTO;

@Repository
public class LogRepository {
	
	@Autowired
	private SqlSession sqlSessionTemplate;

	public LogValidateDTO selectOne(LogValidateDTO dto) {
		return sqlSessionTemplate.selectOne("logMapper.selectOne", dto);
	}

	public LogValidateDTO checkID(String id) {
		return sqlSessionTemplate.selectOne("logMapper.checkID", id);
	}

	public int insertOne(LogValidateDTO dto) {
		return sqlSessionTemplate.insert("logMapper.insertOne", dto);
	}

}
