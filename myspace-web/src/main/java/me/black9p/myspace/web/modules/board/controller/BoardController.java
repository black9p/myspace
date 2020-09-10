package me.black9p.myspace.web.modules.board.controller;

import lombok.RequiredArgsConstructor;
import me.black9p.myspace.core.modules.board.entity.Board;
import me.black9p.myspace.core.modules.board.entity.BoardDTO;
import me.black9p.myspace.core.modules.board.entity.BoardDetail;
import me.black9p.myspace.core.modules.board.repository.BoardDetailRepository;
import me.black9p.myspace.core.modules.board.repository.BoardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Board 컨트롤러
 * @author black9p
 */
@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardRepository boardRepository;
    private final BoardDetailRepository boardDetailRepository;

    @GetMapping("/api/boards")
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

    @GetMapping("/api/boards/{boardSeq}")
    public BoardDTO getBoard(@PathVariable Long boardSeq) {
        return boardRepository.findBoardDetail(boardSeq);
    }

    @PostMapping("/api/boards")
    public ResponseEntity writeBoard(@RequestBody BoardDTO boardDTO) {
        Board board = boardRepository.save(Board.create(boardDTO));
        boardDetailRepository.save(BoardDetail.create(board.getBoardSeq(), boardDTO.getContent()));

        return ResponseEntity.ok().build();
    }
}
