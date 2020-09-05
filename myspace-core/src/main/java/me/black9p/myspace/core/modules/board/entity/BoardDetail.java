package me.black9p.myspace.core.modules.board.entity;

import lombok.Getter;
import lombok.Setter;
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
public class BoardDetail {
    @Id
    private Long boardDetailSeq;
    private String content;
    @CreationTimestamp
    private LocalDateTime registerYmdt;
    @UpdateTimestamp
    private LocalDateTime modifyYmdt;
}
