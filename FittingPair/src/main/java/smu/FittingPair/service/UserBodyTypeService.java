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

        BodyShape bodyShape = getMaleBodyShape(shoulderToWaistRatio, shoulderToHipRatio, waistToHipRatio);
        return UserBodyType.builder()
                .bodyShape(bodyShape).users(users).build();
    }

    private BodyShape getMaleBodyShape(double shoulderToWaistRatio, double shoulderToHipRatio, double waistToHipRatio) {
        // 남성 체형 판별
        if (shoulderToWaistRatio < 0.9 && shoulderToHipRatio < 0.9 && waistToHipRatio > 0.9) {
            return BodyShape.MALE_TRIANGLE;
        } else if (shoulderToWaistRatio >= 1.5 && shoulderToWaistRatio <= 2.0 && shoulderToHipRatio >= 1.1 && shoulderToHipRatio <= 1.5) {
            return BodyShape.MALE_INVERTED_TRIANGLE;
        } else if (waistToHipRatio >= 1.0 && waistToHipRatio <= 1.2 && shoulderToWaistRatio <= 1.2) {
            return BodyShape.MALE_OVAL;
        } else if (shoulderToWaistRatio >= 0.9 && shoulderToWaistRatio <= 1.1 && shoulderToHipRatio >= 0.9 && shoulderToHipRatio <= 1.1) {
            return BodyShape.MALE_RECTANGLE;
        } else if (shoulderToWaistRatio > 1.1 && shoulderToHipRatio > 1.0 && waistToHipRatio < 1.0) {
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
                {0.9, 0.9, 1.0},  // MALE_TRIANGLE
                {1.8, 1.5, 0.9},  // MALE_INVERTED_TRIANGLE
                {1.0, 1.0, 1.1},  // MALE_OVAL
                {1.0, 1.0, 1.0},  // MALE_RECTANGLE
                {1.1, 1.0, 0.9}   // MALE_TRAPEZOID
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

    public UserBodyType decideFemaleBodyType(UserBodySizeRequestDto.UserSize bodySizeRequestDto, Users users){
        double waist = bodySizeRequestDto.getWaistSize();
        double hip = bodySizeRequestDto.getHipSize();
        double shoulder = bodySizeRequestDto.getShoulderSize();

        double shoulderToWaistRatio = shoulder / waist;
        double shoulderToHipRatio = shoulder / hip;
        double waistToHipRatio = waist / hip;

        BodyShape bodyShape = getFemaleBodyShape(shoulderToWaistRatio, shoulderToHipRatio, waistToHipRatio);
        return UserBodyType.builder()
                .bodyShape(bodyShape).users(users).build();
    }

    private BodyShape getFemaleBodyShape(double shoulderToWaistRatio, double shoulderToHipRatio, double waistToHipRatio) {
        // 여성 체형 판별
        if (shoulderToWaistRatio < 0.7 && shoulderToHipRatio < 0.7 && waistToHipRatio > 0.8) {
            return BodyShape.FEMALE_TRIANGLE;
        } else if (shoulderToWaistRatio >= 1.5 && shoulderToHipRatio >= 1.5 && waistToHipRatio < 0.8) {
            return BodyShape.FEMALE_INVERTED_TRIANGLE;
        } else if (waistToHipRatio >= 0.8 && waistToHipRatio <= 1.2 && shoulderToWaistRatio < 0.8) {
            return BodyShape.FEMALE_OVAL;
        } else if (shoulderToWaistRatio >= 0.8 && shoulderToWaistRatio <= 1.0 && shoulderToHipRatio >= 0.8 && shoulderToHipRatio <= 1.0) {
            return BodyShape.FEMALE_RECTANGLE;
        } else if (shoulderToWaistRatio > 1.0 && shoulderToHipRatio > 1.0 && waistToHipRatio < 1.0) {
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
                {0.7, 0.7, 1.0},  // FEMALE_TRIANGLE
                {1.5, 1.5, 0.7},  // FEMALE_INVERTED_TRIANGLE
                {0.8, 0.8, 1.1},  // FEMALE_OVAL
                {0.9, 0.9, 1.0},  // FEMALE_RECTANGLE
                {1.0, 1.0, 0.8}   // FEMALE_HOURGLASS
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

