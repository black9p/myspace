package me.black9p.myspace.core.modules.board.repository;

import me.black9p.myspace.core.modules.board.entity.BoardDTO;

/**
 * @author black9p
 */
public interface BoardRepositoryCustom {
    BoardDTO findBoardDetail(long boardSeq);
}
