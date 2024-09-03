package smu.FittingPair.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import smu.FittingPair.config.response.BaseResponse;
import smu.FittingPair.dto.UserBodySizeRequestDto;
import smu.FittingPair.dto.UserObjRequestDto;
import smu.FittingPair.service.UserBodySizeService;
import smu.FittingPair.service.UserDataSendService;
import smu.FittingPair.service.UserImgService;
import smu.FittingPair.service.UserResultService;
import smu.FittingPair.util.JsonMapper;

import java.io.IOException;
import java.util.Map;


@RestController
@RequiredArgsConstructor
public class JsonDataController {
    private final UserBodySizeService userBodySizeService;
    private final UserImgService userImgService;
    private final UserResultService userResultService;
    private final JsonMapper jsonMapper;
    //json을 받습니다.
    @PostMapping("/get/json")
    public BaseResponse<?> getUserJsonData(@RequestPart("json") String json,@RequestPart("file") MultipartFile file) throws JsonProcessingException, IOException {
        userImgService.objFileUpload(jsonMapper.StringToDto(json).getUserId(),file);
        userResultService.makeResult(userBodySizeService.putBodySize(jsonMapper.StringToDto(json)));
        return BaseResponse.ok();
    }
}
