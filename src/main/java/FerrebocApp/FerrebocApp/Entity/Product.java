package FerrebocApp.FerrebocApp.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name="titulo", length = 100, nullable = false, unique = true)
    private String titulo;
    @Column(name="clave", length = 20, nullable = false, unique = true)
    private String clave;
    @Column(name="codigo", length = 20, nullable = false, unique = true)
    private int codigo;
    @Column(name="descripcion", length = 100, nullable = false, unique = true)
    private String descripcion;

    public Product(){

    }
    public Product(final String titulo,
                   final String clave,
                   final int codigo,
                   final String descripcion){
        this.titulo = titulo;
        this.clave = clave;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
