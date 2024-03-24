package board.spring_board.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberDTO {

    private String id;
    private String password;

}
