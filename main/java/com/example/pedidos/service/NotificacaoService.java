package com.example.pedidos.service;

/**
 * Interface para envio de notificações.
 * Permite injeção de dependência e facilita testes (mock).
 */
public interface NotificacaoService {

    void enviarEmail(Long clienteId, String mensagem);
}
