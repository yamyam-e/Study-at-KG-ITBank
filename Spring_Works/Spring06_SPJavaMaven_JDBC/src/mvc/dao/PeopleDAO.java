package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import mvc.dto.PeopleDTO;

@Component
public class PeopleDAO {
	
	private PreparedStatement pstmt;
	private ResultSet rs;

	public int insertOne(Connection conn, PeopleDTO dto) throws Exception {
		
		String sql = "insert into t_peo values(t_peo_seq.nextval, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setInt(2, dto.getAge());
		int res = pstmt.executeUpdate();
		pstmt.close();
		
		return res;
	}

	public ArrayList<PeopleDTO> selectList(Connection conn) throws Exception {

		ArrayList<PeopleDTO> listc = null;
		String sql = "select * from t_peo";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			if(listc == null) listc = new ArrayList<>();
			int num = rs.getInt("num");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			PeopleDTO dto = new PeopleDTO(num, name, age);
			listc.add(dto);
		}
		pstmt.close();
		rs.close();
		
		return listc;
	}

}
