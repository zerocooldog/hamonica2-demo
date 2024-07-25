package kr.co.pionnet.hamonica2.ha.members.models;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link kr.co.pionnet.hamonica2.ha.members.repository.master.entity.MemberEntity}
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Serializable {
    @Size(max = 14)
    String memberId;
    @NotNull
    @Size(max = 40)
    String email;
    @NotNull
    @Size(max = 20)
    String userName;
    @Size(max = 20)
    String nickName;
    @NotNull
    @Size(max = 100)
    String password;
    @Size(max = 100)
    String description;
    @Size(max = 20)
    String companyName;
    @Size(max = 8)
    String roleId;
    @Size(max = 3)
    String cellNo1;
    @Size(max = 10)
    String cellNo2;
    @NotNull
    Character approvalYn;
    @NotNull
    Character lockYn;
    @NotNull
    Character expireYn;
    @NotNull
    Character useYn;
    @Size(max = 9)
    String countryCode;
    @Size(max = 10)
    String serverGroupId;
    Instant accountStartDatetime;
    Instant accountEndDatetime;
}