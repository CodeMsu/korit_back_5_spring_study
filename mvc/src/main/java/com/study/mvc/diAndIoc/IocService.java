package com.study.mvc.diAndIoc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
//@RequiredArgsConstructor // 필수생성자
public class IocService {

@Autowired
    private  IocRepository iocRepository;

    public String getJson() throws JsonProcessingException { // Json형태로 리턴해줌
        Map<String, String> nameMap = iocRepository.convertNameMap();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(nameMap);
    }
}
