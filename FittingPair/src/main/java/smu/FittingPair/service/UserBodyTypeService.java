package smu.FittingPair.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import smu.FittingPair.dto.UserBodySizeRequestDto;
import smu.FittingPair.model.BodyShape;
import smu.FittingPair.model.UserBodyType;
import smu.FittingPair.model.Users;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;

@Service
@RequiredArgsConstructor
public class UserBodyTypeService {
    private final UserBodyTypeRepository userBodyTypeRepository;
    private final UserImgRepository userImgRepository;
    private final AuthService authService;

    public UserBodyType decideMaleBodyType(UserBodySizeRequestDto.UserSize bodySizeRequestDto, Users users){
        double shoulder = bodySizeRequestDto.getShoulderSize();
        double hip = bodySizeRequestDto.getHipSize();
        double waist = bodySizeRequestDto.getWaistSize();

        double shoulderToWaistRatio = shoulder / waist;
        double shoulderToHipRatio = shoulder / hip;
        double waistToHipRatio = waist / hip;

        BodyShape bodyShape = getMaleBodyShape(shoulder, hip, waist, shoulderToWaistRatio, shoulderToHipRatio, waistToHipRatio);
        return UserBodyType.builder()
                .bodyShape(bodyShape).users(users).build();
    }

    private BodyShape getMaleBodyShape(double shoulder, double hip, double waist, double shoulderToWaistRatio, double shoulderToHipRatio, double waistToHipRatio) {
        // 남성 체형 판별
        if (hip > shoulder && hip / shoulder > 1.258) {
            return BodyShape.MALE_TRIANGLE;
        } else if (shoulderToWaistRatio >= 1.8 && shoulderToWaistRatio <= 2.0 && shoulderToHipRatio >= 1.8 && shoulderToHipRatio <= 2.0) {
            return BodyShape.MALE_INVERTED_TRIANGLE;
        } else if (waistToHipRatio >= 1.2 && waistToHipRatio <= 1.5 && waist > shoulder) {
            return BodyShape.MALE_OVAL;
        } else if (shoulderToWaistRatio >= 0.9 && shoulderToWaistRatio <= 1.0 && shoulderToHipRatio >= 0.9 && shoulderToHipRatio <= 1.0) {
            return BodyShape.MALE_RECTANGLE;
        } else if (shoulderToWaistRatio < 1.0 && shoulderToHipRatio < 1.0) {
            return BodyShape.MALE_TRAPEZOID;
        } else {
            // 가장 가까운 체형을 결정
            return getClosestMaleBodyShape(shoulderToWaistRatio, shoulderToHipRatio, waistToHipRatio);
        }
    }

    private BodyShape getClosestMaleBodyShape(double shoulderToWaistRatio, double shoulderToHipRatio, double waistToHipRatio) {
        BodyShape closestShape = null;
        double closestDifference = Double.MAX_VALUE;

        // 남성 체형 비율
        double[][] maleRatios = {
                {1.0, 0.903, 1.258}, // MALE_TRIANGLE
                {1.0, 0.571, 0.592}, // MALE_INVERTED_TRIANGLE
                {1.0, 1.227, 0.932}, // MALE_OVAL
                {1.0, 0.744, 0.846}, // MALE_RECTANGLE
                {1.0, 0.705, 0.773}  // MALE_HOURGLASS
        };

        BodyShape[] maleShapes = {
                BodyShape.MALE_TRIANGLE,
                BodyShape.MALE_INVERTED_TRIANGLE,
                BodyShape.MALE_OVAL,
                BodyShape.MALE_RECTANGLE,
                BodyShape.MALE_TRAPEZOID
        };

        for (int i = 0; i < maleRatios.length; i++) {
            double[] ratios = maleRatios[i];
            double difference = Math.abs(ratios[0] - shoulderToWaistRatio) + Math.abs(ratios[1] - shoulderToHipRatio) + Math.abs(ratios[2] - waistToHipRatio);
            if (difference < closestDifference) {
                closestDifference = difference;
                closestShape = maleShapes[i];
            }
        }

        return closestShape;
    }

    public UserBodyType decideFemaleBodyType(UserBodySizeRequestDto.UserSize bodySizeRequestDto,Users users){
        double waist = bodySizeRequestDto.getWaistSize();
        double hip = bodySizeRequestDto.getHipSize();
        double shoulder = bodySizeRequestDto.getShoulderSize();

        double shoulderToWaistRatio = shoulder / waist;
        double shoulderToHipRatio = shoulder / hip;
        double waistToHipRatio = waist / hip;

        BodyShape bodyShape = getFemaleBodyShape(waist, hip, shoulder, shoulderToWaistRatio, shoulderToHipRatio, waistToHipRatio);
        return UserBodyType.builder()
                .bodyShape(bodyShape).users(users).build();
    }

    private BodyShape getFemaleBodyShape(double waist, double hip, double shoulder, double shoulderToWaistRatio, double shoulderToHipRatio, double waistToHipRatio) {
        // 여성 체형 판별
        if (hip > shoulder && hip / shoulder > 1.258) {
            return BodyShape.FEMALE_TRIANGLE;
        } else if (shoulderToWaistRatio >= 1.8 && shoulderToWaistRatio <= 2.0 && shoulderToHipRatio >= 1.8 && shoulderToHipRatio <= 2.0) {
            return BodyShape.FEMALE_INVERTED_TRIANGLE;
        } else if (waistToHipRatio >= 1.2 && waistToHipRatio <= 1.5 && waist > shoulder) {
            return BodyShape.FEMALE_OVAL;
        } else if (shoulderToWaistRatio >= 0.9 && shoulderToWaistRatio <= 1.0 && shoulderToHipRatio >= 0.9 && shoulderToHipRatio <= 1.0) {
            return BodyShape.FEMALE_RECTANGLE;
        } else if (shoulderToWaistRatio < 1.0 && shoulderToHipRatio < 1.0) {
            return BodyShape.FEMALE_HOURGLASS;
        } else {
            // 가장 가까운 체형을 결정
            return getClosestFemaleBodyShape(shoulderToWaistRatio, shoulderToHipRatio, waistToHipRatio);
        }
    }

    private BodyShape getClosestFemaleBodyShape(double shoulderToWaistRatio, double shoulderToHipRatio, double waistToHipRatio) {
        BodyShape closestShape = null;
        double closestDifference = Double.MAX_VALUE;

        // 여성 체형 비율
        double[][] femaleRatios = {
                {1.0, 0.645, 1.258}, // FEMALE_TRIANGLE
                {1.0, 0.512, 0.756}, // FEMALE_INVERTED_TRIANGLE
                {1.0, 1.094, 1.156}, // FEMALE_OVAL
                {1.0, 1.067, 1.033}, // FEMALE_RECTANGLE
                {1.0, 0.463, 0.805}  // FEMALE_HOURGLASS
        };

        BodyShape[] femaleShapes = {
                BodyShape.FEMALE_TRIANGLE,
                BodyShape.FEMALE_INVERTED_TRIANGLE,
                BodyShape.FEMALE_OVAL,
                BodyShape.FEMALE_RECTANGLE,
                BodyShape.FEMALE_HOURGLASS
        };

        for (int i = 0; i < femaleRatios.length; i++) {
            double[] ratios = femaleRatios[i];
            double difference = Math.abs(ratios[0] - shoulderToWaistRatio) + Math.abs(ratios[1] - shoulderToHipRatio) + Math.abs(ratios[2] - waistToHipRatio);
            if (difference < closestDifference) {
                closestDifference = difference;
                closestShape = femaleShapes[i];
            }
        }

        return closestShape;
    }
}
