package PSGLGD.OTES.entity;

public class RolePremission {
    private Integer id;

    private String roleid;

    private String premissionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPremissionid() {
        return premissionid;
    }

    public void setPremissionid(String premissionid) {
        this.premissionid = premissionid == null ? null : premissionid.trim();
    }
}