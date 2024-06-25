package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @Entity
@RequiredArgsConstructor
public class UserBodyType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userbodytype_id")
    private Long userbodytype_id;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id")
    private Users users;

}
