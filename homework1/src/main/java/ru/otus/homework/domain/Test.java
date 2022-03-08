package ru.otus.homework.domain;

import ru.otus.homework.dao.TestDao;

import java.util.List;

public class Test {
    private final TestDao testDao;

    public Test(TestDao testDao) {
        this.testDao = testDao;
        testDao.load();
    }

    public List<Question> getQuestions() {
        return testDao.getQuestions();
    }
}
