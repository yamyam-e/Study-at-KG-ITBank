package spring.mvc.spring11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import spring.mvc.spring11.dto.PeopleDTO;
import spring.mvc.spring11.repository.PeopleRepository;

@Service
public class PeopleService extends DefaultTransactionDefinition {

	@Autowired
	private PeopleRepository repository;
	
	@Autowired
	private PlatformTransactionManager tx;
	private TransactionStatus status;
	
	public int insertOne(PeopleDTO dto) {
		
		status = tx.getTransaction(this);
		
		int res = repository.insertOne(dto);
		if(res > 0){
			tx.commit(status);
		} else {
			tx.rollback(status);
		}
		
		return res;
	}

	public List<Object> selectList() {
		return repository.selectList();
	}

	public int delete(Integer num) {
		
		status = tx.getTransaction(this);
		int res = repository.delete(num);
		if(res>0){
			tx.commit(status);
		} else {
			tx.rollback(status);
		}
		return res;
	}

	public int update(int num, String newSysName, String newOrgName) {

		status = tx.getTransaction(this);
		int res = repository.update(num, newSysName, newOrgName);
		if(res>0){
			tx.commit(status);
		} else {
			tx.rollback(status);
		}
		return res;
		
	}
	
}









