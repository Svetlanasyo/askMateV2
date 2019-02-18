package io.github.askmate.restservice.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
class QuestionTest {


    Question question = new Question("Java", 1);

    @Test
    public void getDescriptionTest() {
        assertEquals("Java", question.description);
    }
}
