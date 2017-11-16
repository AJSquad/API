package com.Adil.Controller;

import com.Adil.Entity.Member;
import com.Adil.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(method = RequestMethod.GET )
    public Collection<Member> getAllMembers(){
        return memberService.getAllMembers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Member getMemberById(@PathVariable("id") int id){
        return memberService.getMemberById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMemberById(@PathVariable("id")int id){
        memberService.removeMemberById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateMemberById(@RequestBody Member member){
        memberService.updateMember(member);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertMemberById(@RequestBody Member member){
        memberService.insertMember(member);
    }
}

