package leetcode;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target({TYPE, METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface TimeComplexity {
    Complexity value() default Complexity.UNKNOWN;
    Complexity best() default Complexity.UNKNOWN;
    Complexity average() default Complexity.UNKNOWN;
    Complexity worst() default Complexity.UNKNOWN;
}
