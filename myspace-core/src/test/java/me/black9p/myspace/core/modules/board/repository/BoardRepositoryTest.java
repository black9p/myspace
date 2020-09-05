package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
class BoardRepositoryTest {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void create_test() {
        Board board = new Board();
        board.setTitle("안녕하세요.");
        board.setWriter("black9p");
        Board expected = boardRepository.save(board);

        Board actual = boardRepository.findById(expected.getBoardSeq()).orElseThrow(RuntimeException::new);

        assertEquals(expected, actual);
    }
}