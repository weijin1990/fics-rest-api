package jp.co.fics.api.restif.svc0000.data;

import jp.co.fics.api.restif.data.TestUserIfBean;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TestApiRes {
    // 判定結果
    private String resultFlag;
    // 金融ID
    private String financialId;
    private List<TestUserIfBean> userList = new ArrayList<>();
}
