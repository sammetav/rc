package streams.rc.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;
import streams.rc.entity.*;
import streams.rc.service.*;

@RestController
@RequestMapping("api/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public Flux<Pet> findAll() {
        return petService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Pet> findById(@PathVariable Long id) {
        return petService.findById(id);
    }

    @PostMapping
    public Mono<Pet> createPet(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }
}
