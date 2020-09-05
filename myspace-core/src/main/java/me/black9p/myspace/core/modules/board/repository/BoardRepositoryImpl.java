package me.black9p.myspace.core.modules.board.repository;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import me.black9p.myspace.core.modules.board.entity.BoardDTO;

import static me.black9p.myspace.core.modules.board.entity.QBoard.board;
import static me.black9p.myspace.core.modules.board.entity.QBoardDetail.boardDetail;

/**
 * Board 레파지토리
 * @author black9p
 */
@RequiredArgsConstructor
public class BoardRepositoryImpl implements BoardRepositoryCustom {
    private final JPAQueryFactory queryFactory;

    @Override
    public BoardDTO findBoardDetail(long boardSeq) {
        return queryFactory.select(Projections.bean(BoardDTO.class, board.boardSeq, board.title, board.writer, board.registerYmdt, board.modifyYmdt, boardDetail.content))
                           .from(board)
                           .join(boardDetail)
                           .on(board.boardSeq.eq(boardDetail.boardDetailSeq))
                           .where(board.boardSeq.eq(boardSeq))
                           .fetchFirst();
    }
}
