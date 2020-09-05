package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Board 레파지토리
 * @author black9p
 */
public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}
