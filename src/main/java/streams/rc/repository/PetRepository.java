package streams.rc.repository;


import org.springframework.data.repository.reactive.*;
import streams.rc.entity.*;

public interface PetRepository extends ReactiveCrudRepository<Pet, Long> {
}
