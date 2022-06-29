package kr.or.ddit.board.dao;

import java.sql.SQLException;

public interface IBoardDao {

	//전체 글 갯수 조회
	public int countList() throws SQLException;
}
