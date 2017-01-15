package mvc.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import mvc.dto.MapperDTO;
import mvc.dto.PeopleDTO;

@Repository("repository")
public class PeopleRepository extends DefaultTransactionDefinition{

	@Autowired
	private SqlSession sqlSessionTemplate; 
	
	@Autowired
	private PlatformTransactionManager tx;
	private TransactionStatus status;
	
	public int insertOne(PeopleDTO dto) {
		
		status = tx.getTransaction(this);
		
		int res = sqlSessionTemplate.insert("peopleMapper.insertOne", dto);
		
		if(res > 0){
			tx.commit(status);
		} else{
			tx.rollback(status);
		}
		return res;
	}

	public List<PeopleDTO> selectList() {
		
		return sqlSessionTemplate.selectList("peopleMapper.selectList");
	}

	public PeopleDTO searchName(String search) {
		
		return sqlSessionTemplate.selectOne("peopleMapper.searchName1", search);
	}

	public PeopleDTO searchName2(PeopleDTO peoDto) {
		
		return sqlSessionTemplate.selectOne("peopleMapper.searchName2", peoDto);
	}

	public List<PeopleDTO> searchArea(MapperDTO mmDto) {
		
		return sqlSessionTemplate.selectList("peopleMapper.searchArea", mmDto);
	}

	public PeopleDTO searchSQL(MapperDTO mm) {
	
		return sqlSessionTemplate.selectOne("peopleMapper.searchSQL", mm);
	}

	public List<PeopleDTO> searchKey(MapperDTO mm) {
		
		return sqlSessionTemplate.selectList("peopleMapper.searchKey", mm);
	}

	
	
}
