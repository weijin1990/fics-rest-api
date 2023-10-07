package jp.co.fics.core;

import jp.co.fics.core.dao.TestDAO;
import jp.co.fics.core.dto.TestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Component
@Scope("prototype")
public class TestRepositoryCore {

    private final TestDAO testDAO;

    public List<TestDTO> findListT00_SEL_01() {
        return testDAO.findListT00_SEL_01();
    }
}
