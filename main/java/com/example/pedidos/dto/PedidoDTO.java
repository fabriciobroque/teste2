package com.example.pedidos.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PedidoDTO(
        @NotNull(message = "Cliente ID é obrigatório")
        Long clienteId,

        @NotNull(message = "Valor é obrigatório")
        @DecimalMin(value = "0.01", message = "Valor deve ser maior que zero")
        BigDecimal valor
) {}
