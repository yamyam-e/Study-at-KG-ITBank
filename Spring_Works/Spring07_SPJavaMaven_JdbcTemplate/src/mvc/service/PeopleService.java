package mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import mvc.dto.PeopleDTO;
import mvc.repository.PeopleRepository;

//	service : 비지니스 관점에서의 계산, 유효성 검사, 트랜잭션 관리 등

@Service("service")
public class PeopleService extends DefaultTransactionDefinition{
	
	@Autowired
	private PeopleRepository repository;

	@Autowired
	private PlatformTransactionManager tx;
	
	private TransactionStatus status;
	
	public int insertOne(PeopleDTO dto) {
		
		// 커밋 과 롤백에 대한 트랜젝션 지점을 설정 하는 것
		status = tx.getTransaction(this);
		
		int res = repository.insertOne(dto);
		
		if(res>0){
			tx.commit(status);
		} else {
			tx.rollback(status);
		}
		
		return res;
	}

	public List<PeopleDTO> selectList() {
		
		return repository.selectList();
	}

	public PeopleDTO selectOne(PeopleDTO rcvDto) {
		
		return repository.selectOne(rcvDto);
	}

}
