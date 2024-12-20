package ru.home.dto.base;

import lombok.Builder;

@Builder
public record UserDto(Long userId, String firstName, String lastName, boolean isBot) {
}
