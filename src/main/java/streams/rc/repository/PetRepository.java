package streams.rc.repository;


import org.springframework.data.repository.reactive.*;
import reactor.core.publisher.*;
import streams.rc.entity.*;

public interface PetRepository extends ReactiveCrudRepository<Pet, Long> {
    Flux<Pet> findAllByInZoneIsFalse();
}
