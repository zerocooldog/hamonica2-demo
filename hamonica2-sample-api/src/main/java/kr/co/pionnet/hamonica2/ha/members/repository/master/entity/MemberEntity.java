package kr.co.pionnet.hamonica2.ha.members.repository.master.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import kr.co.pionnet.hamonica2.zconfiguration.jpa.entity.RegisterModifierEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "member")
public class MemberEntity  extends RegisterModifierEntity {

    @Id
    @Size(max = 14)
    @Comment("회원아이디")
    @Column(name = "member_id", nullable = false, length = 14)
    private String memberId;

    @Size(max = 40)
    @NotNull
    @Comment("이메일")
    @Column(name = "email", nullable = false, length = 40)
    private String email;

    @Size(max = 20)
    @NotNull
    @Comment("사용자명")
    @Column(name = "user_name", nullable = false, length = 20)
    private String userName;

    @Size(max = 20)
    @Comment("사용자별명")
    @Column(name = "nick_name", length = 20)
    private String nickName;

    @Size(max = 100)
    @NotNull
    @Comment("비밀번호")
    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @Size(max = 100)
    @Comment("설명")
    @Column(name = "description", length = 100)
    private String description;

    @Size(max = 20)
    @Comment("회사명")
    @Column(name = "company_name", length = 20)
    private String companyName;

    @Size(max = 8)
    @Comment("역할아이디")
    @Column(name = "role_id", length = 8)
    private String roleId;

    @Size(max = 3)
    @Comment("핸드폰번호1")
    @Column(name = "cell_no1", length = 3)
    private String cellNo1;

    @Size(max = 10)
    @Comment("핸드폰번호2")
    @Column(name = "cell_no2", length = 10)
    private String cellNo2;

    @NotNull
    @Comment("승인여부")
    @ColumnDefault("'N'")
    @Column(name = "approval_yn", nullable = false)
    private Character approvalYn;

    @NotNull
    @Comment("잠김여부")
    @ColumnDefault("'N'")
    @Column(name = "lock_yn", nullable = false)
    private Character lockYn;

    @NotNull
    @Comment("만료여부")
    @ColumnDefault("'N'")
    @Column(name = "expire_yn", nullable = false)
    private Character expireYn;

    @NotNull
    @Comment("사용여부")
    @ColumnDefault("'Y'")
    @Column(name = "use_yn", nullable = false)
    private Character useYn;

    @Size(max = 9)
    @Comment("국가코드")
    @Column(name = "country_code", length = 9)
    private String countryCode;

    @Size(max = 10)
    @Comment("서버 그룹")
    @Column(name = "server_group_id", length = 10)
    private String serverGroupId;

    @Comment("계정 시작 일시")
    @Column(name = "account_start_datetime")
    private Instant accountStartDatetime;

    @Comment("계정 종료 일시")
    @Column(name = "account_end_datetime")
    private Instant accountEndDatetime;

}