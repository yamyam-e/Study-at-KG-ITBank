package spring.mvc.wedding.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.wedding.dto.PageDTO;
import spring.mvc.wedding.dto.RegistryFriendsDTO;

@Repository
public class RegistryFriendsRepository {
	
	@Autowired
	private SqlSession sqlSessionTemplate;

	public int insertOne(RegistryFriendsDTO dto) {
		return sqlSessionTemplate.insert("logMapper.regInsertOneFriend", dto);
	}

	public List<RegistryFriendsDTO> selectAll(String email) {
		return sqlSessionTemplate.selectList("logMapper.regSelectAllFriends", email);
	}
	
	public int updateOne(RegistryFriendsDTO dto) {
		return sqlSessionTemplate.update("logMapper.regUpdateOneFriend", dto);
	}

	public int deleteOne(int num) {
		return sqlSessionTemplate.delete("logMapper.regDeleteOneFriend", num);
	}
	
	public int countFriend(String email) {
		return sqlSessionTemplate.selectOne("logMapper.regCountFriend", email);
	}

	public List<RegistryFriendsDTO> regSelectFriendPageView(PageDTO pDTO) {
		return sqlSessionTemplate.selectList("logMapper.regSelectFriendPageView", pDTO);
	}
	
}