package spring.mybatis;

import java.util.List;

public interface IMemberService {
	public int insertMember(MemberDTO dto);

	public int updateMember(MemberDTO dto);

	public int deleteMember(String id);

	// select
	public List<MemberDTO> memberList();

	public MemberDTO member(String id);

	public List<MemberDTO> memberList(int page);

	public List<String> memberList(String[] address);
}
