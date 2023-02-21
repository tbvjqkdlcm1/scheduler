package com.scheduler.domain.post;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostResponse {

    private Long id;                        // PK
    private String title;                   // 제목
    private String content;                 // 내용
    private String writer;                  // 작성자
    private int viewCnt;                    // 조회 수
    private Boolean noticeYn;               // 공지글 여부
    private Boolean deleteYn;               // 삭제 여부
    private LocalDateTime createdDate;      // 생성날짜
    private LocalDateTime modifiedDate;     // 최종 수정날짜
}
