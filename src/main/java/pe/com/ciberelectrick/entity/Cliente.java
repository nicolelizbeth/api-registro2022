package pe.com.ciberelectrick.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;


@Builder
@Entity(name = "Cliente")
@Table(name = "t.cliente")
public class Cliente implements Serializable{
    private static final long SerialVersionUID=1L;
    @Id //define la clave primaria
    @Column(name = "codcli")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
    private long codigo;
    @Column(name = "nomcli")
    private String nombre;
    @Column(name = "apepcli")
    private String apellidopaterno;
    @Column(name = "apemcli")
    private String apellidomaterno;
    @Column(name = "dnicli")
    private String dni;
    @Column(name = "dircli")
    private String direccion;
    @Column(name = "telcli")
    private String telefono;
    @Column(name = "celcli")
    private String celular;
    @Column(name = "corcli")
    private String correo;
    @Column(name = "sexcli")
    private String sexo;
    @Column(name = "estcli")
    private boolean estado;

    public Cliente() {
    }

    public Cliente(long codigo, String nombre, String apellidopaterno, String apellidomaterno, String dni,
            String direccion, String telefono, String celular, String correo, String sexo, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidomaterno = apellidomaterno;
        this.apellidopaterno= apellidomaterno;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.celular = celular;
        this.correo = correo;
        this.sexo = sexo;
        this.estado = estado;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidoPaterno() {
        return apellidopaterno;
    }

    public void setApellidoPaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }
    
    public String getApellidoMaterno() {
        return apellidomaterno;
    }

    public void setApellidoMaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
