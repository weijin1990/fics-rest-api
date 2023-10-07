package jp.co.fics.api.repositories.impl;

import jp.co.fics.api.repositories.TestFetchRepository;
import jp.co.fics.core.TestRepositoryCore;
import jp.co.fics.core.dao.TestDAO;
import jp.co.fics.core.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Scope("prototype")
public class TestFetchRepositoryImpl implements TestFetchRepository {

    private final TestRepositoryCore repositoryCore;
    @Override
    public List<TestDTO> getAllItems() {
        return repositoryCore.findListT00_SEL_01();
    }
}
