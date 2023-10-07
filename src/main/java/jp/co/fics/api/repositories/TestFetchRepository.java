package jp.co.fics.api.repositories;

import jp.co.fics.core.dto.TestDTO;

import java.util.List;

public interface TestFetchRepository {
    List<TestDTO> getAllItems();
}
