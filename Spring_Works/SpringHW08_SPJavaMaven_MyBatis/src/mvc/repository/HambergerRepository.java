package mvc.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import mvc.dto.HambergerDTO;
import mvc.dto.MapperDTO;

@Repository("repository")
public class HambergerRepository extends DefaultTransactionDefinition{

	@Autowired
	private SqlSession sqlSessionTemplate;
	
	@Autowired
	private PlatformTransactionManager tx;
	private TransactionStatus status;
	
	public int insertOne(HambergerDTO dto) {
		
		status = tx.getTransaction(this);
		
		int res = sqlSessionTemplate.insert("hambergerMapper.insertOne", dto);
		
		if(res > 0){
			tx.commit(status);
		} else {
			tx.rollback(status);
		}
		return res;
	}

	public List<HambergerDTO> selectList() {
		return sqlSessionTemplate.selectList("hambergerMapper.selectList");
	}

	public HambergerDTO search(String search) {
		return sqlSessionTemplate.selectOne("hambergerMapper.searchByString", search);
	}

	public HambergerDTO search(int search) {
		return sqlSessionTemplate.selectOne("hambergerMapper.searchByInteger", search);
	}

	public HambergerDTO search(HambergerDTO rcvDto) {
		return sqlSessionTemplate.selectOne("hambergerMapper.searchByDto", rcvDto);
	}

	public List<HambergerDTO> selectList(MapperDTO mDto) {
		return sqlSessionTemplate.selectList("hambergerMapper.selectListByRange", mDto);
	}

	public HambergerDTO selectOneByColName(MapperDTO mDto) {
		return sqlSessionTemplate.selectOne("hambergerMapper.selectOneByColName", mDto);
	}

	public int update(HambergerDTO dto) {
		return sqlSessionTemplate.update("hambergerMapper.update", dto);
	}

	public int delete(HambergerDTO dto) {
		return sqlSessionTemplate.delete("hambergerMapper.delete", dto);
	}

	public List<HambergerDTO> selectListByKeyWord(MapperDTO mDto) {
		return sqlSessionTemplate.selectList("hambergerMapper.selectListByKeyWord", mDto);
	}

}
