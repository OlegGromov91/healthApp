package ru.home.model.visit;

import com.mongodb.lang.NonNull;
import lombok.*;
import org.bson.types.Binary;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FileVisit {

    @NonNull
    private String fileId;
    @NonNull
    private Binary file;
    @NonNull
    private String fileName;
    @NonNull
    private Long fileSize;


}
