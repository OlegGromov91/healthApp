package ru.home.converter.visit;

import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.home.dto.visit.FileVisitDto;
import ru.home.model.visit.FileVisit;

@Component
@RequiredArgsConstructor
public class FileVisitToDtoConverter implements Converter<FileVisit, FileVisitDto> {


    @Override
    public FileVisitDto convert(FileVisit source) {
        return FileVisitDto.builder()
                .file(source.getFile().getData())
                .fileId(source.getFileId())
                .fileName(source.getFileName())
                .fileSize(source.getFileSize())
                .build();
    }

}
