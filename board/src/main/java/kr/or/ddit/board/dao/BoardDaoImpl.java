package kr.or.ddit.board.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.BuildedSqlMapClient;

public class BoardDaoImpl implements IBoardDao {

	private SqlMapClient smc;
	
	//싱글톤 방식으로 객체 생성
	//특징1 - private constructor
	private BoardDaoImpl () {
		smc = BuildedSqlMapClient.getSqlMapClient();
	}
	//특징2 - static method
	
	@Override
	public int countList() throws SQLException {
		//객체로 db에 접근해서 데이터 반환하기..
		smc.queryForObject("namespace.id");
		return 0;
	}

}
