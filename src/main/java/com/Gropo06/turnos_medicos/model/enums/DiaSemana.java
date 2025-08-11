package com.Gropo06.turnos_medicos.model.enums;

import java.time.LocalDate;

public enum DiaSemana {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;
	
	public static DiaSemana desde(LocalDate fecha) {
        return switch (fecha.getDayOfWeek()) {
            case MONDAY    -> LUNES;
            case TUESDAY   -> MARTES;
            case WEDNESDAY -> MIERCOLES;
            case THURSDAY  -> JUEVES;
            case FRIDAY    -> VIERNES;
            case SATURDAY  -> SABADO;
            case SUNDAY    -> DOMINGO;
        };
	}
}