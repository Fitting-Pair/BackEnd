package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @NoArgsConstructor
public class BodySize {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bodysize_id")
    private Long bodysize_id;

    @OneToOne(mappedBy = "bodySize")
    private UserBodyType userBodyType;

    @OneToOne
    @JoinColumn(name = "userImg_id")
    private UserImg userImg;

    private Long chest_size;
    private Long hip_size;
    private Long shoulder_size;
    private Long waist_size;
    private Long height_size;

    @Builder
    public BodySize(UserImg userImg, Long chest_size, Long hip_size,
                    Long shoulder_size, Long waist_size, Long height_size) {
        this.userImg = userImg;
        this.chest_size = chest_size;
        this.hip_size = hip_size;
        this.shoulder_size = shoulder_size;
        this.waist_size = waist_size;
        this.height_size = height_size;
    }

    public void setttingUserBodyType(UserBodyType userBodyType) {
        this.userBodyType = userBodyType;
    }


}
