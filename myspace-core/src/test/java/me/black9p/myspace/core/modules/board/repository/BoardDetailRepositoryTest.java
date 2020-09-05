package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.BoardDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author black9p
 */
@DataJpaTest
class BoardDetailRepositoryTest {

    @Autowired
    BoardDetailRepository boardDetailRepository;

    @Test
    public void create_test() {
        BoardDetail boardDetail = new BoardDetail();
        boardDetail.setBoardDetailSeq(1L);
        boardDetail.setContent("글을써봅니다.");
        BoardDetail expected = boardDetailRepository.save(boardDetail);

        BoardDetail actual = boardDetailRepository.findById(expected.getBoardDetailSeq()).orElseThrow(RuntimeException::new);

        assertEquals(expected, actual);
    }
}