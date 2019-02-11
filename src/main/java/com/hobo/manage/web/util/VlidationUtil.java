package com.hobo.manage.web.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidationException;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @ClassName VlidationUtil
 * @Description form bean 校验类
 * @Author jpg
 * @Date 2019年1月27日 下午10:18:28
 */
public class VlidationUtil {
	private static Validator validator;  
    
    static {  
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();  
        validator = vf.getValidator();  
    }  
      
  
    /** 
     * @throws ValidationException  
     * @throws ValidationException   
     * @Description: 校验方法 
     * @param t 将要校验的对象 
     * @throws ValidationException  
     * void 
     * @throws  
     */   
    public static <T> void validate(T t) throws ValidationException{  
        Set<ConstraintViolation<T>> set =  validator.validate(t);  
        if(set.size()>0){  
            StringBuilder validateError = new StringBuilder();  
            for(ConstraintViolation<T> val : set){  
                validateError.append(val.getMessage() + " ;");  
            }  
            throw new ValidationException(validateError.toString());              
        }  
    }  
}
