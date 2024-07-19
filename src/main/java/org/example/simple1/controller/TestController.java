package org.example.simple1.controller;

import org.example.simple1.entity.Member;
import org.example.simple1.repository.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class TestController {

    private final MemberRepository memberRepository;

    public TestController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @GetMapping("/")
    public Member test() {
        Member m = new Member( "hwayeon");
        memberRepository.save(m);
        return m;
    }
}