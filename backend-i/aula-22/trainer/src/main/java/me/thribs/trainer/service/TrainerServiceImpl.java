package me.thribs.trainer.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import me.thribs.trainer.model.Trainer;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> listTrainers() {
        return Arrays.asList(new Trainer("Thiago"), new Trainer("Ana"));
    }
    
}
