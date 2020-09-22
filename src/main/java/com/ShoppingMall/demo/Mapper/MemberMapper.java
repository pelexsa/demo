package com.ShoppingMall.demo.Mapper;

import com.ShoppingMall.demo.vo.MemberVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    String checkLogin(String userid);

    MemberVo loginUserinfo(String userid);
}
