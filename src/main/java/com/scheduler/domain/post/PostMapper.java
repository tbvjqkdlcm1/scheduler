package com.scheduler.domain.post;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    // 게시글 저장
    void save(PostRequest params);

    // 게시글 id로 상세정보 리턴
    PostResponse findById(Long id);

    // 게시글 수정
    void update(PostRequest params);

    // 게시글 id로 찾아서 삭제
    void deleteById(Long id);

    // 게시글 리스트 조회해서 리턴
    List<PostResponse> findAll();

    // 게시글 갯수 카운팅해서 리턴
    int count();
}
