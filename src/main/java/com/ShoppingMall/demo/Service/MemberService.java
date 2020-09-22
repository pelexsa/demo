package com.ShoppingMall.demo.Service;

import com.ShoppingMall.demo.Dao.MemberDao;
import com.ShoppingMall.demo.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MemberService {

    @Autowired
    private MemberDao loginDao;

    public String viewChange(String userid, String userpassword) {
        // 로그인 체크 여부
        int checkLogin = loginDao.checkLogin(userid, userpassword);

        if (checkLogin == 1) {
            return "success";

        } else {
            // 로그인 실패
            return "false";

        }
    }

    public MemberVo loginUserinfo(String userid) {
        return loginDao.loginUserinfo(userid);
    }

    public void insertMember(MemberVo memberVo) {

        int insertMember = loginDao.insertMember();

    }



}