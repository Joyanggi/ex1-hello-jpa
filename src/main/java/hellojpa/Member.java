package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "username")
    private String username;

    @Column(name = "team_id")
    private Long teamId;

}
