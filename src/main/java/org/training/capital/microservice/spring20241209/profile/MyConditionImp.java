package org.training.capital.microservice.spring20241209.profile;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.MergedAnnotation;
import org.springframework.core.annotation.MergedAnnotations;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

public class MyConditionImp implements Condition {
    @Override
    public boolean matches(final ConditionContext context,
                           final AnnotatedTypeMetadata metadata) {
        MergedAnnotations   annotationsLoc = metadata.getAnnotations();
        MergedAnnotation<MyCondition> myConditionMergedAnnotationLoc = annotationsLoc.get(MyCondition.class);
        String keyLoc = myConditionMergedAnnotationLoc.getString("key");
        String valueLoc = myConditionMergedAnnotationLoc.getString("value");
        String propertyLoc = context.getEnvironment()
                                    .getProperty(keyLoc);
        if (valueLoc
                .equals(propertyLoc)) {
            return true;
        }
        return false;
    }
}
