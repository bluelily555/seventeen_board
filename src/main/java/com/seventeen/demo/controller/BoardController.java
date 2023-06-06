package com.seventeen.demo.controller;

import com.seventeen.demo.domain.Board;
import com.seventeen.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "boardWrite";
    }

    //c
    @PostMapping("/board/save")
    public String boardWrite(Board board){
        boardService.boardWrite(board);
        return "redirect:/board/list";
    }

    //r
    @GetMapping("/board/content")
    public String boardContent(Model model, Long id){
        model.addAttribute("board", boardService.boardContent(id));
        return "boardContent";
    }
    //u
    @GetMapping("/board/modify/{id}")
    public String boardModify(@PathVariable("id") Long id, Model model){
        model.addAttribute("board",boardService.boardContent(id));
        return "boardModify";
    }
    @PostMapping("/board/update/{id}")
    public String boardUpdate(@PathVariable("id") Long id, Board board){
        boardService.boardUpdate(board, id);

        return "redirect:/board/list";
    }
    //d
    @GetMapping("/board/delete")
    public String boardDelete(Long id){
        boardService.boardDelete(id);
        return "redirect:/board/list";
    }

    @GetMapping("/board/list")
    public String boardList(Model model){
        model.addAttribute("list", boardService.boardList());

        return "boardList";
    }
}
