package com.example.pedidos.service;

import org.springframework.stereotype.Service;

@Service
public class NotificacaoEmailService implements NotificacaoService {

    @Override
    public void enviarEmail(Long clienteId, String mensagem) {
        // Implementação real: integração com serviço de email
        // Por enquanto, simula o envio
        System.out.printf("Email enviado para cliente %d: %s%n", clienteId, mensagem);
    }
}
