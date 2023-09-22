package net.daum.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Setter
@Getter
@ToString
@Entity //JPA를 다루는 엔티티빈
@SequenceGenerator(
        name = "bno_seq2_gename", //시퀀스 제네레이터 이름
        sequenceName = "bno_seq2", //시퀀스이름
        initialValue = 1,
        allocationSize = 1
)
@Table(name="tbl_useraddr2")
public class UserAddrVO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bno_seq2_gename")
    private int userno;
    private String username;
    private String useraddr;

    @CreationTimestamp
    private Timestamp regdate;
}
