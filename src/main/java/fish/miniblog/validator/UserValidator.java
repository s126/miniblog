package fish.miniblog.validator;

import fish.miniblog.model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(User.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if(user.getName() == null || user.getName().length() < 3) {
            errors.rejectValue("name", null, "名字不能为空，而且必须要大于 3 位");
        }

        if(user.getAge() < 18 ) {
            errors.rejectValue("age", null, "年龄必须要大于 18 岁哦");
        }
    }
}
