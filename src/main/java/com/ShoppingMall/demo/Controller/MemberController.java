package com.ShoppingMall.demo.Controller;

import com.ShoppingMall.demo.Service.MemberService;
import com.ShoppingMall.demo.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MemberController {

    @Autowired
    private MemberService loginService;

    @GetMapping({"/","/index"})
    String index() {
        return "index";
    }

    @GetMapping("/loginForm")
    String loginForm() {
        return "loginForm";
    }

    @GetMapping("/signUp")
    String signUp(HttpSession session, MemberVo memberVo) {
        loginService.insertMember(memberVo);
        return "signUp";
    }

    @RequestMapping(value="/login", method= {RequestMethod.POST,RequestMethod.GET})
    String login(HttpServletRequest request,Model model,MemberVo memberVo) {

        String viewChange = loginService.viewChange(memberVo.getUserid(),memberVo.getPassword());
        MemberVo loginUserinfo = null;

        if(viewChange.equals("success")) {
            loginUserinfo = loginService.loginUserinfo(memberVo.getUserid());
            HttpSession session = request.getSession();
            session.setAttribute("loginUserinfo", loginUserinfo);
            return "redirect:/index";
        }else {
            return "redirect:/index";
        }
    }


}
