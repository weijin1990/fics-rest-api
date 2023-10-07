package jp.co.fics.api.restif.svc0000.ctrl;

import jp.co.fics.api.restif.data.TestUserIfBean;
import jp.co.fics.api.restif.svc0000.data.TestApiReq;
import jp.co.fics.api.restif.svc0000.data.TestApiRes;
import jp.co.fics.domain.TestUser;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Scope("prototype")
public class TestApiController {

    @PostMapping("fics/read")
    public TestApiRes readApiData(@RequestBody TestApiReq req) {
        TestUser user = convertReqToDomain(req);

        //TODO 現状Serviceは省略（DB実装次第定義する）
//        user = TestService.getResult();

        final TestApiRes res = convertDomainToRes(user);

        return res;
    }

    private TestUser convertReqToDomain(TestApiReq req) {

        TestUser domain = new TestUser();
        domain.setFinancialId(req.getFinancialId());
        // TODO 仮実装
        domain.setEmail("1234abcd@fics.co.jp");
        domain.setUsername("テスト　ユーザ");
        return domain;
    }
    private TestApiRes convertDomainToRes(TestUser user) {
        //　仮実装
        TestApiRes res = new TestApiRes();
        res.setResultFlag("true");
        res.setFinancialId(user.getFinancialId());
        for (int i = 0; i < 5; i++) {
            TestUserIfBean bean = new TestUserIfBean();
            bean.setEmail(i + user.getEmail());
            bean.setUsername(user.getUsername() + i);
            res.getUserList().add(bean);
        }

        return res;
    }
}
