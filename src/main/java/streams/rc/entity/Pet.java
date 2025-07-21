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

    public Pet(Integer ownerId, Boolean inZone, PetType petType, TrackerType trackerType, Boolean lostTracker) {
        this.ownerId = ownerId;
        this.inZone = inZone;
        this.petType = petType;
        this.trackerType = trackerType;
        this.lostTracker = lostTracker;

        validate();
    }

    public void validate() {
        if (petType == PetType.CAT && lostTracker == null) {
            throw new IllegalArgumentException("lostTracker must not be null for cats");
        }
        if (petType == PetType.DOG && lostTracker != null) {
            throw new IllegalArgumentException("lostTracker must be null for dogs");
        }
    }
}


enum PetType {
    CAT, DOG
}

enum TrackerType {
    SMALL, MEDIUM, BIG
}
