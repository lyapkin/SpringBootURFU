package ru.liapkin.springbooturfu.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    @Size(max=32)
    private String uid;
    @NotBlank
    @Size(max=32)
    private String operationUid;
    private String systemName;
    @NotBlank
    @Pattern(regexp = "(([0-1][0-9])|(2[0-4])):[0-5][0-9]")
    private String systemTime;
    private String source;
    @Min(1)
    @Max(100000)
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

}
