package com.example.pedidos.service;

import com.example.pedidos.dto.PedidoDTO;
import com.example.pedidos.entity.Pedido;
import com.example.pedidos.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final NotificacaoService notificacaoService;

    public PedidoService(PedidoRepository pedidoRepository, NotificacaoService notificacaoService) {
        this.pedidoRepository = pedidoRepository;
        this.notificacaoService = notificacaoService;
    }

    @Transactional
    public Pedido criarPedido(PedidoDTO dto) {
        Pedido pedido = new Pedido(dto.clienteId(), dto.valor());
        pedido = pedidoRepository.save(pedido);

        notificacaoService.enviarEmail(dto.clienteId(), "Pedido criado!");

        return pedido;
    }
}
