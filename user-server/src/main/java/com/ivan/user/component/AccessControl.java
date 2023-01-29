package com.ivan.user.component;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;

@Component
public class AccessControl {

    // 系统集合的抽象实现，这里你可以采用更加合理更加效率的方式
//    private Supplier<Set<AntPathRequestMatcher>> supplier;


    public boolean check(Authentication authentication, HttpServletRequest request) {
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        // 当前用户的角色集合
        System.out.println("authorities = " + authorities);
        System.out.println("uri = " + request.getRequestURI());
        //todo 这里自行实现比对逻辑
        //   supplier.get().stream().filter(matcher -> matcher.matches(request));
        // true false 为是否放行



        return true;
    }

}
