/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.distribuidas.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dennys
 */
@Entity
public class Detalle implements Serializable {

    @Id
    @Column(name = "ID_DETALLE", nullable = false)
    private Integer id;

    @Column(name = "ID_ARTICULO", nullable = false)
    private Integer idArticulo;

    @Column(name = "ID_FACTURA", nullable = false)
    private Integer idFactura;

    @JoinColumn(name = "ID_FACTURA", referencedColumnName = "ID_FACTURA")
    @ManyToOne(optional = false)
    private Factura factura;

    @JoinColumn(name = "ID_ARTICULO", referencedColumnName = "ID_ARTICULO")
    @ManyToOne(optional = false)
    private Articulo articulo;

    @Column(name = "CANTIDAD_DETALLE", nullable = false)
    private Integer cantidad;

    @Column(name = "DESCUENTO_DETALLE")
    private BigDecimal descuento;

    public Detalle() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(Integer idArticulo) {
        this.idArticulo = idArticulo;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getDescuento() {
        return descuento;
    }

    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Detalle other = (Detalle) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id=" + id + ", idArticulo=" + idArticulo + ", idFactura=" + idFactura + ", factura=" + factura + ", articulo=" + articulo + ", cantidad=" + cantidad + ", descuento=" + descuento + '}';
    }

}
