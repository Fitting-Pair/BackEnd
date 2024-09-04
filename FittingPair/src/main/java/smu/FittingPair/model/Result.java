package smu.FittingPair.model;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Entity @Getter
public class Result  {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_body_type_id")
    private UserBodyType userBodyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "my_page_id")
    private MyPage myPage;
    @OneToOne
    @JoinColumn(name = "user_img_id")
    private UserImg userImg;
    @OneToOne
    @JoinColumn(name = "userClothes_id")
    private UserClothes userClothes;
    @Builder
    public Result(UserBodyType userBodyType, MyPage myPage,UserImg userImg) {
        this.userBodyType = userBodyType;
        this.myPage = myPage;
        this.userImg = userImg;
    }
    public void setMyPage(MyPage myPage){
        this.myPage = myPage;
    }
    public void setUserClothes(UserClothes userClothes){
        this.userClothes = userClothes;
    }
    public String getObjFileUrl(){
        return this.userImg.getObjFileUrl();
    }
    public String getBodyShapeName(){
        return this.userBodyType.getBodyShape().getName();
    }
    public BodySize getBodySize(){
        return this.userBodyType.getBodySize();
    }
    public String getBodyShapeFeatures(){
        return this.userBodyType.getBodyShape().getFeatures();
    }
    public String getBodyShapeCareful(){
        return this.userBodyType.getBodyShape().getCareful();
    }
    public String getUserImgCreatedAt(){
        return this.userImg.getCreatedAt();
    }
    public TopClothesItems getUserTopClothes(){
        return this.userClothes.getTopClothesItems();
    }
    public BottomClothesItems getUserBottomClothes() {
        return this.userClothes.getBottomClothesItems();
    }
}