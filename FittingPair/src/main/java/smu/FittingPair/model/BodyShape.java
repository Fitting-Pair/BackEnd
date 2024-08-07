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
                    new String[]{"레귤러핏 헨리 티셔츠", "DOODLE HEART HALF T", "워셔블 케이블 반팔 니트", "투톤 오픈 카라 하프 니트", "하프 스티치 반팔 티셔츠"},
                    new String[]{"쿠어", "매종미네", "수아레", "르마드", "파브레가"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"시그니처 와이드 데님 팬츠", "더스티 엠보 워시드 데님 팬츠", "빅 브러쉬 와이드 데님 팬츠", "바이오스톤 워싱 와이드 데님 팬츠", "파라슈트 카고 리벳 데님 팬츠"},
                    new String[]{"DNSR", "쿠어", "무신사 스탠다드", "트릴리온", "트릴리온"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    })
    ),

    MALE_INVERTED_TRIANGLE(
            "역삼각형",
            "역삼각형 체형의 남자는 넓은 어깨와 좁은 허리를 특징으로 하며, 운동을 자주 하는 남성에게 흔히 볼 수 있는 체형입니다. 이 체형은 상체가 발달하여 매우 남성적이고 강인한 인상을 줍니다. 스타일링 시 이 체형의 장점을 살리기 위해서는 상체의 볼륨을 과도하게 강조하지 않는 것이 중요합니다. V넥이나 슬림핏의 상의를 선택하여 근육의 라인을 자연스럽게 드러내는 것이 좋습니다. 하의는 조금 여유 있는 핏을 선택하여 전체적인 실루엣의 균형을 맞추는 것이 좋습니다.","역삼각형 체형을 가진 남성이 스타일링 시 주의해야 할 점은 너무 밝은 색상이나 크고 복잡한 패턴의 상의는 상체를 더욱 부각시켜 비례가 과장될 수 있으므로 피하는 것이 좋습니다. 또한, 너무 꽉 끼는 옷은 오히려 체형의 단점을 부각시킬 수 있으므로 적당한 핏의 옷을 선택하는 것이 중요합니다. 전체적으로 균형 잡힌 실루엣을 유지하면서도, 체형의 장점을 살릴 수 있는 스타일링을 추구해야 합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"레귤러핏 헨리 티셔츠", "DOODLE HEART HALF T", "워셔블 케이블 반팔 니트", "투톤 오픈 카라 하프 니트", "하프 스티치 반팔 티셔츠"},
                    new String[]{"쿠어", "매종미네", "수아레", "르마드", "파브레가"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"시그니처 와이드 데님 팬츠", "더스티 엠보 워시드 데님 팬츠", "빅 브러쉬 와이드 데님 팬츠", "바이오스톤 워싱 와이드 데님 팬츠", "파라슈트 카고 리벳 데님 팬츠"},
                    new String[]{"DNSR", "쿠어", "무신사 스탠다드", "트릴리온", "트릴리온"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    })
    ),
    MALE_OVAL("타원형","원형 체형의 남자는 복부 주위에 볼륨이 있어 전체적으로 원형에 가까운 체형을 가지고 있습니다. 이 체형은 상체 중심으로 무게감이 느껴지며, 비교적 짧은 목과 넓은 허리라인이 특징입니다. 이러한 체형의 남성에게는 실루엣을 길고 슬림하게 보이도록 하는 스타일링이 필요합니다. 세로 줄무늬 패턴의 셔츠나 니트를 선택하여 시각적으로 높이를 더해주고, V넥이나 열린 카라 디자인의 상의를 통해 목선을 길어 보이게 하는 것이 좋습니다. 또한, 상의는 몸에 약간 여유 있는 핏을 선택하여 복부를 자연스럽게 커버할 수 있습니다.\n" +
            "\n" +
            "하의는 스트레이트 핏이나 약간의 테이퍼드 핏을 선택하여 다리 라인을 깔끔하게 보이도록 하며, 상의와 비슷한 색상의 벨트를 사용하여 허리 라인을 정의하는 것이 좋습니다. 하의 색상은 상의보다 약간 어두운 톤을 선택하여 전체적인 비율을 조화롭게 만드는 것이 효과적입니다. 자켓이나 코트를 입을 때는 허리선이 드러나는 디자인보다는 스트레이트하게 떨어지는 스타일을 선택하는 것이 좋습니다.","사각형 체형의 남성이 옷을 선택할 때 주의해야 할 점은 너무 박시하거나 너무 타이트한 옷은 피하는 것이 좋습니다. 박시한 옷은 체형의 단점을 강조할 수 있으며, 너무 타이트한 옷은 불편함을 줄 수 있습니다. 또한 너무 복잡한 패턴이나 큰 로고는 피하고, 심플하고 깔끔한 디자인을 선택하는 것이 전체적인 스타일링을 깔끔하게 만들어 줍니다. 체형의 단점을 커버하고 장점을 강조할 수 있는 스타일링을 추구하는 것이 중요합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"레귤러핏 헨리 티셔츠", "DOODLE HEART HALF T", "워셔블 케이블 반팔 니트", "투톤 오픈 카라 하프 니트", "하프 스티치 반팔 티셔츠"},
                    new String[]{"쿠어", "매종미네", "수아레", "르마드", "파브레가"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"시그니처 와이드 데님 팬츠", "더스티 엠보 워시드 데님 팬츠", "빅 브러쉬 와이드 데님 팬츠", "바이오스톤 워싱 와이드 데님 팬츠", "파라슈트 카고 리벳 데님 팬츠"},
                    new String[]{"DNSR", "쿠어", "무신사 스탠다드", "트릴리온", "트릴리온"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    })
    ),
    MALE_RECTANGLE("원형","원형 체형의 남자는 복부 주위에 볼륨이 있어 전체적으로 원형에 가까운 체형을 가지고 있습니다. 이 체형은 상체 중심으로 무게감이 느껴지며, 비교적 짧은 목과 넓은 허리라인이 특징입니다. 이러한 체형의 남성에게는 실루엣을 길고 슬림하게 보이도록 하는 스타일링이 필요합니다. 세로 줄무늬 패턴의 셔츠나 니트를 선택하여 시각적으로 높이를 더해주고, V넥이나 열린 카라 디자인의 상의를 통해 목선을 길어 보이게 하는 것이 좋습니다. 또한, 상의는 몸에 약간 여유 있는 핏을 선택하여 복부를 자연스럽게 커버할 수 있습니다.","원형 체형의 남성이 스타일링 시 주의해야 할 점은 너무 타이트한 옷은 피하는 것이 중요합니다. 타이트한 옷은 불필요한 부분을 강조하여 비율이 불균형해 보일 수 있습니다. 또한, 큰 패턴이나 밝은 색상의 상의는 상체를 더욱 부각시킬 수 있으므로, 심플하고 단색의 옷을 선택하는 것이 좋습니다. 전체적으로 균형 잡힌 실루엣을 만들어내며, 자신감을 가지고 자신에게 맞는 스타일을 찾는 것이 중요합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"레귤러핏 헨리 티셔츠", "DOODLE HEART HALF T", "워셔블 케이블 반팔 니트", "투톤 오픈 카라 하프 니트", "하프 스티치 반팔 티셔츠"},
                    new String[]{"쿠어", "매종미네", "수아레", "르마드", "파브레가"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"시그니처 와이드 데님 팬츠", "더스티 엠보 워시드 데님 팬츠", "빅 브러쉬 와이드 데님 팬츠", "바이오스톤 워싱 와이드 데님 팬츠", "파라슈트 카고 리벳 데님 팬츠"},
                    new String[]{"DNSR", "쿠어", "무신사 스탠다드", "트릴리온", "트릴리온"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    })
    ),
    MALE_HOURGLASS("모래시계형","사다리꼴 체형의 남자는 상체가 비교적 크고 튼튼한 반면, 허리는 좁고 다리가 강조되는 체형을 가지고 있습니다. 이 체형은 운동을 많이 하는 남성에게서 종종 볼 수 있으며, 상체에 비해 하체가 더 발달해 있어 균형 잡힌 실루엣을 만드는 것이 중요합니다. 스타일링 시 상의는 너무 타이트하지 않으면서도 몸통을 잘 감사는 핏을 선택하여 상체의 근육이 자연스럽게 드러나도록 하는 것이 좋습니다. 라운드 넥보다는 V넥이나 폴로셔츠를 선택하여 목선을 길게 보이게 하고, 상체의 근육을 더욱 돋보이게 합니다.","사다리꼴 체형의 남성이 스타일링 시 주의해야 할 점은 너무 과한 디테일이나 복잡한 패턴의 옷은 피하는 것이 좋습니다. 이러한 옷은 전체적인 실루엣을 무너뜨릴 수 있으며, 단정하고 깔끔한 이미지를 해칠 수 있습니다. 또한, 하체가 더 강조되지 않도록 하의 선택에 주의해야 하며, 상하의 색상 대비를 너무 강하게 주지 않는 것이 좋습니다. 전체적으로 균형 잡힌 실루엣을 쥬이하며, 자신의 체형을 잘 이해하고 그에 맞는 스타일을 찾는 것이 중요합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"레귤러핏 헨리 티셔츠", "DOODLE HEART HALF T", "워셔블 케이블 반팔 니트", "투톤 오픈 카라 하프 니트", "하프 스티치 반팔 티셔츠"},
                    new String[]{"쿠어", "매종미네", "수아레", "르마드", "파브레가"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"시그니처 와이드 데님 팬츠", "더스티 엠보 워시드 데님 팬츠", "빅 브러쉬 와이드 데님 팬츠", "바이오스톤 워싱 와이드 데님 팬츠", "파라슈트 카고 리벳 데님 팬츠"},
                    new String[]{"DNSR", "쿠어", "무신사 스탠다드", "트릴리온", "트릴리온"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4086500",
                            "https://www.musinsa.com/app/goods/3325842",
                            "https://www.musinsa.com/app/goods/3927583",
                            "https://www.musinsa.com/app/goods/3188656",
                            "https://www.musinsa.com/app/goods/3239237"
                    })
    ),

    //여자 체형
    FEMALE_TRIANGLE(
            "삼각형",
            "삼각형 체형을 가진 여성은 엉덩이와 허벅지가 어깨와 가슴보다 넓고 발달된 특징이 있습니다. 상체는 상대적으로 작고 좁은 편이며, 허리는 잘록하게 들어가 상체와 하체의 경계가 뚜렷합니다. 이러한 체형은 상체와 하체의 비율을 맞추고, 하체를 덜 부각시키는 스타일이 어울립니다.",
            "삼각형 체형을 가진 여성은 타이트한 스커트를 피하는 것이 좋습니다. 특히 펜슬 스커트는 엉덩이와 허벅지를 더 강조해 하체의 부각을 더 심하게 만듭니다. 밝은 색의 바지나 스커트 역시 피해야 합니다. 밝은 색은 시선을 끌어 하체를 더 넓어 보이게 하기 때문입니다. 또한, 큰 무늬나 화려한 패턴의 하의는 하체를 더 강조하게 되므로 피하는 것이 좋습니다. 상체를 좁아 보이게 하는 의류도 피해야 합니다. 좁은 어깨선의 상의, 하이넥 상의, 어두운 색의 상의는 상체를 더 작아 보이게 하여 하체와의 비율을 맞추기 어렵게 합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"UNI HERITAGE 반팔티", "punching frill blouse IVORY", "JACQUARD RIBBON BLOUSE (WHITE)", "프론트 포켓 워크 셔츠_화이트", "풋볼 져지 티셔츠_핑크"},
                    new String[]{"뉴발란스", "어반드레스", "시눈", "로맨틱크라운", "어반디타입"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/3966892",
                            "https://www.musinsa.com/app/goods/3154984",
                            "https://www.musinsa.com/app/goods/3829970",
                            "https://www.musinsa.com/app/goods/3183154",
                            "https://www.musinsa.com/app/goods/3901716"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/3966892",
                            "https://www.musinsa.com/app/goods/3154984",
                            "https://www.musinsa.com/app/goods/3829970",
                            "https://www.musinsa.com/app/goods/3183154",
                            "https://www.musinsa.com/app/goods/3901716"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"3 BUTTONS CLUB PANTS_black", "[쿨탠다드] 우먼즈 세미 벌룬 히든 밴딩 슬랙스 [블랙]", "리나 플레어 스커트 블랙", "무아 쿨링 와이드 밴딩팬츠 [블랙]", "WOMEN 쿨링 냉장고 세미 플레어 미디 롱치마 [블랙] 롱스커트 ver."},
                    new String[]{"에프엠9102", "무신사 스탠다드 우먼", "맥키", "무아무아", "콜릿"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/2247837",
                            "https://www.musinsa.com/app/goods/3134728",
                            "https://www.musinsa.com/app/goods/3058718",
                            "https://www.musinsa.com/app/goods/3891625",
                            "https://www.musinsa.com/app/goods/2533425"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/2247837",
                            "https://www.musinsa.com/app/goods/3134728",
                            "https://www.musinsa.com/app/goods/3058718",
                            "https://www.musinsa.com/app/goods/3891625",
                            "https://www.musinsa.com/app/goods/2533425"
                    })),
    FEMALE_INVERTED_TRIANGLE("역삼각형","역삼각형 체형을 가진 여성은 어깨와 가슴이 엉덩이보다 넓고 발달된 특징이 있습니다. 상체가 하체에 비해 상대적으로 크고 넓어 보이며, 허리와 엉덩이는 비교적 작고 좁습니다. 이러한 체형은 상체의 넓이를 줄이고 하체를 부각시키는 스타일이 어울립니다.","역삼각형 체형을 가진 여성은 어깨를 더 넓어 보이게 하는 의류를 피하는 것이 좋습니다. 특히 패드가 들어간 어깨 디자인이나 퍼프 소매는 어깨를 더 강조해 상체의 부각을 더 심하게 만듭니다. 또한, 높은 넥라인의 상의는 시선을 상체로 집중시켜 어깨와 가슴을 더 강조하게 되므로 피하는 것이 좋습니다. 밝은 색이나 화려한 패턴의 상의도 상체를 부각시킬 수 있어 피해야 합니다. 반대로, 타이트한 하의는 하체를 더 작아 보이게 하여 상체와의 비율을 맞추기 어렵게 합니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"Half Patchwork Knitwear MELANGE", "Square Neck Line Crop Long Sleeve Knit BLACK", "Noga Shoulder Cut-out Knit MOCHA", "W CLASSIC LOGO RINGER TEE white", "Collar Slit Knit - 4COL"},
                    new String[]{"어반드레스", "어반드레스", "어반드레스", "마리떼", "어반드레스"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/2751819",
                            "https://www.musinsa.com/app/goods/3599457",
                            "https://www.musinsa.com/app/goods/3599377",
                            "https://www.musinsa.com/app/goods/3103129",
                            "https://www.musinsa.com/app/goods/3901634"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/2751819",
                            "https://www.musinsa.com/app/goods/3599457",
                            "https://www.musinsa.com/app/goods/3599377",
                            "https://www.musinsa.com/app/goods/3103129",
                            "https://www.musinsa.com/app/goods/3901634"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"우먼즈 파라슈트 팬츠 [크림]", "에센셜 코튼 숏츠 [오프 화이트]", "우먼즈 코듀로이 플리츠 미니 스커트 [크림]", "우먼즈 원 턱 와이드 데님 팬츠 [라이트 인디고]", "MAY SHIRRING SKIRT (3colors)"},
                    new String[]{"무신사 스탠다드 우먼", "디스코드사운드", "무신사 스탠다드 우먼", "무신사 스탠다드 우먼", "망고매니플리즈"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/2978125",
                            "https://www.musinsa.com/app/goods/4138260",
                            "https://www.musinsa.com/app/goods/3285423",
                            "https://www.musinsa.com/app/goods/2448883",
                            "https://www.musinsa.com/app/goods/3359598"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/2978125",
                            "https://www.musinsa.com/app/goods/4138260",
                            "https://www.musinsa.com/app/goods/3285423",
                            "https://www.musinsa.com/app/goods/2448883",
                            "https://www.musinsa.com/app/goods/3359598"
                    })
    ),
    FEMALE_OVAL("타원형","타원형 체형을 가진 여성은 허리가 가장 넓고 전체적인 실루엣이 둥글고 부드러운 곡선을 이루는 특징이 있습니다. 허리 라인이 뚜렷하지 않으며, 어깨와 엉덩이는 상대적으로 좁은 편입니다. 이러한 체형은 허리 부분을 감추고 상체와 하체의 비율을 맞추는 스타일이 어울립니다.","어깨와 엉덩이는 상대적으로 좁은 편입니다. 이러한 체형은 허리 부분을 감추고 상체와 하체의 비율을 맞추는 스타일이 어울립니다.\n" +
            "\n" +
            "타원형 체형을 가진 여성은 허리 부분을 강조하는 의류를 피하는 것이 좋습니다. 특히, 타이트한 허리선이나 크롭탑은 허리와 복부를 더 부각시킬 수 있습니다. 또한, 가로 줄무늬의 상의나 밝은 색상의 허리띠는 허리 부분을 강조하여 체형을 더 넓어 보이게 만듭니다. 전체적으로 타이트한 핏의 옷도 체형을 부각시켜 불편할 수 있습니다. 하이넥 상의는 상체를 더 둥글고 짧아 보이게 할 수 있어 피하는 것이 좋습니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"punching frill blouse BLACK", "코튼 레이스 리본 블라우스_Bright White", "레이스 버튼 슬리브리스 블라우스_Pure White", "RIBBON BOW SLEEVELESS BLOUSE SOFT BLUE", "OFF-SHOULDER PINTUCK BLOUSE (BLACK)"},
                    new String[]{"어반드레스", "오로", "오로", "론론", "시눈"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/3154978",
                            "https://www.musinsa.com/app/goods/4181532",
                            "https://www.musinsa.com/app/goods/4101518",
                            "https://www.musinsa.com/app/goods/4167252",
                            "https://www.musinsa.com/app/goods/3264049"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/3154978",
                            "https://www.musinsa.com/app/goods/4181532",
                            "https://www.musinsa.com/app/goods/4101518",
                            "https://www.musinsa.com/app/goods/4167252",
                            "https://www.musinsa.com/app/goods/3264049"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"우먼즈 더블 니트 투 턱 와이드 라운지 스웨트 팬츠 [블랙]", "RD002 화이트 부츠컷 팬츠", "버클 하이웨스트 플레어 스커트 - 딥 차콜", "WOMEN 여름 플레어 주름 레이스 롱스커트 [WHITE] 롱치마 ver.", "핀턱 버뮤다 코튼 팬츠 - 블랙"},
                    new String[]{"무신사 스탠다드 우먼", "람", "엣드맹", "콜릿", "로에일"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/2820939",
                            "https://www.musinsa.com/app/goods/4030852",
                            "https://www.musinsa.com/app/goods/3575163",
                            "https://www.musinsa.com/app/goods/4076883",
                            "https://www.musinsa.com/app/goods/2416640"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/2820939",
                            "https://www.musinsa.com/app/goods/4030852",
                            "https://www.musinsa.com/app/goods/3575163",
                            "https://www.musinsa.com/app/goods/4076883",
                            "https://www.musinsa.com/app/goods/2416640"
                    })
    ),
    FEMALE_RECTANGLE("사각형","사각형 체형을 가진 여성은 어깨, 허리, 엉덩이가 거의 같은 폭을 가지고 있으며, 허리 라인이 뚜렷하지 않은 특징이 있습니다. 전체적으로 일자 형태를 이루며, 곡선이 많이 드러나지 않습니다. 이러한 체형은 허리 라인을 강조하고 곡선을 더해주는 스타일이 어울립니다.","사각형 체형을 가진 여성은 허리 라인이 뚜렷하지 않은 의류를 피하는 것이 좋습니다. 특히, 박시한 핏의 옷이나 스트레이트 라인의 드레스는 체형을 더 평평하게 보이게 합니다. 또한, 허리 부분이 타이트하지 않은 상의나 하의를 피해야 하며, 직선적인 디자인의 옷은 곡선을 부각시키지 못해 체형을 더 단조롭게 만들 수 있습니다. 너무 타이트한 옷 역시 허리의 부재를 강조하여 체형을 부각시킬 수 있습니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"Sopy Collar Short-Sleeve BLACK", "Half Patchwork Knitwear BLACK", "RIBBON SKASHI HALF KNIT BLACK", "빌리즈 오프숄더 니트", "링클 프리 오픈 카라 셔츠_WHITE"},
                    new String[]{"어반드레스", "어반드레스", "로라로라", "트위", "시티브리즈 우먼"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/3155032",
                            "https://www.musinsa.com/app/goods/2751799",
                            "https://www.musinsa.com/app/goods/4002393",
                            "https://www.musinsa.com/app/goods/4203064",
                            "https://www.musinsa.com/app/goods/3934410"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/3155032",
                            "https://www.musinsa.com/app/goods/2751799",
                            "https://www.musinsa.com/app/goods/4002393",
                            "https://www.musinsa.com/app/goods/4203064",
                            "https://www.musinsa.com/app/goods/3934410"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"[FAINA 7147] 커버밴드 슬림 부츠컷 코튼팬츠(블랙)", "WOMEN 기능성 바스락 와이드 카고 슬랙스 팬츠 [IVORY]", "볼륨 트윌 스커트 [IVORY] / WBD1L13504", "와이드 플레어 면팬츠 크림베이지", "베티붑 카고 플리츠 미니 스커트_(2 colors)"},
                    new String[]{"밀리언코르", "콜릿", "제너럴아이디어", "언노운 플라넷", "얼킨 캔버스"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/2339572",
                            "https://www.musinsa.com/app/goods/3047066",
                            "https://www.musinsa.com/app/goods/3956091",
                            "https://www.musinsa.com/app/goods/3878495",
                            "https://www.musinsa.com/app/goods/3753861"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/2339572",
                            "https://www.musinsa.com/app/goods/3047066",
                            "https://www.musinsa.com/app/goods/3956091",
                            "https://www.musinsa.com/app/goods/3878495",
                            "https://www.musinsa.com/app/goods/3753861"
                    })
    ),
    FEMALE_HOURGLASS("모래시계형","모래시계 체형을 가진 여성은 어깨와 엉덩이가 비슷한 폭을 가지며, 잘록한 허리로 인해 뚜렷한 곡선을 이루는 특징이 있습니다. 상체와 하체의 비율이 균형 잡혀 있으며, 허리선이 잘 드러나 전체적으로 여성스러운 실루엣을 자랑합니다. 이러한 체형은 허리 라인을 강조하고 곡선을 살리는 스타일이 어울립니다.","모래시계 체형을 가진 여성은 너무 헐렁하고 박시한 옷을 피하는 것이 좋습니다. 이러한 옷은 허리선을 감추고 전체적인 곡선을 덜 부각시켜 체형의 장점을 살리지 못합니다. 또한, 일자형 드레스나 스트레이트 핏의 바지는 허리 라인을 숨겨 체형을 평평하게 보이게 할 수 있습니다. 너무 과한 장식이나 디테일이 많은 옷도 피해야 하며, 특히 상체나 하체에 불필요한 부피를 더해주는 디자인은 체형의 균형을 깨트릴 수 있습니다.",
            TopClothesItem.createClothesItems(
                    new String[]{"네티 랩 썸머니트", "Becky Bamboo Short-Sleeve Knit - 5COL", "슬림핏 레귤러 긴팔 티셔츠 [화이트]", "언발란스 크롭 레이어드 나시 티셔츠 세트", "Geek Half Zip-Up Blue Gray"},
                    new String[]{"트위", "어반드레스", "무아무아", "썸플레이스", "스컬프터"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/4118941",
                            "https://www.musinsa.com/app/goods/2552603",
                            "https://www.musinsa.com/app/goods/3919866",
                            "https://www.musinsa.com/app/goods/3008875",
                            "https://www.musinsa.com/app/goods/4032863"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/4118941",
                            "https://www.musinsa.com/app/goods/3324515",
                            "https://www.musinsa.com/app/goods/3919866",
                            "https://www.musinsa.com/app/goods/3008875",
                            "https://www.musinsa.com/app/goods/4032863"
                    }),
            BottomClothesItem.createBottomClothesItems(
                    new String[]{"우먼즈 와이드 카고 팬츠 [베이지]", "[SHORTS] Hill Black", "Greta Pocket Wrap Skirt CHARCOAL", "Stacey pleats Skirt CHARCOAL", "베이직 코튼 팬츠 [아이보리]"},
                    new String[]{"무신사 스탠다드 우먼", "판도라핏", "어반드레스", "어반드레스", "무아무아"},
                    new String[]{
                            "https://www.musinsa.com/app/goods/2818152",
                            "https://www.musinsa.com/app/goods/2552603",
                            "https://www.musinsa.com/app/goods/3511194",
                            "https://www.musinsa.com/app/goods/3109158",
                            "https://www.musinsa.com/app/goods/4040148"
                    },
                    new String[]{
                            "https://www.musinsa.com/app/goods/2818152",
                            "https://www.musinsa.com/app/goods/2552603",
                            "https://www.musinsa.com/app/goods/3511194",
                            "https://www.musinsa.com/app/goods/3109158",
                            "https://www.musinsa.com/app/goods/4040148"
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
            for(int i = 0; i<5; i++){
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
            for(int i = 0; i<5; i++){
                clothesItems.add(BottomClothesItem.builder().name(name[i]).brand(brand[i]).imageUrl(imageUrl[i]).siteUrl(siteUrl[i]).clothesCategory(ClothesCategory.BOTTOM).build());
            }
            return clothesItems;
        }

    }


}


