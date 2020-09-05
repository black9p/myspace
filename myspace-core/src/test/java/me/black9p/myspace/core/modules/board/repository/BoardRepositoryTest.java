package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.Board;
import me.black9p.myspace.core.modules.board.entity.BoardDTO;
import me.black9p.myspace.core.modules.board.entity.BoardDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author black9p
 */
@SpringBootTest
class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    BoardDetailRepository boardDetailRepository;

    @Test
    public void createBoard_test() {
        Board board = new Board();
        board.setTitle("안녕하세요.");
        board.setWriter("black9p");
        Board expected = boardRepository.save(board);

        Board actual = boardRepository.findById(expected.getBoardSeq()).orElseThrow(RuntimeException::new);

        assertEquals(expected, actual);
    }

    @Test
    public void getBoardDetail_test() {
        Board board = new Board();
        board.setTitle("안녕하세요.");
        board.setWriter("black9p");
        Board expectedBoard = boardRepository.save(board);

        BoardDetail boardDetail = new BoardDetail();
        boardDetail.setBoardDetailSeq(expectedBoard.getBoardSeq());
        boardDetail.setContent("반가워요.");
        BoardDetail expectedBoardDetail = boardDetailRepository.save(boardDetail);

        BoardDTO actual = boardRepository.findBoardDetail(expectedBoard.getBoardSeq());

        assertEquals(expectedBoard.getTitle(), actual.getTitle());
        assertEquals(expectedBoard.getWriter(), actual.getWriter());
        assertEquals(expectedBoardDetail.getContent(), actual.getContent());
    }
}