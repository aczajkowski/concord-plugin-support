package ca.vanzyl.concord.plugins.tool.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Option {

    String title() default "";

    String[] name();

    Class omitFor() default void.class;

    String description() default "";

    boolean required() default false;

    int arity() default -2147483648;

    boolean hidden() default false;

    String[] allowedValues() default {};
}