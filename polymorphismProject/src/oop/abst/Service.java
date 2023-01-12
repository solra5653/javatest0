package oop.abst;

import java.util.List;

public interface Service {
	//서비스용 클래스에 사용 될 메소드 작성 규칙을 정함
	Object selectOne(Object obj);
	List<Object> selectList();
	int insert(Object obj);
	int update(Object obj);
	int delete(Object obj);
	
}
