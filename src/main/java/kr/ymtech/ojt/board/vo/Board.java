package kr.ymtech.ojt.board.vo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * 게시판 항목 저장 클래스
 * 
 * @author zeonghun
 * @since 2023.04.06
 */
@Data
@RequiredArgsConstructor
public class Board {
    private final int bno;
    private final String title;
    private final String writer;
    private final String content;
}
