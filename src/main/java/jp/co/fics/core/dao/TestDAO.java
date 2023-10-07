package jp.co.fics.core.dao;

import jp.co.fics.core.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Mapper
@Scope("prototype")
public interface TestDAO {

    public List<TestDTO> findListT00_SEL_01();
}
