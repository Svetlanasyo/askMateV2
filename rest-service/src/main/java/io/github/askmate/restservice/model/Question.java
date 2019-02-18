package io.github.askmate.restservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Question {
    String description;
    int id;
}


