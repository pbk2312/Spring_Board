package board.spring_board.controller;


import board.spring_board.domain.Member;
import board.spring_board.dto.MemberDTO;
import board.spring_board.repository.MemberRepository;
import board.spring_board.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@Slf4j
public class LoginController {


    private final MemberService memberService;

    @GetMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO) {
        return "/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, RedirectAttributes redirectAttributes) {
        Member member = memberService.findById(memberDTO.getId());

        if (member != null) {
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("errorMessage", "아이디나 비밀번호가 올바르지 않습니다.");
            return "redirect:/login";

        }


    }


}
