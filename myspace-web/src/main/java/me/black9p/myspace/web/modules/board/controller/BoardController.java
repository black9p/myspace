package me.black9p.myspace.web.modules.board.controller;

import lombok.RequiredArgsConstructor;
import me.black9p.myspace.core.modules.board.entity.Board;
import me.black9p.myspace.core.modules.board.repository.BoardRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Board 컨트롤러
 * @author black9p
 */
@RestController
@RequiredArgsConstructor
public class BoardController {
    private final BoardRepository boardRepository;

    @GetMapping("/api/boards")
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }
}
