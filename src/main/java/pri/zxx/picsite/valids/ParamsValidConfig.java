package pri.zxx.picsite.valids;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author Twilight
 * @desc hibernate 实体类配置文件，快速失败。第一个参数无效则结束校验
 * @createTime 2019-10-08-下午 2:17
 */
@Configuration
public class ParamsValidConfig {

    public Validator validator() {
        ValidatorFactory factory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .addProperty("hibernate.validator.fail_fast", "true")
                .buildValidatorFactory();
        return factory.getValidator();
    }
}
