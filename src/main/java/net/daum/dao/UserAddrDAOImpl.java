package net.daum.dao;

import lombok.RequiredArgsConstructor;
import net.daum.vo.UserAddrVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserAddrDAOImpl implements UserAddrDAO{

    private final SqlSession sqlSession; //MyBatis 의존성
    private final UserAddrRepository userAddrRepository; //JPA 의존성

    @Override
    public UserAddrVO insertUserAddr(UserAddrVO userAddr) {
        //MyBatis
        //sqlSession.insert("useraddr_in", userAddr);
        //JPA
        return userAddrRepository.save(userAddr);
    }
}
