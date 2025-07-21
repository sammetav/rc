package streams.rc.entity;


import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.*;

@Table(name = "pets")
@Getter
@Setter
public class Pet {
    @Id
    private Long id;
    private Integer ownerId;
    private Boolean inZone;
    private PetType petType;
    private TrackerType trackerType;
    private Boolean lostTracker;  // relevant only for cats
}


enum PetType {
    CAT, DOG
}

enum TrackerType {
    SMALL, MEDIUM, BIG
}
