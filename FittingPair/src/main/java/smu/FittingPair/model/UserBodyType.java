package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter @Entity
@RequiredArgsConstructor
public class UserBodyType {
    @Id @GeneratedValue
    @Column(name = "userbodytype_id")
    private Long userbodytype_id;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_idg")
    private Users users;

}
