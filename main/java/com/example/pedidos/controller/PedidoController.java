package com.example.pedidos.controller;

import com.example.pedidos.dto.PedidoDTO;
import com.example.pedidos.entity.Pedido;
import com.example.pedidos.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<String> criarPedido(@Valid @RequestBody PedidoDTO dto) {
        Pedido pedido = pedidoService.criarPedido(dto);
        return ResponseEntity.ok("Pedido criado com sucesso (ID: " + pedido.getId() + ")");
    }
}
