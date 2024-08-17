package smu.FittingPair.model;

import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @NoArgsConstructor
@Builder
@AllArgsConstructor
public class BodySize {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "body_size_id")
    private Long id;

    @OneToOne(mappedBy = "bodySize",cascade = CascadeType.ALL, orphanRemoval = true)
    private UserBodyType userBodyType;

    @OneToOne
    @JoinColumn(name = "user_img_id")
    private UserImg userImg;
    private double chestSize;
    private double hipSize;
    private double shoulderSize;
    private double waistSize;
    private Long heightSize;

    public void setHeightSize(Long heightSize) {
        this.heightSize = heightSize;
    }
    public void setUserImg(UserImg userImg) {
        this.userImg = userImg;
    }
    public void setUserBodyType(UserBodyType userBodyType){
        this.userBodyType = userBodyType;
    }

    @Builder
    public BodySize(double chestSize, double hipSize, double shoulderSize, double waistSize){
        this.chestSize = chestSize;
        this.hipSize = hipSize;
        this.shoulderSize = shoulderSize;
        this.waistSize = waistSize;
    }

}
