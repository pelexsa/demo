package com.ShoppingMall.demo.Dao;

import com.ShoppingMall.demo.Mapper.MemberMapper;
import com.ShoppingMall.demo.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao {

    @Autowired
    private MemberMapper loginMapper;

    public int checkLogin(String userid,String password) {

        String userPassword = loginMapper.checkLogin(userid);
        System.out.println("DB에서 값 가져오는지 확인 :"+userPassword);

        if(userPassword.equals(password)) {
            return 1;
        }

        return 0;
    }

    public int insertMember() {
        return 0;
    }

    public MemberVo loginUserinfo(String userid) {
        return loginMapper.loginUserinfo(userid);
    }


}
