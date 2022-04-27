package spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("mybatisService")
public class MemberServiceImpl implements IMemberService {

	@Autowired
	@Qualifier("mybatisDao")
	IMemberDAO dao;

//	public void setDao(MemberDAO dao) {
//		this.dao = dao;
//	}

	@Override
	public int insertMember(MemberDTO dto) {
		return dao.insertmember(dto);
	}

	@Override
	public int updateMember(MemberDTO dto) {
		return dao.updatemember(dto);
	}

	@Override
	public int deleteMember(String id) {
		return dao.deletemember(id);
	}

	@Override
	public MemberDTO member(String id) {
		return dao.member(id);
	}

	@Override
	public List<MemberDTO> memberList() {
		return dao.memberlist();
	}

	@Override
	public List<MemberDTO> memberList(int page) {
		int[] limit = new int[2];
		limit[0] = (page - 1) * 5;
		limit[1] = 5;
		return dao.paginglist(limit);
	}

	@Override
	public List<String> memberList(String[] address) {
		return dao.addressSearch(address);
	}

}
