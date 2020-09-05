package me.black9p.myspace.core.modules.board.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Board DTO
 * @author black9p
 */
@Getter @Setter
public class BoardDTO {
    private Long boardSeq;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime registerYmdt;
    private LocalDateTime modifyYmdt;
}
