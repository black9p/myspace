package me.black9p.myspace.core.modules.board.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Board 엔티티
 * @author black9p
 */
@Entity
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardSeq;
    private String title;
    private String writer;
    @CreationTimestamp
    private LocalDateTime registerYmdt;
    @UpdateTimestamp
    private LocalDateTime modifyYmdt;

    public static Board create(BoardDTO boardDTO) {
        return Board.builder()
                    .title(boardDTO.getTitle())
                    .writer(boardDTO.getWriter())
                    .build();
    }
}
