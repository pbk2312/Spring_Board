package board.spring_board.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Builder
@Getter
@Setter
@RequiredArgsConstructor
public class Member {

    @Id
    private String id;
    private String password;

    public Member(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
