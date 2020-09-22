package com.ShoppingMall.demo.Service;

import com.ShoppingMall.demo.Dao.BoardDao;
import com.ShoppingMall.demo.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {

    @Autowired
    private BoardDao boardDao;

    public List<BoardVo> boardAllSelect() {
        return boardDao.boardAllSelect();
    }
}
