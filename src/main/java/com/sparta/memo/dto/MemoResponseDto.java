package com.sparta.memo.dto;

import com.sparta.memo.entity.Memo;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemoResponseDto {
    private Long id;
    private String username;
    private String contents;

    public MemoResponseDto(Memo saveMemo) {
        this.id = saveMemo.getId();
        this.username = saveMemo.getUsername();
        this.contents = saveMemo.getContents();
    }
}