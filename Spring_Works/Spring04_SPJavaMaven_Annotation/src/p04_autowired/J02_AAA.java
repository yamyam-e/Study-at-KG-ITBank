package p04_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("aaa")
public class J02_AAA {
	
//	1. @Autowired
//	- byType으로 검색한 뒤, 검색 결과가 여러개인 경우 byName으로 연결
//	- setter 필요 없음
	@Autowired
	private J02_BBB bbb;
	
//	@Autowired @Qualifier("cccBean") : 지정한 id를 가진 빈을 연결
	@Autowired
	@Qualifier("cccBean")
	private J02_CCC ccc;
	
//	@Autowired(required=false)
//	- 연결될 빈이 추후에 결정되는 경우, null값을 허용하기 위한 설정
//	- 기본적으로 @Autowired는 연결될 빈이 존재하지 않으면 에러 발생
	@Autowired(required=false)
	private J02_DDD ddd;

	public J02_BBB getBbb() {
		return bbb;
	}

	public J02_CCC getCcc() {
		return ccc;
	}

	public J02_DDD getDdd() {
		return ddd;
	}
	
	
}
