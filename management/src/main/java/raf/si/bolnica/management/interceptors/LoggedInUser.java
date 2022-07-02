package raf.si.bolnica.management.interceptors;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Set;
import java.util.UUID;

@Component
@RequestScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LoggedInUser {

    private String username;

    private Set<String> roles;

    private UUID lbz;

    private long odeljenjeId;

    private long PBB;

    public LoggedInUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UUID getLBZ() {
        return lbz;
    }

    public void setLBZ(UUID lbz) {
        this.lbz = lbz;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public long getOdeljenjeId() {
        return odeljenjeId;
    }

    public void setOdeljenjeId(long odeljenjeId) {
        this.odeljenjeId = odeljenjeId;
    }

    public long getPBB() {
        return PBB;
    }

    public void setPBB(long PBB) {
        this.PBB = PBB;
    }
}
