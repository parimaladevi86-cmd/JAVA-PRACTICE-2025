package com.librarymanagement.repository;

import java.util.HashMap;
import java.util.Map;

import com.librarymanagement.model.Member;

public class MemberRepository {
	
	 

		private Map<Integer, Member> members = new HashMap<>();

		 

		public void addMember(Member m) {
			members.put(m.getMemberId(), m);
		}

		public Member findMemberById(int memberId) {
			 
			 return members.get(memberId);
		}

		public Map<Integer, Member> getAllMembers(){
			return members;
		}

		public void removeMember(int memberId)
		{
			members.remove(memberId);
			
		}

}
