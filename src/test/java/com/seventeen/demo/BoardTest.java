package com.seventeen.demo;

import com.seventeen.demo.domain.Board;
import com.seventeen.demo.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class BoardTest {
    @Autowired
    private BoardRepository boardRepository;

    @Test
    void boardWriteTest(){
        Board board = new Board();

        boardRepository.save(board);

        System.out.println(boardRepository.findAll());
    }

}
