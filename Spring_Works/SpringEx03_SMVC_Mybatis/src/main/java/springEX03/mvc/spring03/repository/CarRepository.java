package springEX03.mvc.spring03.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarRepository {
	
	@Autowired
	private SqlSession sqlTemplate;

}
