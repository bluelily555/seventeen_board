package com.seventeen.demo.service;

import com.seventeen.demo.domain.Board;
import com.seventeen.demo.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    //c
    public void boardWrite(Board board){
        board.setWriter("임시작성자");
        board.setCreatedAt(LocalDateTime.now());
        board.setModifiedAt(LocalDateTime.now());

        boardRepository.save(board);
    }

    //r
    public Board boardContent(long id){
        return boardRepository.findById(id).get();
    }

    //u
    public void boardUpdate(Board board, Long id) {
        board.setModifiedAt(LocalDateTime.now());

        boardRepository.save(board);
    }

    //d
    public void boardDelete(long id){
        boardRepository.deleteById(id);
    }

    public List<Board> boardList(){
        return boardRepository.findAll();
    }
}
