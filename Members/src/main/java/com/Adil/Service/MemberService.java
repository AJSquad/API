package com.Adil.Service;

import com.Adil.Dao.MemberDao;
import com.Adil.Entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MemberService {

    @Autowired
    private MemberDao memberDao;

    public Collection<Member> getAllMembers() {
        return this.memberDao.getAllMembers();
    }

    public Member getMemberById(int id) {
        return this.memberDao.getMemberById(id);
    }

    public void removeMemberById(int id) {
        this.memberDao.removesMemberById(id);
    }

    public void updateMember(Member member) {
        this.memberDao.updateMember(member);
    }

    public void insertMember(Member member) {
       this.memberDao.insertMemberToDb(member);
    }

}

