package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @RequiredArgsConstructor
public class BodySize {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodysize_id")
    private Long bodysize_id;

    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id")
    private Users users;


    private Long chest_size;
    private Long hip_size;
    private Long shoulder_size;
    private Long waist_size;
    private Long height_size;

    public BodySize(Long bodysize_id, Users users, Long chest_size, Long hip_size,
                    Long shoulder_size, Long waist_size, Long height_size) {
        this.bodysize_id = bodysize_id;
        this.users = users;
        this.chest_size = chest_size;
        this.hip_size = hip_size;
        this.shoulder_size = shoulder_size;
        this.waist_size = waist_size;
        this.height_size = height_size;
    }



}
