package net.daum.service;

import lombok.RequiredArgsConstructor;
import net.daum.dao.UserAddrDAO;
import net.daum.vo.UserAddrVO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAddrServiceImpl implements UserAddrService{

    private final UserAddrDAO userAddrDAO;

    @Override
    public UserAddrVO insertUserAddr(UserAddrVO userAddr) {
        return userAddrDAO.insertUserAddr(userAddr);
    }
}
