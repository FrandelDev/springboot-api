package com.test.demo.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;



@Entity
@Table(name = "compras")
class Compra{
    
    @EmbeddedId
   private ComprasProductoPK comprasProductoPK;
    
    @Column(name = "fecha")
    private LocalDateTime fecha;
    
    @Column(name = "medio_pago")
    private String medioPago;
    
    private String comentario;
    private String estado;

    
    @ManyToOne
    @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
    private Cliente cliente;



    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ComprasProductoPK getComprasProductoPK() {
        return comprasProductoPK;
    }

    public void setComprasProductoPK(ComprasProductoPK comprasProductoPK) {
        this.comprasProductoPK = comprasProductoPK;
    }

    
}