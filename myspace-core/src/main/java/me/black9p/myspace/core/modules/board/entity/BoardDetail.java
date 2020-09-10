package me.black9p.myspace.core.modules.board.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * BoardDetail 엔티티
 * @author black9p
 */
@Entity
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardDetail {
    @Id
    private Long boardDetailSeq;
    private String content;
    @CreationTimestamp
    private LocalDateTime registerYmdt;
    @UpdateTimestamp
    private LocalDateTime modifyYmdt;

    public static BoardDetail create(Long boardSeq, String content) {
        return BoardDetail.builder()
                          .boardDetailSeq(boardSeq)
                          .content(content)
                          .build();
    }
}
