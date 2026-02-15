package com.example.pedidos.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long clienteId;

    @Column(nullable = false, precision = 19, scale = 2)
    private BigDecimal valor;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    protected Pedido() {}

    public Pedido(Long clienteId, BigDecimal valor) {
        this.clienteId = clienteId;
        this.valor = valor;
        this.dataCriacao = LocalDateTime.now();
    }

    public Long getId() { return id; }
    public Long getClienteId() { return clienteId; }
    public BigDecimal getValor() { return valor; }
    public LocalDateTime getDataCriacao() { return dataCriacao; }
}
