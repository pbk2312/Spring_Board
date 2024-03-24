package board.spring_board.controller;


import board.spring_board.dto.MemberDTO;
import board.spring_board.service.MemberService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/join")
    public String join(@ModelAttribute MemberDTO memberDTO) {
        return "/join";
    }


    @PostMapping("/join")
    public String join(@ModelAttribute MemberDTO memberDTO
            , RedirectAttributes redirectAttributes) {
        memberService.join(memberDTO);

        return "redirect:/";
    }


}
