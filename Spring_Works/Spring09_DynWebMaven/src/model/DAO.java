package model;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class DAO {

	public ArrayList<Object> selectList(){
		
		ArrayList<Object> listc = new ArrayList<>();
		listc.add("DB 전체 정보");
		
		return listc;
	}
}
