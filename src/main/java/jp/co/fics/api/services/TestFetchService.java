package jp.co.fics.api.services;

import jp.co.fics.core.dto.TestDTO;

import java.util.List;

public interface TestFetchService {
    List<TestDTO> getAllItems();
}
