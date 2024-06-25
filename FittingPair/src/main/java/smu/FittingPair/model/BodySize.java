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
}
