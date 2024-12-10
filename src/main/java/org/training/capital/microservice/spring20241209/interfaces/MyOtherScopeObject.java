package org.training.capital.microservice.spring20241209.interfaces;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyOtherScopeObject {
    private int count;

    public void increase(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(final int countParam) {
        count = countParam;
    }
}
