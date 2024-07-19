package org.example.simple1.controller;

import lombok.RequiredArgsConstructor;
import org.example.simple1.dto.MemberDto;
import org.example.simple1.entity.Member;
import org.example.simple1.repository.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TestController {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public MemberDto test() {
        MemberDto memberDto = new MemberDto();
        memberDto.setName("hongsss");
        memberDto.setAge(12348);

        memberRepository.save(new Member("member1"));

        return memberDto;

    }
}