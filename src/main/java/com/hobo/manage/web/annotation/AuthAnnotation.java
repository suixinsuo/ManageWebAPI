package com.hobo.manage.web.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName AuthAnnotation
 * @Description 自定义注解类
 * @Author jpg
 * @Date 2019年2月7日 下午4:40:08
 */
// 表示作用在方法上
@Target(ElementType.METHOD)
// 表示运行时有效
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthAnnotation {
	// 定义属性
	String authority() default "";
}
