package org.training.capital.microservice.spring20241209.error;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ErrorObj {
    private List<ErrorObj> subErrors;
    private String  errorDesc;
    private Integer errorCode;

    @Builder(setterPrefix = "with")
    public ErrorObj(final List<ErrorObj> subErrorsParam,
                    final String errorDescParam,
                    final Integer errorCodeParam) {
        subErrors = subErrorsParam;
        errorDesc = errorDescParam;
        errorCode = errorCodeParam;
    }
}
