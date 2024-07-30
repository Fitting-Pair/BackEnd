package smu.FittingPair.dto;

import lombok.Data;
import smu.FittingPair.model.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class RequestUserBodySizeDto {
    private Long chest_size;
    private Long hip_size;
    private Long shoulder_size;
    private Long waist_size;
    private Long height_size;

}