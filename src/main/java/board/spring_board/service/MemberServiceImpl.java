package board.spring_board.service;

import board.spring_board.domain.Member;
import board.spring_board.dto.MemberDTO;
import board.spring_board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    private final ModelMapper modelMapper;


    @Override
    public void join(MemberDTO memberDTO) {


        Member member = modelMapper.map(memberDTO, Member.class);


        memberRepository.save(member);
    }


}
