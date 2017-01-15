package mvc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc.dao.StudentDAO;
import mvc.dto.StudentDTO;

@Component
public class StudentService {
	
	@Autowired
	private DataSource dataSource;
	@Autowired
	private StudentDAO dao;
	
	private Connection conn;

	public int insertOne(StudentDTO dto) {
		
		int res = 0;
		
		try {
			conn = dataSource.getConnection();
			res = dao.insertOne(conn, dto);
			
			if(res>0){
				conn.commit();
			} else {
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

	public ArrayList<StudentDTO> selectList() {
		
		ArrayList<StudentDTO> listc = null;
		
		try {
			conn = dataSource.getConnection();
			listc = dao.selectList(conn);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listc;
	}

	public StudentDTO selectOne(String search) {
		
		StudentDTO dto = null;
		
		try {
			conn = dataSource.getConnection();
			dto = dao.selectOne(conn, search);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	public int update(StudentDTO rcvDto) {
		int res = 0;
		try {
			conn = dataSource.getConnection();
			res = dao.update(conn, rcvDto);
			
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

	public int delete(String search) {
	
		int res = 0;
		
		try {
			conn = dataSource.getConnection();
			res = dao.delete(conn, search);
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

}
