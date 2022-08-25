package me.thribs.trainer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.thribs.trainer.model.Trainer;
import me.thribs.trainer.service.TrainerService;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping
    public List<Trainer> getTrainers() {
        return trainerService.listTrainers();
    }

    // @GetMapping
    // public Trainer getTrainer() {
    //     return new Trainer("Jack");
    // }

    // @PostMapping
    // public Trainer _j() {
    //     return new Trainer("Jack");
    // }
    
}
