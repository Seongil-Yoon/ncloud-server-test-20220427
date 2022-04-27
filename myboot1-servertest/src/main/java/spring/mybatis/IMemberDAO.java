package spring.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper // 마이바티스 sql실행(id, resulttype, parameter타입)
@Repository("mybatisDao")
public interface IMemberDAO {

	// 저장
	public int insertmember(MemberDTO dto);

	// {session.insert("insertmember",dto)}
	// 수정
	public int updatemember(MemberDTO dto);

	// 삭제
	public int deletemember(String id);

	// 조회
	public MemberDTO member(String id);

	public List<MemberDTO> memberlist();

	public List<MemberDTO> paginglist(int[] page);

	public List<String> addressSearch(String[] address);

}
