package pri.zxx.picsite.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pri.zxx.picsite.res.ResData;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zxx
 * @desc 全局异常处理
 * @createTime 2019-05-31-上午 10:51
 */
@ControllerAdvice
public class GlobalException {
    private static final Logger log = LoggerFactory.getLogger(GlobalException.class);

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object handleException(Exception e) {
        if (e instanceof BindException) {
            BindException ex = (BindException) e;
            List<String> errorInformation = ex.getBindingResult().getAllErrors()
                    .stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.toList());
            return new ResData(0, "参数验证失败", errorInformation);
        } else if (e instanceof ConstraintViolationException) {
            ConstraintViolationException ex = (ConstraintViolationException) e;
            List<String> errorInformation = ex.getConstraintViolations()
                    .stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toList());
            return new ResData(0, "参数验证失败", errorInformation);
        } else {
            HashMap<String, Object> stringObjectHashMap = new HashMap<>();
            stringObjectHashMap.put("causedBy", e.getCause());
            stringObjectHashMap.put("message", e.getMessage());
            //打印错误
            log.error("看见没有??真的是异常 {}", e);
            return new ResData(0, "系统繁忙,请稍后重试", stringObjectHashMap);
        }
    }
}
