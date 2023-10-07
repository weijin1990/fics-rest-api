package jp.co.fics.api.services.impl;

import jp.co.fics.api.repositories.TestFetchRepository;
import jp.co.fics.api.services.TestFetchService;
import jp.co.fics.core.dto.TestDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestFetchServiceImpl implements TestFetchService {

    private final TestFetchRepository repo;

    public TestFetchServiceImpl(TestFetchRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<TestDTO> getAllItems() {
        return repo.getAllItems();
    }
}
