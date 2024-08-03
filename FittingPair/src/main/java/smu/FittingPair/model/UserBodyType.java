package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor
public class UserBodyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodytype_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bodysize_id")
    private BodySize bodySize;

    @Enumerated(EnumType.STRING)
    @Column(name = "body_shape")
    private BodyShape bodyShape;

    public void setUsers(Users users){
        this.users = users;
    }
    public void setBodySize(BodySize bodySize){
        this.bodySize = bodySize;
    }

    @Builder
    public UserBodyType(Users users, BodySize bodySize, BodyShape bodyShape) {
        this.users = users;
        this.bodySize = bodySize;
        this.bodyShape = bodyShape;
    }



}
