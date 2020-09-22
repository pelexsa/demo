package com.ShoppingMall.demo.Dao;

import com.ShoppingMall.demo.Mapper.BoardMapper;
import com.ShoppingMall.demo.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    private BoardMapper boardMapper;

    public List<BoardVo> boardAllSelect() {
        return boardMapper.boardAllSelect();
    }
}
