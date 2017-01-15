package spring.mvc.spring13.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.spring13.dto.StudentDTO;

@Repository
public class StudentRepository {
	
	@Autowired
	private SqlSession sqlSessionTemplate;

	public List<Object> selectList() {
		return sqlSessionTemplate.selectList("stuMapper.selectList");
	}

	public int insertOne(StudentDTO dto) {
		return sqlSessionTemplate.insert("stuMapper.insertOne", dto);
	}

	public int update(StudentDTO dto) {
		return sqlSessionTemplate.update("stuMapper.update", dto);
	}
	
	public int update(String num){
		return sqlSessionTemplate.delete("stuMapper.delete", num);
	}

	public StudentDTO selectOne(String num) {
		return sqlSessionTemplate.selectOne("stuMapper.selectOne", num);
	}
	
}
