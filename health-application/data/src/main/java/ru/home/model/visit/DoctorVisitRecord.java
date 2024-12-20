package ru.home.model.visit;

import com.mongodb.lang.NonNull;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.home.model.base.MongoEntity;
import ru.home.model.base.User;

import java.time.LocalDateTime;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@Document(collection = "doctor_visit_record")
public class DoctorVisitRecord extends MongoEntity {

    @NonNull
    private User user;

    @NonNull
    private FileVisit fileVisit;

    @NonNull
    @Builder.Default
    private LocalDateTime creationTime = LocalDateTime.now();

    @NonNull
    private String doctorSpecialty;

    private String visitType;

}
