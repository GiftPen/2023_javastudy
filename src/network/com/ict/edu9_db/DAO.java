package network.com.ict.edu9_db;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB처리하는 메서드들을 가지고 있는 클래
public class DAO {
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	// 싱글턴 패턴 (동기화 처리) : 프로그램이 종료될 때 까지 한번 만들어진 객체를 재 사용한다.
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB처리하는 메서드들	
	// customer 테이블 전체보기
	// select , 결과는 여러개 나올수 있다 ,  파라미터가 없음
	// mapper의 resultType은 List<VO>과 연결된다
	public static List<VO> getList(){
		List<VO> list = null;
		// selectList() : 결과가 하나 이상일때
		// selectOne()  : 반드시 결과가 하나일때
		// 파라미터가 있는 메서드와 파라미터가 없는 메서드로 나눈다.
		// 파라미터가 있는 메서드 : selectList("mapper의 id",파라미터);
		// 파라미터가 없는 메서드 : selectList("mapper의 id");
		list = getSession().selectList("custList");
		return list;
	}
	
	// custOne
	// select, 결과는 한개, 파라미터 있음(String)
	public static VO getOne(String custid) {
		VO vo = getSession().selectOne("custOne", custid);
		return vo;
	}
	
	// insert, delete.update 결과 int, 파라미터있음
	// 반드시 commit을 해줘야 한다.
	public static int getInsert(VO vo) {
		int result = getSession().insert("custIns",vo);
		ss.commit();
		return result ;
	}
	public static int getDelete(VO vo) {
		int result = getSession().delete("custDel", vo);
		ss.commit();
		return result ;
	}
	public static int getUpdate(VO vo) {
		int result = getSession().update("custUpdate",vo);
		ss.commit();
		return result ;
	}
}