package com.test.test.service;

import com.test.test.domain.Test;
import com.test.test.repository.TestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 */
@Service
@Transactional
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository=testRepository;
    }

    @Transactional(readOnly = true)
    public List<Test> findAll(){
        return testRepository.findAll();
    }
}
