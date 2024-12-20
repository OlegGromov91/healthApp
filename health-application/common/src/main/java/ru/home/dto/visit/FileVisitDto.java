package ru.home.dto.visit;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FileVisitDto {

    private String fileId;
    private byte[] file;
    private String fileName;
    private Long fileSize;

}
