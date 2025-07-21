package streams.rc.service;

import org.springframework.stereotype.*;
import reactor.core.publisher.*;
import streams.rc.entity.*;
import streams.rc.repository.*;

@Service
public class PetService {
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Flux<Pet> findAll() {
        return petRepository.findAll();
    }

    public Mono<Pet> findById(Long id) {
        return petRepository.findById(id);
    }

    public Mono<Pet> createPet(Pet pet) {
        return petRepository.save(pet);
    }
}
