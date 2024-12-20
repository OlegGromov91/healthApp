package ru.home.converter.base;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.home.dto.base.UserDto;
import ru.home.model.base.User;

@Component
public class UserToDtoConverter implements Converter<User, UserDto> {

    @Override
    public UserDto convert(User source) {
        return UserDto.builder()
                .userId(source.getUserId())
                .firstName(source.getFirstName())
                .lastName(source.getLastName())
                .isBot(source.isBot())
                .build();
    }

}
