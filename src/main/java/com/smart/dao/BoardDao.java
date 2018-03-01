package com.smart.dao;

import com.smart.domain.Board;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Iterator;

@Repository
@Transactional 
public class BoardDao extends BaseDao<Board>{
	private static final String GET_BOARD_NUM = "select count(f.boardId) from Board f";

	public long getBoardNum() {
		Iterator iter = getHibernateTemplate().iterate(GET_BOARD_NUM);
        return ((Long)iter.next());
	}
}
