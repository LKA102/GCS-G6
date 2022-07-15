package Entidades;

public class Login {
    private String correoe;
    private String clave;
    private String usuario;

    public Login() {
    }

    public Login(String correoe, String clave, String usuario) {
        this.correoe = correoe;
        this.clave = clave;
        this.usuario = usuario;
    }

    public String getCorreoe() {
        return correoe;
    }

    public void setCorreoe(String correoe) {
        this.correoe = correoe;
    }

    public String getClave() {
        return clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
