package com.ShoppingMall.demo.Mapper;

import com.ShoppingMall.demo.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardVo> boardAllSelect();
}
