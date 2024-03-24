package board.spring_board.service;


import board.spring_board.domain.Member;
import board.spring_board.dto.MemberDTO;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public interface MemberService {


    void join(MemberDTO member);


}

