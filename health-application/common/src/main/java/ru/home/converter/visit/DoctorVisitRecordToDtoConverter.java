package ru.home.converter.visit;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.home.dto.base.UserDto;
import ru.home.dto.visit.DoctorVisitRecordDto;
import ru.home.dto.visit.FileVisitDto;
import ru.home.model.base.User;
import ru.home.model.visit.DoctorVisitRecord;
import ru.home.model.visit.FileVisit;

@Component
@RequiredArgsConstructor
public class DoctorVisitRecordToDtoConverter implements Converter<DoctorVisitRecord, DoctorVisitRecordDto> {

    private final Converter<User, UserDto> userDtoConverter;
    private final Converter<FileVisit, FileVisitDto> fileVisitDtoConverter;

    @Override
    public DoctorVisitRecordDto convert(DoctorVisitRecord source) {
        return DoctorVisitRecordDto.builder()
                .user(userDtoConverter.convert(source.getUser()))
                .creationTime(source.getCreationTime())
                .doctorSpecialty(source.getDoctorSpecialty())
                .file(fileVisitDtoConverter.convert(source.getFileVisit()))
                .visitType(source.getVisitType())
                .build();
    }

}
