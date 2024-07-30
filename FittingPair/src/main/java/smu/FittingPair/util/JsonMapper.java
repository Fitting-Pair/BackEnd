package smu.FittingPair.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import smu.FittingPair.dto.UserBodySizeRequestDto;

@Component
@RequiredArgsConstructor
public class JsonMapper {
    @Autowired
    private final ObjectMapper mapper;
    public UserBodySizeRequestDto StringToDto(String json) throws JsonProcessingException {
        return mapper.readValue(json, UserBodySizeRequestDto.class);
    }
}
