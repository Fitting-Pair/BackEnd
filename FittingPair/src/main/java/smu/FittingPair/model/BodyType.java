package smu.FittingPair.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class BodyType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodytype_id")
    private Long id;
    private String bodytypeFeatures;
    private String bodytypeCareful;
    private String bodytypeName;


    @Builder
    public BodyType(String bodytypeFeatures, String bodytypeCareful, String bodytypeName) {
        this.bodytypeFeatures = bodytypeFeatures;
        this.bodytypeCareful = bodytypeCareful;
        this.bodytypeName = bodytypeName;
    }

}
