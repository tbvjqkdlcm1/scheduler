package com.scheduler.domain.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostServiceTest {

    @Autowired
    PostService postService;

    @Test
    void save() {
        PostRequest params = new PostRequest();
        params.setTitle("1번 게시글 제목");
        params.setContent("1번 게시글 내용");
        params.setWriter("킹승욱");
        params.setNoticeYn(false);
        postService.savePost(params);

        List<PostResponse> posts = postService.findAllPost();
        System.out.println("생성된 게시글 ID : " + posts.size());
    }

    @Test
    void findById() {

    }

    @Test
    void delete() {
        System.out.println("삭제 이전의 전체 게시글 개수는 : " + postService.findAllPost().size());
        List<PostResponse> posts = postService.findAllPost();
        postService.deletePost(Long.valueOf(posts.size()));
        System.out.println("삭제 이후의 전체 게시글 개수는 : " + postService.findAllPost().size());
    }
}