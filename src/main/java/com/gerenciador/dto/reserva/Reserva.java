package com.gerenciador.dto.reserva;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Reserva {
    private Integer numeroDeAcompanhantes = null;
    private LocalDateTime dataDaReserva = null;
    private String clienteAssociado; // recebe o nome do cliente
}