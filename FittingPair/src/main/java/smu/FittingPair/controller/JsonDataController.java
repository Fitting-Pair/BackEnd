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

import java.util.Map;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class JsonDataController {
    private final UserBodySizeService userBodySizeService;
    //obj file를 FAST-API에 보내줍니다.
    @PostMapping("/upload/obj")
    public BaseResponse<?> uploadObjFile(@RequestParam("id") Long id, @RequestParam("multipartFile")MultipartFile multipartFile) {
        UserObjRequestDto userObjRequestDto = new UserObjRequestDto(id,multipartFile);
        userBodySizeService.sendObj(userObjRequestDto);
        return BaseResponse.ok();
    }
    //json을 받습니다.
    @PostMapping("/get/json")
    public BaseResponse<?> uploadJsonData(@RequestBody String json){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            UserBodySizeRequestDto dto = objectMapper.readValue(json, UserBodySizeRequestDto.class);
            userBodySizeService.putBodySize(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return BaseResponse.ok();
    }


}
