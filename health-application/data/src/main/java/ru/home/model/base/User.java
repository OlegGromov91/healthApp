package ru.home.model.base;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;

@Getter
@Setter
@Builder
public class User {
    @Indexed(unique = true)
    private Long userId;
    private String firstName;
    private String lastName;
    private boolean isBot;

}
