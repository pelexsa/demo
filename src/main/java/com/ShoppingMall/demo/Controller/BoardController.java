package com.ShoppingMall.demo.Controller;

import com.ShoppingMall.demo.Service.BoardService;
import com.ShoppingMall.demo.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/boardList")
    String boardList(Model model) {
        List<BoardVo> boardAllSelect = boardService.boardAllSelect();
        model.addAttribute("boardAllSelect",boardAllSelect);

        return "boardList";
    }

    @GetMapping("/boardList/boarUpdate")
    String boardListUpdate(@RequestParam("boardno")int boardno) {
        return "boarUpdate";
    }

    @GetMapping("/boardList/boardDetail")
    String boardListDetail(Model model,@RequestParam("boardno")int boardno) {

        return "boardDetail";
    }

    @GetMapping("/boardList/heartUp")
    String heartUp(@RequestParam("boardno")int boardno) {


        return null;
    }

    @GetMapping("/boardList/heartdown")
    String heartDown() {
        return null;
    }


}
