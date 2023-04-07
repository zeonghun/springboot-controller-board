package kr.ymtech.ojt.board.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ymtech.ojt.board.vo.Board;

/**
 * 게시판 목록 조회 클래스
 * 
 * @author zeonghun
 * @since 2023.04.06
 */
@Controller
@RequestMapping("/boards")
public class BoardController {

    /**
     * 게시판 전체 목록을 조회하는 메소드
     * 
     * @return 게시판 전체 목록
     * 
     * @author zeonghun
     * @since 2023.04.06
     */
    @GetMapping
    public String showBoard(Model model) {
        // http://localhost:8080/boards
        List<Board> boards = Arrays.asList(
                new Board(1, "test", "관리자", "test 입니다."),
                new Board(2, "스프링 설명서", "익명1", "Spring 어떻게 쓰나요?"),
                new Board(3, "annotation 사용하기", "익명2", "@Controller 사용하기"),
                new Board(4, "스프링부트란 무엇인가", "김정훈", "자바 프레임워크"),
                new Board(5, "mysql과 mariadb의 차이", "홍길동", "차이가 무엇일까"));

        model.addAttribute("result", boards);

        return "board";
    }
}