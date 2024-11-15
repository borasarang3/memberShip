package com.example.membership.service;

import com.example.membership.dto.MemberShipDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class MemberShipServiceTest {

    @Autowired
    MemberShipService memberShipService;

    @Test
    public void signupTest() {
        //회원가입을 위해 필요한 dto
        //아이디 : 자동증감
        //이메일 : sin@a.a
        //이름 : 신짱구
        // 비밀번호 : 1234
        // 주소 : 경남 사이타마현

        MemberShipDTO memberShipDTO =
                MemberShipDTO.builder()
                        .email("sinA@a.a")
                        .name("신짱아")
                        .password("1234")
                        .address("경남 사이타마현")
                        .build();

       try {
           MemberShipDTO memberShipDTO1 =
                   memberShipService.saveMember(memberShipDTO);

           log.info(memberShipDTO1);
       } catch (IllegalStateException e) {
           log.info("zzzzzzz");
           log.info("zzzzzzz");
           log.info("zzzzzzz");
           log.info("zzzzzzz");
           log.info("zzzzzzz");
           log.info("zzzzzzz");
           e.getMessage();
           e.getMessage();
           e.getMessage();
           e.getMessage();
       }

    }

}