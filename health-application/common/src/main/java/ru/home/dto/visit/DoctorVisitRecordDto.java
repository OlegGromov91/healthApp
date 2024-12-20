package ru.home.dto.visit;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.home.dto.base.UserDto;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class DoctorVisitRecordDto {
    private FileVisitDto file;
    private UserDto user;
    @Builder.Default
    private LocalDateTime creationTime = LocalDateTime.now();
    private String doctorSpecialty;
    private String visitType;
}
