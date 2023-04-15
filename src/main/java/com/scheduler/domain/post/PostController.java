package com.scheduler.domain.post;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/post/write.do")
    // 게시글 작성 페이지
    public String openPostWrite(Model model) {
        String title = "제목",
                content = "내용",
                writer = "킹승욱";

        model.addAttribute("t", title);
        model.addAttribute("c", content);
        model.addAttribute("w", writer);
        return "post/write";
    }
}
