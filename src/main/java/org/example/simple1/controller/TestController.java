package org.example.simple1.controller;

import org.example.simple1.dto.MemberDto;
import org.example.simple1.entity.Member;
import org.example.simple1.repository.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

    private MemberRepository memberRepository;

    @GetMapping("/")
    public Member test() {
        return memberRepository.save(new Member(1L, "hwayeon"));
    }
}