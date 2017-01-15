package mvc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dao.PeopleDAO;
import mvc.dto.PeopleDTO;

@Component
public class PeopleService {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private PeopleDAO dao;
	
	private Connection conn;
	
	public int insertOne(PeopleDTO dto) {
		
		int res = 0;
		
		try {
			conn = dataSource.getConnection();
			res = dao.insertOne(conn, dto);
			
			if(res>0){
				conn.commit();
			}else{
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}

	public ArrayList<PeopleDTO> selectList() {

		ArrayList<PeopleDTO> listc = null;
		
		try {
			conn = dataSource.getConnection();
			listc = dao.selectList(conn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return listc;
	}

}
