package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.BoardDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BoardDetail 레파지토리
 * @author black9p
 */
public interface BoardDetailRepository extends JpaRepository<BoardDetail, Long> {
}
