package smu.FittingPair.model;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
public enum BodyShape {

    //남자 체형
    MALE_TRIANGLE("삼각형",
            "삼각형 체형의 남자는 허리가 상대적으로 넓고 어깨가 좁아 하체가 더 발달해 보이는 특징을 가집니다. 이런 체형의 남성은 상체에 볼륨을 더해주어 균형을 맞추는 것이 중요합니다." +
                    "\n" +
                    "예를 들어, 어깨에 패드가 있는 블레이저나 수직 스트라이프 패턴의 셔츠를 선택하여 상체를 더 넓어 보이게 하는 것이 좋습니다. 또한, 목선이 개방된 상의를 선택하여 목 라인을 길어 보이게 하는 것도 효과적입니다.\n" +
                    "\n" +
                    "하의는 너무 타이트하지 않은 스트레이트 핏을 선택하여 전체적인 실루엣의 균형을 잡아주는 것이 좋습니다. 어두운 색상의 팬츠를 선택하면 하체가 슬림해 보이는 효과를 줄 수 있습니다.",
            "삼각형 체형에서 주의할 점은 너무 밝은 색상이나 큰 패턴의 하의는 하체를 더 부각시킬 수 있으므로 피하는 것이 좋습니다. 또한, 상의와 항의 색상 대비를 너무 강하게 주지 않아 전체적인 조화를 이루도록 하는 것이 중요합니다. 스타일링 시 상체를 강조하고 하체는 심플하게 유지하여 전체적인 균형을 맞추는 것을 목표로 해야 합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{
                            "피그먼트 웨스턴 셔츠 GREY BEIGE",
                            "Lowie cotton shirts thulian pink",
                            "Oliver cotton shirts powder blue",
                            "Osk striped T-shirt white",
                            "SIDOGRAS 상기 코튼 셔츠 스트라이프",
                            "오디너리 크롭 디컨 클라우드",
                            "카멜 앙고라 오버핏 니트 (버터)",
                            "BIG LOGO SWEATSHIRT-GREY/WHITE",
                            "DRASTIC DAMAGE DENIM TRUCKER INDIGO",
                            "아카이브 오버핏 트러커 자켓 Destroyed Ut white",
                            "레더 패디드 셔츠 자켓 (브라운)"
                    },
                    new String[]{
                            "인사일런스",
                            "라벨라카이브",
                            "라벨라카이브",
                            "라벨라카이브",
                            "엘무드",
                            "엘무드",
                            "파브레가",
                            "파카화이트",
                            "메종미네",
                            "오더아카이브",
                            "노이어"
                    },
                    new String[]{
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240808/4310909/4310909_17236111421303_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240919/4444159/4444159_17268040442866_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240315/3959012/3959012_17104923047166_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240315/3959012/3959012_17104923047166_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20220729/4278833/4278833_17245230937781_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20220201/2320294/2320294_16792540939781_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240420/3499264/3499264_1727875248038_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20220914/23202409/23202409_1652339383_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20220427/4375977/4375977_1724915269524_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20220422/4071968/4071968_17143514232924_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240821/4335382/4335382_17251724508408_big.jpg?w=1200"
                    },
                    new String[]{
                            "https://www.musinsa.com/products/4310909",
                            "https://www.musinsa.com/products/4444159",
                            "https://www.musinsa.com/products/3959012",
                            "https://www.musinsa.com/products/3959012",
                            "https://www.musinsa.com/products/4278833",
                            "https://www.musinsa.com/products/2320294",
                            "https://www.musinsa.com/products/3499264",
                            "https://www.musinsa.com/products/23202409",
                            "https://www.musinsa.com/products/4375977",
                            "https://www.musinsa.com/products/4071968",
                            "https://www.musinsa.com/products/4335382"
                    }
            ),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{
                            "wide denim pants (black)",
                            "EXTRA WIDE DENIM PANTS [SAND BLUE]",
                            "1711 RAIN STORM JEANS [MAX WIDE STRAIGHT]",
                            "1705 FADED BLACK JEANS [MAX WIDE STRAIGHT]",
                            "Eliot wide fit jeans washed dark blue wash",
                            "Jade washed cotton pants white",
                            "백 사틴 오피서 팬츠 [브라운]",
                            "하프밴딩 원턱 슬랙스 [블랙]",
                            "데님 와이드 더블 니 카펜터 팬츠 [워시드 블랙]",
                            "COTTON TWILL CARGO PANTS BLACK"
                    },
                    new String[]{
                            "노운",
                            "브랜디드",
                            "브랜디드",
                            "브랜디드",
                            "라벨라카이브",
                            "라벨라카이브",
                            "무탠다드",
                            "시그니처",
                            "무탠다드",
                            "비슬로우"
                    },
                    new String[]{
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240424/4081512/4081512_17174947418202_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240905/4409069/4409069_172017542301_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240822/4358030/4358030_17265980737218_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20231105/3714100/3714100_17104307322550_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240529/4165129/4165129_17169481542307_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240529/4165022/4165022_17186781859819_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20231215/3757512/3757512_17174324423793_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240402/4090593/4090593_1723698090538_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240426/4089373/4089373_17101217775509_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240906/4413974/4413974_1720597469437_big.jpg?w=1200"
                    },
                    new String[]{
                            "https://www.musinsa.com/products/4081512",
                            "https://www.musinsa.com/products/4409069",
                            "https://www.musinsa.com/products/4358030",
                            "https://www.musinsa.com/products/3714100",
                            "https://www.musinsa.com/products/4165129",
                            "https://www.musinsa.com/products/4165022",
                            "https://www.musinsa.com/products/3757512",
                            "https://www.musinsa.com/products/4090593",
                            "https://www.musinsa.com/products/4089373",
                            "https://www.musinsa.com/products/4413974"
                    }
            )),

            MALE_INVERTED_TRIANGLE(
                    "역삼각형",
                    "역삼각형 체형의 남자는 넓은 어깨와 좁은 허리를 특징으로 하며, 운동을 자주 하는 남성에게 흔히 볼 수 있는 체형입니다. 이 체형은 상체가 발달하여 매우 남성적이고 강인한 인상을 줍니다. 스타일링 시 이 체형의 장점을 살리기 위해서는 상체의 볼륨을 과도하게 강조하지 않는 것이 중요합니다. V넥이나 슬림핏의 상의를 선택하여 근육의 라인을 자연스럽게 드러내는 것이 좋습니다. 하의는 조금 여유 있는 핏을 선택하여 전체적인 실루엣의 균형을 맞추는 것이 좋습니다.", "역삼각형 체형을 가진 남성이 스타일링 시 주의해야 할 점은 너무 밝은 색상이나 크고 복잡한 패턴의 상의는 상체를 더욱 부각시켜 비례가 과장될 수 있으므로 피하는 것이 좋습니다. 또한, 너무 꽉 끼는 옷은 오히려 체형의 단점을 부각시킬 수 있으므로 적당한 핏의 옷을 선택하는 것이 중요합니다. 전체적으로 균형 잡힌 실루엣을 유지하면서도, 체형의 장점을 살릴 수 있는 스타일링을 추구해야 합니다.",
                    TopClothesItem.createClothesItems(
                    new String[]{
                            "더블 플랩 투 포켓 셔츠 [블랙]",
                            "스웨이드 패널 트러커 집업 자켓 [BROWN]",
                            "washed trucker jacket (wine)",
                            "zip up knit cardigan (navy)",
                            "essential knit (brown)",
                            "코듀로이 웨스턴 자켓 - 브라운",
                            "울 오버핏 V넥 니트 - 네이비",
                            "LA MAISON DE MES REVES PULLOVER KNIT IVORY",
                            "HERITAGE DENIM TRUCKER DARK INDIGO",
                            "헨리넥 롱 슬리브 티셔츠 (블랙)",
                            "멀티 핀 스트라이프 오버사이즈 셔츠 (블루)"
                    },
                    new String[]{
                            "데코로소",
                            "드로우핏",
                            "노운",
                            "노운",
                            "노운",
                            "르마드",
                            "르마드",
                            "메종미네드",
                            "메종미네드",
                            "주앙옴므",
                            "쿠어"
                    },
                    new String[]{
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240819/4344555/4344555_17254594052985_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240807/4305674/4305674_17236134330113_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240903/4396634/4396634_17260344590585_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240903/4396660/4396660_17260344266716_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240903/4396624/4396624_17260344266176_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240420/4404292/4404292_172555001426386_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240802/4293019/4293019_17258152754602_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240919/4446254/4446254_17267425832525_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240827/4375926/4375926_17249160533408_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240821/4355520/4355520_17248800231327_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4348636/4348636_17242432871440_big.jpg?w=1200"
                    },
                    new String[]{
                            "https://www.musinsa.com/products/4344555",
                            "https://www.musinsa.com/products/4305674",
                            "https://www.musinsa.com/products/4296049",
                            "https://www.musinsa.com/products/4396634",
                            "https://www.musinsa.com/products/4396608",
                            "https://www.musinsa.com/products/4404292",
                            "https://www.musinsa.com/products/4293019",
                            "https://www.musinsa.com/products/4446254",
                            "https://www.musinsa.com/products/4375926",
                            "https://www.musinsa.com/products/4355520",
                            "https://www.musinsa.com/products/4348636"}
                            ),


            BottomClothesItem.createBottomClothesItems(
                    new String[]{
                            "노 페이드 카펜터 데님 팬츠 (올리브 그린)",
                            "더티 엠보 레귤러 워싱 진스 (라이트 그레이)",
                            "카이로 오일 데님 팬츠 (오크 블루)",
                            "KIPAS 와이드 데님 팬츠 [라이트 인디고]",
                            "24SS Drape Denim Pants Light Blue",
                            "더블 니 데님 카펜터 팬츠_블랙",
                            "리플렉트 커브드 치노 팬츠 [블랙]",
                            "Santiago Chino Pants (Graphite)",
                            "Bonjour 2Tuck Pants (Taupe-Gray)",
                            "wide tapered pants (stripe charcoal)",
                            "디스트로이드 플레어 데님 팬츠 (빈티지블루)"
                    },
                    new String[]{
                            "쿠어",
                            "쿠어",
                            "파브레가",
                            "무탠다드",
                            "레프사이드",
                            "키뮤어",
                            "밀로 아카이브",
                            "어나더 오피스",
                            "노운",
                            "노운",
                            "노이어"
                    },
                    new String[]{
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4347792/4347792_17243959436604_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240829/4382924/4382924_17252774589367_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20231027/3663415/3663415_1714370362057_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20230301/3056168/3056168_17138662122274_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240718/4258917/4258917_17247522977299_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20230806/4301871/4301871_17243704923658_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240606/4107797/4107797_17152660902020_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/snap/images/20240911/b75856af3eb74c8dabf76dd3b58e9ec7.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240606/4180711/4180711_1717658302946_big.jpg?w=1200",
                            "https://image.msscdn.net/thumbnails/images/goods_img/20240827/3839625/3839625_17169597190651_big.jpg?w=1200"
                    },
                    new String[]{
                            "https://www.musinsa.com/products/4347792",
                            "https://www.musinsa.com/products/4382924",
                            "https://www.musinsa.com/products/3663415",
                            "https://www.musinsa.com/products/3056168",
                            "https://www.musinsa.com/products/4258917",
                            "https://www.musinsa.com/products/4301871",
                            "https://www.musinsa.com/products/4107797",
                            "https://www.musinsa.com/products/3715721",
                            "https://www.musinsa.com/products/4180711",
                            "https://www.musinsa.com/products/3839625"
                    }
            )),
            MALE_OVAL("원형", "원형 체형의 남자는 복부 주위에 볼륨이 있어 전체적으로 원형에 가까운 체형을 가지고 있습니다. 이 체형은 상체 중심으로 무게감이 느껴지며, 비교적 짧은 목과 넓은 허리라인이 특징입니다. 이러한 체형의 남성에게는 실루엣을 길고 슬림하게 보이도록 하는 스타일링이 필요합니다. 세로 줄무늬 패턴의 셔츠나 니트를 선택하여 시각적으로 높이를 더해주고, V넥이나 열린 카라 디자인의 상의를 통해 목선을 길어 보이게 하는 것이 좋습니다. 또한, 상의는 몸에 약간 여유 있는 핏을 선택하여 복부를 자연스럽게 커버할 수 있습니다.\n" +
                            "\n" +
                            "하의는 스트레이트 핏이나 약간의 테이퍼드 핏을 선택하여 다리 라인을 깔끔하게 보이도록 하며, 상의와 비슷한 색상의 벨트를 사용하여 허리 라인을 정의하는 것이 좋습니다. 하의 색상은 상의보다 약간 어두운 톤을 선택하여 전체적인 비율을 조화롭게 만드는 것이 효과적입니다. 자켓이나 코트를 입을 때는 허리선이 드러나는 디자인보다는 스트레이트하게 떨어지는 스타일을 선택하는 것이 좋습니다.", "사각형 체형의 남성이 옷을 선택할 때 주의해야 할 점은 너무 박시하거나 너무 타이트한 옷은 피하는 것이 좋습니다. 박시한 옷은 체형의 단점을 강조할 수 있으며, 너무 타이트한 옷은 불편함을 줄 수 있습니다. 또한 너무 복잡한 패턴이나 큰 로고는 피하고, 심플하고 깔끔한 디자인을 선택하는 것이 전체적인 스타일링을 깔끔하게 만들어 줍니다. 체형의 단점을 커버하고 장점을 강조할 수 있는 스타일링을 추구하는 것이 중요합니다.",
                    TopClothesItem.createClothesItems(
                            new String[]{
                                    "Blue Chambray Work Shirt KR Ver.",
                                    "Vintage Long Sleeve Henley Shirt Black",
                                    "WASHED DENIM WORK JACKET-BLUE",
                                    "오버사이즈 PBT 라운드 가디건 [M.CHARCOAL]",
                                    "소프트 울 하찌 가디건/블랙",
                                    "W.S VARSITY JACKET - BLACK",
                                    "에디토리얼 자켓 [블랙]",
                                    "Flying Tigers Heavyweight Sweatshirt Vintage Black",
                                    "LOVE GONE SWEATSHIRT [BROWN]",
                                    "울 카라 블루종 블랙",
                                    "올데이 컴피 60수 셔츠 인디고 네이비"
                            },
                            new String[]{
                                    "브론슨",
                                    "브론슨",
                                    "에이카화이트",
                                    "드로우핏",
                                    "노아브",
                                    "노매뉴얼",
                                    "밀로 아카이브",
                                    "에스피오나지",
                                    "퍼츠",
                                    "코포위",
                                    "애슴"
                            },
                            new String[]{
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240807/4306299/4306299_17243889466283_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20210823/2081571/2081571_16878489357266_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240124/3819474/3819474_17072880575633_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240806/4301097/4301097_17252412308350_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240809/3477735/3477735_16927827620325_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240729/4280331/detail_4280331_17235212336963_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240125/3823537/3823537_17078187266567_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220927/2821852/2821852_1_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240912/4433896/4433896_17260672994173_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240731/4284658/4284658_17241334958200_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240808/4310574/4310574_17231058025309_big.jpg?w=1200"
                            },
                            new String[]{
                                    "https://www.musinsa.com/products/4306299",
                                    "https://www.musinsa.com/products/2081571",
                                    "https://www.musinsa.com/products/3819474",
                                    "https://www.musinsa.com/products/4301097",
                                    "https://www.musinsa.com/products/3477735",
                                    "https://www.musinsa.com/products/4280331",
                                    "https://www.musinsa.com/products/3823537",
                                    "https://www.musinsa.com/products/2821852",
                                    "https://www.musinsa.com/products/4433896",
                                    "https://www.musinsa.com/products/4284658",
                                    "https://www.musinsa.com/products/4310574"
                            }
                    ),
                    BottomClothesItem.createBottomClothesItems(
                            new String[]{
                                    "Oxford Fatigue Baggy Pants - Beige",
                                    "투턱 와이드 슬랙스-블랙",
                                    "MAD PLEATS WIDE TROUSERS (DARK GREY)",
                                    "가먼트 다잉 커브드 팬츠 차콜",
                                    "1705 FADED BLACK JEANS [MAX WIDE STRAIGHT]",
                                    "DWARF DENIM PANTS (BLACK)",
                                    "XP172 빅 와이드 벌룬 데님 팬츠 (BLUE)",
                                    "워크 와이드 데님 팬츠-틴트블랙",
                                    "범프 워시드 카고 팬츠_데저트",
                                    "VLAD 원턱 피그먼트 페이드 워싱 스웻 팬츠_블랙",
                                    "One Pintuck wide 04 - Ivory"
                            },
                            new String[]{
                                    "낫포너드",
                                    "톤즈",
                                    "주앙옴므",
                                    "디엔에스알",
                                    "브랜디드",
                                    "톤즈",
                                    "위캔더스",
                                    "인템포무드",
                                    "디미트리블랙",
                                    "VLAD",
                                    "오더아카이브"
                            },
                            new String[]{
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240911/4433871/4433871_17267924742148_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240826/4372478/4372478_1725378380983_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230424/3256864/3256864_16823281281428_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240909/4422885/4422885_17258808520181_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20231105/3714100/detail_3714100_17200758005572_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240826/4372470/4372470_17253784882153_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230920/3576618/3576618_1715954547587_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240828/4380125/detail_4380125_17272490599770_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240808/4308187/4308187_17240877729234_big.jpg?w=1200",
                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240517/2564089/2564089_17209102493181_big.jpg?w=1200"
                            },
                            new String[]{
                                    "https://www.musinsa.com/products/4433871",
                                    "https://www.musinsa.com/products/4372478",
                                    "https://www.musinsa.com/products/3256864",
                                    "https://www.musinsa.com/products/4422885",
                                    "https://www.musinsa.com/products/3714100",
                                    "https://www.musinsa.com/products/4372470",
                                    "https://www.musinsa.com/products/3576618",
                                    "https://www.musinsa.com/products/4380125",
                                    "https://www.musinsa.com/products/4308187",
                                    "https://www.musinsa.com/products/2564089"
                            }
                    ))
                    ,
                    MALE_RECTANGLE("사각형",
                            "사각형 체형의 남자는 어깨와 허리의 폭이 거의 비슷해 몸이 직사각형을 연상시키는 모습입니다. 이 체형의 남자는 명확한 허리선이 없어 전체적으로 상체와 하체가 일자로 떨어지는 특징을 지닙니다. 이런 체형의 남성에게는 몸에 약간 여유가 있는 핏의 옷을 선택하는 것이 좋습니다. 상의는 허리 라인을 강조할 수 있는 벨트를 추가하거나, 셔츠 안에 티셔츠를 입는 레이어드 스타일을 활용해 볼륨감을 더하는 것이 효과적입니다. 패턴이 있는 셔츠나 가로 줄무늬 상의를 통해 시각적인 흥미를 더할 수 있습니다. \"\\n\" + 사각형 체형을 가진 남성은 하의 선택 시 슬림핏이나 스트레이트핏을 선택하여 다리 라인을 좀 더 길고 슬림하게 보이게 하는 것이 중요합니다. 색상 대비를 이용해 상하의를 구분짓고, 상의보다 하의에 약간 더 어두운 색을 선택하는 것도 좋은 방법입니다. 액세서리를 활용하여 포인트를 주는 것도 좋으며, 신발은 조금 높은 굽을 선택하여 전체적인 비율을 좋게 만드는 것이 좋습니다.",
                            "사각형 체형의 남성이 옷을 선택할 때 주의해야 할 점은 너무 박시하거나 너무 타이트한 옷은 피하는 것이 좋습니다. 박시한 옷은 체형의 단점을 강조할 수 있으며, 너무 타이트한 옷은 불편함을 줄 수 있습니다. 또한 너무 복잡한 패턴이나 큰 로고는 피하고, 심플하고 깔끔한 디자인을 선택하는 것이 전체적인 스타일링을 깔끔하게 만들어 줍니다. 체형의 단점을 커버하고 장점을 강조할 수 있는 스타일링을 추구하는 것이 중요합니다.",

                            TopClothesItem.createClothesItems(
                                    new String[]{
                                            "멀티 핀 스트라이프 오버사이즈 셔츠 (화이트)",
                                            "핑거홀 코튼 라운드 니트 (5컬러)",
                                            "CROPPED HAIRY KNIT - MARINA",
                                            "90S 트랙 스웨트 셔츠_오트베이지",
                                            "Zinnia Mix Jacket-Black(NEW RENEWAL)",
                                            "Dawn Denim Jacket DCJK001Ivory",
                                            "울-웰더 가디건 _CHARCOAL",
                                            "워시드 데님 로드 바이커 자켓 INDIGO",
                                            "데일리 바이오 셔츠 - 10 COLOR",
                                            "90S 트랙 스웨트 셔츠_그레이",
                                            "스톤 워싱 오버핏 데님 긴팔 셔츠 (BLEACH BLUE)"
                                    },
                                    new String[]{
                                            "쿠어",
                                            "효지",
                                            "노매뉴얼",
                                            "1993스튜디오",
                                            "애니타임로릭",
                                            "데케트",
                                            "블랭크룸",
                                            "도프제이션",
                                            "수아레",
                                            "1993스튜디오",
                                            "트릴리온"
                                    },
                                    new String[]{
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4348671/4348671_17242431203549_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240816/4339076/4339076_17261039304732_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20230808/3451265/3451265_17237901730960_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20230127/3043045/3043045_16758476474406_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240911/4430638/4430638_17260335899766_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240123/3818459/detail_3818459_17070659425251_3_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240226/3900403/3900403_17090297422383_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4347055/4347055_17249829793442_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20221226/2996536/2996536_17152499753602_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20220118/2313388/2313388_16765930300318_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20230811/3461171/3461171_1691727518980_big.jpg?w=1200"
                                    },
                                    new String[]{
                                            "https://www.musinsa.com/products/4348671",
                                            "https://www.musinsa.com/products/4339076",
                                            "https://www.musinsa.com/products/3451265",
                                            "https://www.musinsa.com/products/3043045",
                                            "https://www.musinsa.com/products/4430638",
                                            "https://www.musinsa.com/products/3818459",
                                            "https://www.musinsa.com/products/3900403",
                                            "https://www.musinsa.com/products/4347055",
                                            "https://www.musinsa.com/products/2996536",
                                            "https://www.musinsa.com/products/2313388",
                                            "https://www.musinsa.com/products/3461171"
                                    }
                            ),
                            BottomClothesItem.createBottomClothesItems(
                                    new String[]{
                                            "카펜터 피그먼트 스웨트 팬츠-차콜",
                                            "워싱 스티치 데님 팬츠 (BROWN)",
                                            "시밀룩 데님 팬츠 틴트 브라운",
                                            "원턱 와이드 치노 팬츠(베이지)",
                                            "논페이드 윈턱 디벨룸 팬츠 [차콜]",
                                            "deep tuck washed denim pants (black)",
                                            "와이드핏 워싱 데님 팬츠 (빈티지 블루)",
                                            "베이직 코튼 치노 팬츠 (그레이쉬 베이지)",
                                            "1792 OLD SOUL JEANS [WIDE STRAIGHT]",
                                            "오버 다잉 카펜터 데미지 데님 팬츠 (워시드 블랙)"
                                    },
                                    new String[]{
                                            "톤즈",
                                            "트릴리온",
                                            "코포위",
                                            "시그니처",
                                            "미나브",
                                            "엔도어",
                                            "효지",
                                            "브랜디드",
                                            "쿠어",
                                            "도프제이션"
                                    },
                                    new String[]{
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240826/4372463/4372463_17253792400182_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20221014/2861239/2861239_1_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240731/4284713/4284713_1724835696040_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20230403/3920059/3920059_17243936789613_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240129/3830284/3830284_17048495191253_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240306/3928873/3928873_17097220347158_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240816/4339093/4339093_17253550798986_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240822/4358823/4358823_17246592654166_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4347053/4347053_17242454039233_big.jpg?w=1200",
                                            "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4347178/4347178_17249829619447_big.jpg?w=1200"
                                    },
                                    new String[]{
                                            "https://www.musinsa.com/products/4372463",
                                            "https://www.musinsa.com/products/2861239",
                                            "https://www.musinsa.com/products/4284713",
                                            "https://www.musinsa.com/products/3920059",
                                            "https://www.musinsa.com/products/3830284",
                                            "https://www.musinsa.com/products/3928873",
                                            "https://www.musinsa.com/products/4339093",
                                            "https://www.musinsa.com/products/4358823",
                                            "https://www.musinsa.com/products/4347053",
                                            "https://www.musinsa.com/products/4347178"
                                    }
                            )),
                            MALE_TRAPEZOID("사다리꼴형",
                                    "사다리꼴 체형의 남자는 상체가 비교적 크고 튼튼한 반면, 허리는 좁고 다리가 강조되는 체형을 가지고 있습니다. 이 체형은 운동을 많이 하는 남성에게서 종종 볼 수 있으며, 상체에 비해 하체가 더 발달해 있어 균형 잡힌 실루엣을 만드는 것이 중요합니다. 스타일링 시 상의는 너무 타이트하지 않으면서도 몸통을 잘 감사는 핏을 선택하여 상체의 근육이 자연스럽게 드러나도록 하는 것이 좋습니다. 라운드 넥보다는 V넥이나 폴로셔츠를 선택하여 목선을 길게 보이게 하고, 상체의 근육을 더욱 돋보이게 합니다.\n" +
                                            "\n" +
                                            "하의 선택 시에는 상체와의 균형을 고려하여 슬림핏이나 스트레이트 핏의 팬츠를 선택하는 것이 좋습니다. 하의는 너무 타이트하지 않은 스타일을 선택하여 다리가 더 굵어 보이는 것을 피하고, 전체적인 실루엣의 균형을 맞추는 것이 중요합니다. 색상이나 패턴에서는 심플하고 세련된 디자인을 선택하여 전체적인 스타일링을 깔끔하게 유지합니다.", "사다리꼴 체형의 남성이 스타일링 시 주의해야 할 점은 너무 과한 디테일이나 복잡한 패턴의 옷은 피하는 것이 좋습니다. 이러한 옷은 전체적인 실루엣을 무너뜨릴 수 있으며, 단정하고 깔끔한 이미지를 해칠 수 있습니다. 또한, 하체가 더 강조되지 않도록 하의 선택에 주의해야 하며, 상하의 색상 대비를 너무 강하게 주지 않는 것이 좋습니다. 전체적으로 균형 잡힌 실루엣을 쥬이하며, 자신의 체형을 잘 이해하고 그에 맞는 스타일을 찾는 것이 중요합니다.",
                                    TopClothesItem.createClothesItems(
                                            new String[]{
                                                    "AECA BIG LOGO WOOL KNIT-BLUE",
                                                    "CABLE STRIPE HENLEY NECK KNIT NAVY",
                                                    "헤어리 스트라이프 니트 (브라운)",
                                                    "OVERSIZED LONG SLEEVE RUGBY T-SHIRTS (NAVY)",
                                                    "코듀로이 카라 데님 집업 워크 자켓 (LIGHT GRAY)",
                                                    "배드가이 데님 웨스턴 셔츠 라이트 블루",
                                                    "알파카 그레디언트 스웨트 (라이트 그레이)",
                                                    "루이 레더 카라 워크 자켓 BEIGE",
                                                    "오버핏 크롭 데님 자켓 (크림)",
                                                    "JOSHUA MODERN CLASSIC BLOUSON #1",
                                                    "세터 로고 보야지 스웨트셔츠 멜란지 아이보리"
                                            },
                                            new String[]{
                                                    "에이카화이트",
                                                    "포커페이스",
                                                    "쿠어",
                                                    "발루트",
                                                    "트릴리온",
                                                    "엘무드",
                                                    "쿠어",
                                                    "도프제이션",
                                                    "노이어",
                                                    "시도",
                                                    "세터"
                                            },
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20210902/2106723/2106723_1724060139182_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240812/4318436/4318436_1724305890836_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240830/4390314/4390314_17252781970069_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240911/4430536/4430536_17260286083116_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240731/4287406/4287406_1722906613849_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240729/4278870/4278870_1722955158761_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20210823/2081109/2081109_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4347178/4347178_17249829793442_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220214/2359413/2359413_17080536785645_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240730/4283564/4283564_17222373161754_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230922/3589170/3589170_1698160589836_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/2106723",
                                                    "https://www.musinsa.com/products/4318436",
                                                    "https://www.musinsa.com/products/4390314",
                                                    "https://www.musinsa.com/products/4430536",
                                                    "https://www.musinsa.com/products/4287406",
                                                    "https://www.musinsa.com/products/4278870",
                                                    "https://www.musinsa.com/products/2081109",
                                                    "https://www.musinsa.com/products/4347178",
                                                    "https://www.musinsa.com/products/2359413",
                                                    "https://www.musinsa.com/products/4283564",
                                                    "https://www.musinsa.com/products/3589170"
                                            }
                                    ),
                                    BottomClothesItem.createBottomClothesItems(
                                            new String[]{
                                                    "맥스와이드 데님 소닉 블루",
                                                    "맥스와이드 데님 더스트 그레이",
                                                    "와이드 카고 파라슈트 팬츠 - 베이지",
                                                    "Rustle Parachute Cargo Pants - IVORY",
                                                    "빅 브러쉬 엑스트라 와이드 데님 팬츠 [러스트 스카이블루]",
                                                    "VLAD 라운드 슬랙 데님 팬츠_더스트 인디고",
                                                    "투 턱 와이드 데님 팬츠 [크림]",
                                                    "Triangle Trousers Silver",
                                                    "wide one tuck denim pants indigo washed",
                                                    "프론트 워싱 세미 와이드핏 데님[라이트인디고]",
                                                    "리오셀 퍼티그 파라슈트 팬츠 [BEIGE]"
                                            },
                                            new String[]{
                                                    "엘무드",
                                                    "엘무드",
                                                    "노이즈",
                                                    "마틴플랜",
                                                    "무탠다드",
                                                    "디미트리블랙",
                                                    "무탠다드",
                                                    "해칭룸",
                                                    "유니폼브릿지",
                                                    "시그니처",
                                                    "시즈"
                                            },
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220124/2322096/2322096_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240729/4278826/4278826_1722953277553_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240805/4296406/4296406_1724993055281_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230130/3046840/3046840_1676506320675_big.png?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240802/3859522/3859522_17171273009328_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240808/4308206/4308206_17240889475437_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220328/2447796/2447796_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20200206/1294464/1294464_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240116/3797063/3797063_17243932348228_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240119/3807869/3807869_17061910804370_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/2322096",
                                                    "https://www.musinsa.com/products/4278826",
                                                    "https://www.musinsa.com/products/4296406",
                                                    "https://www.musinsa.com/products/3046840",
                                                    "https://www.musinsa.com/products/3859522",
                                                    "https://www.musinsa.com/products/4308206",
                                                    "https://www.musinsa.com/products/2447796",
                                                    "https://www.musinsa.com/products/1294464",
                                                    "https://www.musinsa.com/products/3797063",
                                                    "https://www.musinsa.com/products/3807869"
                                            }
                                    )
                            ),

                            //여자 체형
                            FEMALE_TRIANGLE(
                                    "삼각형",
                                    "삼각형 체형을 가진 여성은 엉덩이와 허벅지가 어깨와 가슴보다 넓고 발달된 특징이 있습니다. 상체는 상대적으로 작고 좁은 편이며, 허리는 잘록하게 들어가 상체와 하체의 경계가 뚜렷합니다. 이러한 체형은 상체와 하체의 비율을 맞추고, 하체를 덜 부각시키는 스타일이 어울립니다.",
                                    "삼각형 체형을 가진 여성은 타이트한 스커트를 피하는 것이 좋습니다. 특히 펜슬 스커트는 엉덩이와 허벅지를 더 강조해 하체의 부각을 더 심하게 만듭니다. 밝은 색의 바지나 스커트 역시 피해야 합니다. 밝은 색은 시선을 끌어 하체를 더 넓어 보이게 하기 때문입니다. 또한, 큰 무늬나 화려한 패턴의 하의는 하체를 더 강조하게 되므로 피하는 것이 좋습니다. 상체를 좁아 보이게 하는 의류도 피해야 합니다. 좁은 어깨선의 상의, 하이넥 상의, 어두운 색의 상의는 상체를 더 작아 보이게 하여 하체와의 비율을 맞추기 어렵게 합니다.",
                                    TopClothesItem.createClothesItems(
                                            new String[]{"BACK RIBBON SQUARE NECK BLOUSE WHITE", "Pigment Felt Crop Hoody - 3COL", "[본챔스X소라노] [3컬러] 소라노 CHMPS 베이직 로고 니트 B24FT12", "여성 울라이크 기모 체크 셔츠-BFRG5454C0D", "무이 블라우스_크림", "리버시블 샤이니 타이 블라우스_SKYBLUE", "Active Crop Hoody Zip-Up 버터크림", "[사나 착용]CALECHE basic cotton shirt_5colors", "손자수 빈티지 케이블 니트_아이보리", "[무료반품]MRT 레글런 스웨트셔츠 크림"},
                                            new String[]{"어반드레스", "어반드레서", "본챔스", "체이스컬트", "위드아웃썸머", "플루나 스튜디오", "인지액티브", "르니나", "루바티", "벤힛"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20211006/2164959/2164959_2_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230816/3468979/3468979_17189554208111_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240806/4301912/4301912_17252013768995_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20221013/2858062/2858062_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240819/4341774/4341774_17242052664262_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240426/4089827/4089827_17141008199700_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20221209/2977085/2977085_1_big.png?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240814/4331940/4331940_17246777151188_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240101/3770982/3770982_17080188410736_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240718/4258150/4258150_17218996981291_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/2164959",
                                                    "https://www.musinsa.com/products/3468979",
                                                    "https://www.musinsa.com/products/4301912",
                                                    "https://www.musinsa.com/products/2858062",
                                                    "https://www.musinsa.com/products/4341774",
                                                    "https://www.musinsa.com/products/4089827",
                                                    "https://www.musinsa.com/products/2977085",
                                                    "https://www.musinsa.com/products/4331940",
                                                    "https://www.musinsa.com/products/3770982",
                                                    "https://www.musinsa.com/products/4258150"
                                            }),
                                    BottomClothesItem.createBottomClothesItems(
                                            new String[]{"3 BUTTONS CLUB PANTS_black", "리나 플레어 스커트 블랙", "나일론 카고 와이드 히든 밴딩팬츠", "우먼즈 세미 부츠 컷 유틸리티 카고 팬츠 [블랙]", "셀비지 데님 팬츠_BLUE", "Alexis Belt Pleats Skirt - 4COL", "우먼즈 데님 카고 밴딩 맥시 스커트 [미디엄 인디고]", "데일리 허리 끈 밴딩 카고 롱 스커트 (NO2WH003L0)", "[26-36]센시블 플리츠 롱 스커트", "와이드 데님 컷팅 뒷 밴딩 롱 팬츠 (NO1TA006L0)"},
                                            new String[]{"에프엠9102", "맥키", "어커버", "무신사 스탠다드 우먼", "아티드", "어반드레스"," 무신사 스탠다드 우먼", "나인식스뉴욕", "미케네", "나인식스뉴욕"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20211125/2247837/2247837_3_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230203/3058718/3058718_16759230255442_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230329/3188531/3188531_17145214186620_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20231215/3758422/3758422_17086597985894_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230906/3537134/3537134_17116939662096_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240226/3900198/3900198_17186783640388_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240213/3861416/3861416_17122124388281_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240826/4370047/4370047_17246496777635_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240830/4388261/4388261_17249934968652_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240826/4369436/4369436_17246433101907_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/2247837",
                                                    "https://www.musinsa.com/products/3058718",
                                                    "https://www.musinsa.com/products/3188531",
                                                    "https://www.musinsa.com/products/3758422",
                                                    "https://www.musinsa.com/products/3537134",
                                                    "https://www.musinsa.com/products/3900198",
                                                    "https://www.musinsa.com/products/3861416",
                                                    "https://www.musinsa.com/products/4370047",
                                                    "https://www.musinsa.com/products/4388261",
                                                    "https://www.musinsa.com/products/4369436"
                                            })),
                            FEMALE_INVERTED_TRIANGLE("역삼각형","역삼각형 체형을 가진 여성은 어깨와 가슴이 엉덩이보다 넓고 발달된 특징이 있습니다. 상체가 하체에 비해 상대적으로 크고 넓어 보이며, 허리와 엉덩이는 비교적 작고 좁습니다. 이러한 체형은 상체의 넓이를 줄이고 하체를 부각시키는 스타일이 어울립니다.","역삼각형 체형을 가진 여성은 어깨를 더 넓어 보이게 하는 의류를 피하는 것이 좋습니다. 특히 패드가 들어간 어깨 디자인이나 퍼프 소매는 어깨를 더 강조해 상체의 부각을 더 심하게 만듭니다. 또한, 높은 넥라인의 상의는 시선을 상체로 집중시켜 어깨와 가슴을 더 강조하게 되므로 피하는 것이 좋습니다. 밝은 색이나 화려한 패턴의 상의도 상체를 부각시킬 수 있어 피해야 합니다. 반대로, 타이트한 하의는 하체를 더 작아 보이게 하여 상체와의 비율을 맞추기 어렵게 합니다.",
                                    TopClothesItem.createClothesItems(
                                            new String[]{"Half Patchwork Knitwear MELANGE", "Square Neck Line Crop Long Sleeve Knit BLACK", "Noga Shoulder Cut-out Knit - 5COL", "Collar Slit Knit - 4COL", "Beauty shoulder t-shirt - 5COL", "Bonnie Off-shoulder Scarf T-shirt - 5COL", "Ribbed wrap Knit GREY", "스티치프릴 유넥 긴팔 티셔츠 [3color]", "[5컬러] 스트라이프 언발란스 오프숄더 스웨터", "로고 스티치 스트라이프 티셔츠 [블랙]"},
                                            new String[]{"어반드레스", "어반드레스", "어반드레스", "어반드레스", "어반드레스", "어반드레스", "어반드레스", "무아무아", "제로스트릿", "무아무아"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220829/2751819/2751819_17206651319844_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230927/3599457/3599457_17206143164179_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230927/3599377/3599377_17230038751236_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240226/3901634/3901634_17186841764491_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220208/2346261/2346261_16915397429705_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240115/3794797/3794797_17187044407382_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220829/2751849/2751849_17206711527653_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240229/3914604/3914604_17095356509072_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230831/3516569/3516569_17274021878638_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240731/4287378/4287378_17241389721124_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/2751819",
                                                    "https://www.musinsa.com/products/3599457",
                                                    "https://www.musinsa.com/products/3599377",
                                                    "https://www.musinsa.com/products/3901634",
                                                    "https://www.musinsa.com/products/2346261",
                                                    "https://www.musinsa.com/products/3794797",
                                                    "https://www.musinsa.com/products/2751849",
                                                    "https://www.musinsa.com/products/3914604",
                                                    "https://www.musinsa.com/products/3516569",
                                                    "https://www.musinsa.com/products/4287378"
                                            }),
                                    BottomClothesItem.createBottomClothesItems(
                                            new String[]{"우먼즈 파라슈트 팬츠 [크림]", "우먼즈 원 턱 와이드 데님 팬츠 [라이트 인디고]", "MAY SHIRRING SKIRT (3colors)", "화이트 와이드 데님 팬츠", "[25-36] 센트 베이직 핀턱 쇼츠", "와이드 밴딩 코튼 팬츠 [라이트그레이]", "[데일리지] 롱 와이드 진_SPTJEA9G51", "우먼즈 하이 웨이스트 와이드 히든 밴딩 슬랙스 [더스티 베이지]", "[4color] 시그니처 코튼 미니 스커트 MDSK020", "셔링 리본 티어드 롱스커트 아이보리"},
                                            new String[]{"무신사 스탠다드 우먼", "무신사 스탠다드 우먼", "망고매니플리즈", "니브", "미케네", "무아무아", "스파오", "무신사 스탠다드 우먼", "몽돌", "하이스쿨디스코"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20221209/2978125/2978125_16914594697622_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220328/2448883/2448883_17179924288846_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230612/3359598/3359598_16865669955533_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230303/3120643/3120643_16778200761244_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230816/3467150/3467150_17180922410774_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240219/3879810/3879810_17084913085774_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240103/3773214/3773214_17073527402450_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220511/2551392/2551392_16810943566327_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240304/3920755/3920755_17109176995440_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240227/3907259/3907259_17091834494311_big.png?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/app/goods/2978125",
                                                    "https://www.musinsa.com/products/2448883",
                                                    "https://www.musinsa.com/products/3359598",
                                                    "https://www.musinsa.com/products/3120643",
                                                    "https://www.musinsa.com/products/3467150",
                                                    "https://www.musinsa.com/products/3879810",
                                                    "https://www.musinsa.com/products/3773214",
                                                    "https://www.musinsa.com/products/2551392",
                                                    "https://www.musinsa.com/products/3920755",
                                                    "https://www.musinsa.com/products/3907259"
                                            })
                            ),
                            FEMALE_OVAL("타원형","타원형 체형을 가진 여성은 허리가 가장 넓고 전체적인 실루엣이 둥글고 부드러운 곡선을 이루는 특징이 있습니다. 허리 라인이 뚜렷하지 않으며, 어깨와 엉덩이는 상대적으로 좁은 편입니다. 이러한 체형은 허리 부분을 감추고 상체와 하체의 비율을 맞추는 스타일이 어울립니다.","어깨와 엉덩이는 상대적으로 좁은 편입니다. 이러한 체형은 허리 부분을 감추고 상체와 하체의 비율을 맞추는 스타일이 어울립니다.\n" +
                                            "\n" +
                                            "타원형 체형을 가진 여성은 허리 부분을 강조하는 의류를 피하는 것이 좋습니다. 특히, 타이트한 허리선이나 크롭탑은 허리와 복부를 더 부각시킬 수 있습니다. 또한, 가로 줄무늬의 상의나 밝은 색상의 허리띠는 허리 부분을 강조하여 체형을 더 넓어 보이게 만듭니다. 전체적으로 타이트한 핏의 옷도 체형을 부각시켜 불편할 수 있습니다. 하이넥 상의는 상체를 더 둥글고 짧아 보이게 할 수 있어 피하는 것이 좋습니다.",
                                    TopClothesItem.createClothesItems(
                                            new String[]{"퓨어 스트랩 블라우스_Pure White", "심플 브이넥 골지 스웨터 베이직 긴팔 니트 (BV3KP023L0)", "리브드 퍼프 니트 - 아이보리", "브이넥 울 케이블 니트 - 네이비", "MF 라나 리본 오프 숄더 니트-아이보리", "[사나 착용]MELA stripe T-shirt_2colors", "루즈핏 보트넥 크롭 니트 그래픽 슬리브 스웻 티셔츠", "로고 스트라이프 카라 맨투맨 [그레이]", "Dittany lace blouse (black)", "스퀘어넥 버튼 다운 숏 긴팔 블라우스 (TV3BL004L0)"},
                                            new String[]{"오로", "비엔엑스", "라운드트리코", "라미네즈", "문페어리", "르니나", "썸플레이스", "무아무아", "리엘", "탱커스"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240502/4101543/4101543_17147167761160_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240820/4346884/4346884_17241305164096_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240128/3827189/3827189_17064299889970_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20231103/3682739/3682739_16989849635994_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20231018/3638405/3638405_16977139785872_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240822/4360095/4360095_17246785289687_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230112/3020174/3020174_16750376791070_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240729/4280837/4280837_17234567693954_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240829/4383738/4383738_17255244720493_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240823/4367703/4367703_17244076313047_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/4101543",
                                                    "https://www.musinsa.com/products/4346884",
                                                    "https://www.musinsa.com/products/3827189",
                                                    "https://www.musinsa.com/products/3682739",
                                                    "https://www.musinsa.com/products/3638405",
                                                    "https://www.musinsa.com/products/4360095",
                                                    "https://www.musinsa.com/products/3020174",
                                                    "https://www.musinsa.com/products/4280837",
                                                    "https://www.musinsa.com/products/4383738",
                                                    "https://www.musinsa.com/products/4367703"
                                            }),
                                    BottomClothesItem.createBottomClothesItems(
                                            new String[]{"우먼즈 더블 니트 투 턱 와이드 라운지 스웨트 팬츠 [블랙]", "RD002 화이트 부츠컷 팬츠", "버클 하이웨스트 플레어 스커트 - 딥 차콜", "핀턱 버뮤다 코튼 팬츠 - 블랙", "[25-36] 썬플라워 플리츠 미디 스커트", "Signature Semi Wide Denim Pants_CREAM WHITE", "WOMEN 기능성 바스락 와이드 카고 슬랙스 팬츠 [BLACK]", "드웰린 카고 미니스커트(벨트set)", "[장원영 Pick]SUEDE MERMAID SKIRT DEEP BROWN", "벨트 세트 미디 플리츠 밴딩 스커트 - 베이지"},
                                            new String[]{"무신사 스탠다드 우먼", "람", "엣드맹", "로에일", "미케네", "으음키임", "콜릿", "트위", "로라로라", "아워호프"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220927/2820939/2820939_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240405/4030852/4030852_17123001398203_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230919/3575163/3575163_16951190821072_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220314/2416640/2416640_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240411/4043539/4043539_17128033401176_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240228/3908819/3908819_17201526590692_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230130/3047078/3047078_16768736561643_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240821/4354028/4354028_17242251966161_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240809/4313803/4313803_17246295755734_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240813/4327433/4327433_17235400234492_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/app/goods/2820939",
                                                    "https://www.musinsa.com/app/goods/4030852",
                                                    "https://www.musinsa.com/app/goods/3575163",
                                                    "https://www.musinsa.com/products/2416640",
                                                    "https://www.musinsa.com/products/4043539",
                                                    "https://www.musinsa.com/products/3908819",
                                                    "https://www.musinsa.com/products/3047078",
                                                    "https://www.musinsa.com/products/4354028",
                                                    "https://www.musinsa.com/products/4313803",
                                                    "https://www.musinsa.com/products/4327433"
                                            })
                            ),
//todo: 3번째 로라로라 바꾸기
                            FEMALE_RECTANGLE("사각형","사각형 체형을 가진 여성은 어깨, 허리, 엉덩이가 거의 같은 폭을 가지고 있으며, 허리 라인이 뚜렷하지 않은 특징이 있습니다. 전체적으로 일자 형태를 이루며, 곡선이 많이 드러나지 않습니다. 이러한 체형은 허리 라인을 강조하고 곡선을 더해주는 스타일이 어울립니다.","사각형 체형을 가진 여성은 허리 라인이 뚜렷하지 않은 의류를 피하는 것이 좋습니다. 특히, 박시한 핏의 옷이나 스트레이트 라인의 드레스는 체형을 더 평평하게 보이게 합니다. 또한, 허리 부분이 타이트하지 않은 상의나 하의를 피해야 하며, 직선적인 디자인의 옷은 곡선을 부각시키지 못해 체형을 더 단조롭게 만들 수 있습니다. 너무 타이트한 옷 역시 허리의 부재를 강조하여 체형을 부각시킬 수 있습니다.",
                                    TopClothesItem.createClothesItems(
                                            new String[]{"Half Patchwork Knitwear BLACK", "링클 프리 오픈 카라 셔츠_WHITE", "로제 니트 뷔스티에 (블랙)", "LTT 사이드 리본티 4color", "드미지 시스루 텐셀 셔링 블라우스", "사틴 언발 라운드 셔츠 화이트 [T43]", "링클 프리 벨티드 셔츠_WHITE", "울 브이넥 스카프 세트 니트 풀오버_MELANGE GREY", "더블리 언발란스 세트 티 (2컬러)", "PA SHOULDER HOLE MTM(OATMEAL)"},
                                            new String[]{"어반드레스", "시티브리즈 우먼", "오디에스", "칙스", "스토리가든", "바이바이섭", "시티브리즈 우먼", "시티브리즈 우먼", "무센트", "러브이즈트루"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220829/2751799/2751799_17206705282507_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240308/3934410/3934410_17098798320091_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20231026/3662683/3662683_17109866220205_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240130/3833577/3833577_17200559059849_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240528/4161666/4161666_17168945937787_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240813/4327131/4327131_17236166446294_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240812/4321969/4321969_17255981939235_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240805/4295889/4295889_17255984535526_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240807/4305052/4305052_17230113013769_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240813/4326695/4326695_17235348555736_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/2751799",
                                                    "https://www.musinsa.com/products/3934410",
                                                    "https://www.musinsa.com/products/3662683",
                                                    "https://www.musinsa.com/products/3833577",
                                                    "https://www.musinsa.com/products/4161666",
                                                    "https://www.musinsa.com/products/4327131",
                                                    "https://www.musinsa.com/products/4321969",
                                                    "https://www.musinsa.com/products/4295889",
                                                    "https://www.musinsa.com/products/4305052",
                                                    "https://www.musinsa.com/products/4326695"
                                            }),
                                    BottomClothesItem.createBottomClothesItems(
                                            new String[]{"[FAINA 7147] 커버밴드 슬림 부츠컷 코튼팬츠(블랙)", "볼륨 트윌 스커트 [IVORY] / WBD1L13504", "와이드 플레어 면팬츠 크림베이지", "베티붑 카고 플리츠 미니 스커트_(2 colors)", "베이직 코튼 팬츠 [아이보리]", "[7145] 논이염 스티치 컷팅 생지 부츠컷 (블랙)", "[노윤서 PICK]우먼 플레어핏 데님 팬츠 인디고 라이트", "로우 스퀘어 포켓 와이드 생지데님 팬츠", "(우먼)울 언밸런스 플리츠 롱 스커트 블랙", "플레인 코튼 스커트"},
                                            new String[]{"밀리언코르", "제너럴아이디어", "언노운 플라넷", "얼킨 캔버스", "무아무아", "밀리언코르", "리", "프렌치시크", "수아레", "유라고"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220203/2339572/2339572_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240314/3956091/3956091_17104744558271_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240219/3878495/3878495_17146297043880_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20231212/3753861/3753861_17229102449305_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240409/4040148/4040148_17132701601487_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220203/2339566/2339566_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230807/3447509/3447509_17071062813047_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240904/4403729/4403729_17254309275024_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240829/4385810/4385810_17256024809685_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20210222/1807814/1807814_1_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/app/goods/2339572",
                                                    "https://www.musinsa.com/products/3956091",
                                                    "https://www.musinsa.com/products/3878495",
                                                    "https://www.musinsa.com/products/3753861",
                                                    "https://www.musinsa.com/products/4040148",
                                                    "https://www.musinsa.com/products/2339566",
                                                    "https://www.musinsa.com/products/3447509",
                                                    "https://www.musinsa.com/products/4403729",
                                                    "https://www.musinsa.com/products/4385810",
                                                    "https://www.musinsa.com/products/1807814"
                                            })
                            ),
                            FEMALE_HOURGLASS("모래시계형","모래시계 체형을 가진 여성은 어깨와 엉덩이가 비슷한 폭을 가지며, 잘록한 허리로 인해 뚜렷한 곡선을 이루는 특징이 있습니다. 상체와 하체의 비율이 균형 잡혀 있으며, 허리선이 잘 드러나 전체적으로 여성스러운 실루엣을 자랑합니다. 이러한 체형은 허리 라인을 강조하고 곡선을 살리는 스타일이 어울립니다.","모래시계 체형을 가진 여성은 너무 헐렁하고 박시한 옷을 피하는 것이 좋습니다. 이러한 옷은 허리선을 감추고 전체적인 곡선을 덜 부각시켜 체형의 장점을 살리지 못합니다. 또한, 일자형 드레스나 스트레이트 핏의 바지는 허리 라인을 숨겨 체형을 평평하게 보이게 할 수 있습니다. 너무 과한 장식이나 디테일이 많은 옷도 피해야 하며, 특히 상체나 하체에 불필요한 부피를 더해주는 디자인은 체형의 균형을 깨트릴 수 있습니다.",
                                    TopClothesItem.createClothesItems(
                                            new String[]{"로고스티치 라운드 배색 긴팔티 [화이트]", "로고 오픈카라 케이블 니트 [네이비]", "DIAGONAL BUTTON T / PINK", "로고 스티치 스트라이프 티셔츠 [블랙]", "더블리 언발란스 세트 티 (2컬러)", "미아 레이어드 탑 가디건 티셔츠 (2컬러)", "스모크 셔링 스쿱넥 롱슬리브 탑 CHARCOAL", "우먼즈 텐셀 슬림 컷 아웃 스트링 긴소매 티셔츠 [블랙]", "우먼즈 텐셀 턴 다운 오프 숄더 긴소매 티셔츠 [더스티 카키]", "DIAGONAL LOGO UNIQUE TEE - 6COL"},
                                            new String[]{"무아무아", "무아무아", "애즈온", "무아무아", "무센트", "어퓨커멘츠", "무신사 스탠다드 우먼", "무신사 스탠다드 우먼", "어반드레스"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240723/4269764/4269764_17219857310350_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240731/4287401/4287401_17238029119503_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240520/4142381/4142381_17167847961084_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240731/4287378/4287378_17241389721124_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240807/4305052/4305052_17230113013769_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240911/4431707/4431707_17260355903098_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240315/3960323/3960323_17109417715022_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240702/4227342/4227342_17253410696062_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240702/4227326/4227326_17253316557832_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20211006/2164913/2164913_16913673253012_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/products/4269764",
                                                    "https://www.musinsa.com/products/4287401",
                                                    "https://www.musinsa.com/products/4142381",
                                                    "https://www.musinsa.com/products/4287378",
                                                    "https://www.musinsa.com/products/4305052",
                                                    "https://www.musinsa.com/products/4431707",
                                                    "https://www.musinsa.com/products/3960323",
                                                    "https://www.musinsa.com/products/4227342",
                                                    "https://www.musinsa.com/products/4227326",
                                                    "https://www.musinsa.com/products/2164913"
                                            }),
                                    BottomClothesItem.createBottomClothesItems(
                                            new String[]{"우먼즈 와이드 카고 팬츠 [베이지]", "Greta Pocket Wrap Skirt CHARCOAL", "우먼즈 하이 웨이스트 와이드 히든 밴딩 슬랙스 [네이비]", "SDP 미니멀 스트레이트 데님 팬츠 3color", "우먼즈 와이드 카펜터 팬츠 [다크 그레이]", "우먼즈 와이드 데님 팬츠 [페일 블루]", "WOMEN 카고 히든 밴딩 미니스커트 치마 [블랙]", "COTTON LONG FLARE SKIRT BLACK", "[장원영 Pick]MERMAID DENIM SKIRT DEEP BLUE", "pleated short skirt-gray"},
                                            new String[]{"무신사 스탠다드 우먼", "어반드레스", "무신사 스탠다드 우먼", "칙스", "무신사 스탠다드 우먼", "무신사 스탠다드 우먼", "콜릿", "로라로라", "로라로라", "링서울"},
                                            new String[]{
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220926/2818152/2818152_16964873942327_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230829/3511194/3511194_17193017027527_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220511/2551393/2551393_1_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240328/4002590/4002590_17125356664960_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240620/4210255/4210255_17212896311386_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20220818/2725426/2725426_16903323608133_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230202/3056393/3056393_16772056453948_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230214/3080574/3080574_16771190350208_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20240809/4313800/4313800_17242960136424_big.jpg?w=1200",
                                                    "https://image.msscdn.net/thumbnails/images/goods_img/20230217/3091416/3091416_17101422594359_big.jpg?w=1200"
                                            },
                                            new String[]{
                                                    "https://www.musinsa.com/app/goods/2818152",
                                                    "https://www.musinsa.com/products/3511194",
                                                    "https://www.musinsa.com/products/2551393",
                                                    "https://www.musinsa.com/products/4002590",
                                                    "https://www.musinsa.com/products/4210255",
                                                    "https://www.musinsa.com/products/2725426",
                                                    "https://www.musinsa.com/products/3056393",
                                                    "https://www.musinsa.com/products/3080574",
                                                    "https://www.musinsa.com/products/4313800",
                                                    "https://www.musinsa.com/products/3091416"
                                            })
                            );

    private String name;
    private String features;
    private String careful;
    private List<TopClothesItem> topClothesItems;
    private List<BottomClothesItem> bottomClothesItems;
    BodyShape(String name, String features, String careful,List<TopClothesItem> topClothesItems,List<BottomClothesItem> bottomClothesItems){
        this.name = name;
        this.features = features;
        this.careful = careful;
        this.topClothesItems = topClothesItems;
        this.bottomClothesItems = bottomClothesItems;
    }
    @Builder
    @Getter @Setter
    @AllArgsConstructor
    public static class TopClothesItem {
        private String name;
        private String brand;
        private String imageUrl;
        private String siteUrl;
        private ClothesCategory clothesCategory;

        public static List<TopClothesItem> createClothesItems(String[]name,String [] brand, String []imageUrl, String []siteUrl){
            List<TopClothesItem> clothesItems = new ArrayList<>();
            for(int i = 0; i<clothesItems.size(); i++){
                clothesItems.add(TopClothesItem.builder().name(name[i]).brand(brand[i]).imageUrl(imageUrl[i]).siteUrl(siteUrl[i]).clothesCategory(ClothesCategory.TOP).build());
            }
            return clothesItems;
        }

    }
    @Builder
    @Getter @Setter
    @AllArgsConstructor
    public static class BottomClothesItem {
        private String name;
        private String brand;
        private String imageUrl;
        private String siteUrl;
        private ClothesCategory clothesCategory;

        public static List<BottomClothesItem> createBottomClothesItems(String[]name,String [] brand, String []imageUrl, String []siteUrl){
            List<BottomClothesItem> clothesItems = new ArrayList<>();
            for(int i = 0; i<clothesItems.size(); i++){
                clothesItems.add(BottomClothesItem.builder().name(name[i]).brand(brand[i]).imageUrl(imageUrl[i]).siteUrl(siteUrl[i]).clothesCategory(ClothesCategory.BOTTOM).build());
            }
            return clothesItems;
        }

    }


}
