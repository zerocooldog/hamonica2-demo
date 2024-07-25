package kr.co.pionnet.hamonica2.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kr.co.pionnet.hamonica2.constant.RoleID;
import kr.co.pionnet.hamonica2.ha.members.models.Member;
import kr.co.pionnet.hamonica2.shared.constant.Const;
import kr.co.pionnet.hamonica2.shared.system.models.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;


import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 로그인된 사용자 객체. 로그인 된 사용자 정보를 설정 한다.
 *
 * @since 2019.05.22 03:16
 * @author 장진철(zerocooldog@nadoosoft.com)
 *
 *         <PRE>
 * -----------------------------------------------------------
 * ※ 개정 이력
 * yyyy.MM.dd hh:mm - 이름    : 이력
 * -----------------------------------------------------------
 * 2019.05.22 03:16 - 장진철 : 최초 작성
 *         </PRE>
 */
@Slf4j
@ToString
public class UserDetails extends kr.co.pionnet.butterfly.security.auth.BaseUserDetails {

    private static final long serialVersionUID = 1L;

    private List<Role> userAuthorities;

    /** 사용자 명(이메일) 스프링 시큐리티는 아이디를 username으로 지칭.*/
    private String userName;

    /** 비밀번호 */
    private String password;

    /** 로그인 여부*/
    private @Getter boolean isLogin;

    /** 사용자 아이디*/
    private @Getter String id;

    /** 잠김 여부 */
    private boolean locked;

    /** 계정 만료 여부 */
    private boolean expired;

    /** 신규 회원 계정 승인 여부 */
    private boolean approved;

    /** 계정 사용 여부 */
    private boolean enabled;

    /** 어플리케이션 아이디*/
    private @Getter List<?> userApplications;

    public UserDetails(Member user) {
        setUser(user);
    }

    private @Getter String name;

    public void setUser(Member user) {
        // 값이 들어오지 않으면 false 처리 한다.
        if (user == null) {
            this.isLogin = false;
            return;
        } else {
            this.isLogin = true;
            /* 회원 또는, 사용자 정보를 UserDetails 필드에 설정한다. */
        }

//        this.id = user.getUserId();
//        this.userName = user.getEmail();
//        this.name = (UtilText.isBlank(user.getNickName()) ? user.getUserName() : user.getNickName());
//        this.password = user.getPassword();
//        this.userAuthorities = user.getRoles();
//        this.userApplications = user.getUserApplications();
//        this.locked = Const.BOOLEAN_TRUE.equals(user.getLockYn());
//        this.expired = Const.BOOLEAN_TRUE.equals(user.getExpireYn());
//        this.approved = Const.BOOLEAN_TRUE.equals(user.getApprovalYn());
//        this.enabled = Const.BOOLEAN_TRUE.equals(user.getUseYn());
    }

    public List<Role> getUserAuthorities() {
        return userAuthorities;
    }

    public List<String> getRoleIds() {
        List<String> roles = new ArrayList<>();
        List<Role> baseRole  = getUserAuthorities();
        if(baseRole != null) {

            for (Role role : baseRole) {
                roles.add(role.getRoleId());
            }
        }

        return roles;
    }

    public boolean isRole(String roleId) {
        return getRoleIds().contains(roleId);
    }

    /**
     * 최고 관리자 여부
     *
     * @return boolean
     */
    public boolean isSuperAdmin() {
        return getUserAuthorities().stream().anyMatch((r) ->  RoleID.SUPER_ADMIN.equals(r.getRoleId()) );
    }


    /**
     * 관리자 여부. 최고 관리자일 경우에도 true
     *
     * @return boolean
     */
    public boolean isAdmin() {
        return ( isSuperAdmin() || getUserAuthorities().stream().anyMatch((r) ->  RoleID.ADMIN.equals(r.getRoleId()) ));
    }

    /***
     * 사용자 권한 등록
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

        if (isLogin()) {

            if(this.userAuthorities != null) {
                for (Role userAuth : this.userAuthorities) {
                    authorities.add(new SimpleGrantedAuthority(userAuth.getRoleId().trim()));
                }
            }
            authorities.add(new SimpleGrantedAuthority(Const.IS_AUTHENTICATED_FULLY));

        } else {
            authorities.add(new SimpleGrantedAuthority(Const.IS_AUTHENTICATED_ANONYMOUSLY));
        }
        return authorities;

    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.userName;
    }


    /**
     * 계정 만료 여부
     */
    @Override
    public boolean isAccountNonExpired() {
        return !expired;
    }

    /**
     * 계정 잠김 여부
     */
    @Override
    public boolean isAccountNonLocked() {
        return locked;
    }

    /**
     * 암호 만료 여부
     */
    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * 계정 사용 여부
     */
    @Override
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * 계정 승인 여부
     */
    public boolean isApproved() {
        return approved;
    }

    /**
     * @deprecated 더이상 사용하지 않습니다.
     */
    @Override
    @Deprecated
    public String getLoginId() {
        return null;
    }

    /**
     * 로그인 처리 이후 비밀번호,slat 값 필요 없으니 지움
     */
    public void eraseCredentials() {
        this.password = null;
    }


}
