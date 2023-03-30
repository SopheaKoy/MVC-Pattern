package co.istad.mvcapp.dto;

import java.util.UUID;

// data class use for store data
public record ProductDto(UUID uuid, Integer code , String name) {
}
