package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import mvc.dto.StudentDTO;

@Component
public class StudentDAO {

	private PreparedStatement pstmt;
	private ResultSet rs;
		
	public int insertOne(Connection conn, StudentDTO dto) throws Exception {
		
		String sql = "insert into t_stu values(t_stu_seq.nextval, ?,?,?,?,?,?)";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setInt(2, dto.getKor());
		pstmt.setInt(3, dto.getEng());
		pstmt.setInt(4, dto.getMath());
		pstmt.setInt(5, dto.getKor()+dto.getEng()+dto.getMath());
		pstmt.setDouble(6, (dto.getKor()+dto.getEng()+dto.getMath()) / 3.0); 
		
		int res = pstmt.executeUpdate();
		pstmt.close();
		
		return  res;
	}

	public ArrayList<StudentDTO> selectList(Connection conn) throws Exception {
		
		ArrayList<StudentDTO> listc = null;
		
		String sql = "select * from t_stu order by num";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			if(listc == null) listc = new ArrayList<>();
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int math = rs.getInt("math");
			int total = rs.getInt("total");
			double avg = rs.getDouble("avg");
			StudentDTO dto = new StudentDTO(num, name, kor, eng, math, total, avg);
			listc.add(dto);
		}
		
		pstmt.close();
		rs.close();
		
		return listc;
	}

	public StudentDTO selectOne(Connection conn, String search) throws Exception{

		StudentDTO dto = null;
		String sql = "select * from t_stu where name=?";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, search);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int kor = rs.getInt("kor");
			int eng = rs.getInt("eng");
			int math = rs.getInt("math");
			int total = rs.getInt("total");
			double avg = rs.getDouble("avg");
			dto = new StudentDTO(num, name, kor, eng, math, total, avg);
		}
		
		pstmt.close();
		rs.close();
		
		return dto;
	}

	public int update(Connection conn, StudentDTO rcvDto) throws Exception {

		String sql = "update t_stu set kor=?, eng=?, math=?, total=?, avg=? where name=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, rcvDto.getKor());
		pstmt.setInt(2, rcvDto.getEng());
		pstmt.setInt(3, rcvDto.getMath());
		pstmt.setInt(4, rcvDto.getKor()+rcvDto.getEng()+rcvDto.getMath());
		pstmt.setDouble(5, (rcvDto.getKor()+rcvDto.getEng()+rcvDto.getMath())/ 3.0);
		pstmt.setString(6, rcvDto.getName());
		
		int res = pstmt.executeUpdate();
		pstmt.close();
		
		return res;
	}

	public int delete(Connection conn, String search) throws Exception {
	
		String sql = "delete from t_stu where name=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, search);
		
		int res = pstmt.executeUpdate();
		pstmt.close();
		
		return res;
	}

}
