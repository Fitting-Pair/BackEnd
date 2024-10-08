package smu.FittingPair.service;


import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import smu.FittingPair.dto.UserImgResponseDto;
import smu.FittingPair.dto.UserObjRequestDto;
import smu.FittingPair.model.UserBodyType;
import smu.FittingPair.repository.BodySizeRepository;
import smu.FittingPair.repository.UserBodyTypeRepository;
import smu.FittingPair.repository.UserImgRepository;
import smu.FittingPair.repository.UsersRepository;

import java.io.IOException;
import java.util.Objects;


@RequiredArgsConstructor
@Service
public class UserDataSendService {
    private final RestTemplate restTemplate;
    private final String SERVER_ADDRESS = "http://35.194.210.139:8000";

    //obj+userId to python server
    @Async
    public void sendImg(Long imgId, byte [] fileBytes,String name){
        //헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.MULTIPART_FORM_DATA);
        //multipart 설정
        MultipartBodyBuilder bodyBuilder = new MultipartBodyBuilder();
        bodyBuilder.part("userId",imgId);
        bodyBuilder.part("file", convert(fileBytes,name));
        //bodyBuilder.part("file",convert(userObjRequestDto.getMultipartFile()));
        //request body
        MultiValueMap<String, HttpEntity<?>> multipartBody = bodyBuilder.build();
        //mutlipart body
        HttpEntity<MultiValueMap<String, HttpEntity<?>>> requestEntity = new HttpEntity<>(multipartBody,headers);
        //보내기
        ResponseEntity<String> response = restTemplate.postForEntity(SERVER_ADDRESS + "/process",requestEntity,String.class);
    }
    //multipartfile -> resource로 변환해 파일을 보냄
    private Resource convert(byte [] fileBytes,String name) {
        return new ByteArrayResource(fileBytes) {
            @Override
            public String getFilename() {
                return name;
            }
        };
    }
//    private Resource convert(MultipartFile file) {
//        try {
//            return new ByteArrayResource(file.getBytes()) {
//                @Override
//                public String getFilename() {
//                    return file.getOriginalFilename();
//                }
//            };
//        } catch (IOException e) {
//            throw new RuntimeException("Failed to convert file", e);
//        }
//    }

}
