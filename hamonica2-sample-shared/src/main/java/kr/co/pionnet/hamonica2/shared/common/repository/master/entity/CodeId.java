package kr.co.pionnet.hamonica2.shared.common.repository.master.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodeId implements Serializable {
    private String codeGroupId;
    private String codeId;
}