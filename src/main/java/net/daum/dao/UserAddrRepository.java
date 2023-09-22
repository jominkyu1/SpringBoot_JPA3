package net.daum.dao;

import net.daum.vo.UserAddrVO;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserAddrRepository extends JpaRepository<UserAddrVO, Integer> {
}
