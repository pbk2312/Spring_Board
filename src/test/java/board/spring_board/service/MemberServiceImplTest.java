package board.spring_board.service;

import board.spring_board.dto.MemberDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberServiceImplTest {



    @Autowired
    public MemberService memberService;
    @Test
    void join() {
        MemberDTO memberDTO = MemberDTO.builder()
                .id("pbk2312")
                .password("0525")
                .build();

        memberService.join(memberDTO);
    }
}