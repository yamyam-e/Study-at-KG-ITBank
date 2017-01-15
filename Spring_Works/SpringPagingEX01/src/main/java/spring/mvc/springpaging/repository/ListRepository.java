package spring.mvc.springpaging.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.springpaging.dto.ListDTO;

@Repository("repository")
public class ListRepository {
	
	@Autowired
	private SqlSession sqlSessionTemplate;

	public List<ListDTO> findAll() {
		return sqlSessionTemplate.selectList("mylist.selectAll");
	}
}
