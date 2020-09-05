package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
