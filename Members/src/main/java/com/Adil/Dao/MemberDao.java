package com.Adil.Dao;
	import com.Adil.Entity.Member;
	import org.springframework.stereotype.Repository;

	import java.util.Collection;
	import java.util.HashMap;
	import java.util.Map;

	@Repository
	public class MemberDao {

	    private static Map<Integer, Member> members;

	    static {

	        members = new HashMap<Integer, Member>(){

	            {
	                put(1, new Member(1, "Adil", "Rahman", 18, "Apprentice"));
	                put(2, new Member(2, "Joshua", "Kennedy", 18, "Apprentice"));
	            }
	        };
	    }


	    public Collection<Member> getAllMembers(){
	        return this.members.values();

	    }

	    public Member getMemberById(int id){
	        return this.members.get(id);

	    }
	    public void removesMemberById(int id) {
	        this.members.remove(id);

	    }

	    public void updateMember(Member member) {

	        Member m = members.get(member.getId());
	        m.setName(member.getName());
	        m.setSurname(member.getSurname());
	        m.setAge(member.getAge());
	        m.setJobrole(member.getJobrole());

	        //members.put(member.getId(), member);
	    }

	    public void insertMemberToDb(Member member) {
	        this.members.put(member.getId(), member);
	    }

	}
