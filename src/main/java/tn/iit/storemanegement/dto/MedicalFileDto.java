package tn.iit.storemanegement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MedicalFileDto {
    private long id;
    @NotNull
    @NotEmpty
    @Size(min = 3)
    private String name;
    @NotNull
    private float dosage;
    @NotNull
    private float price;
    @NotNull
    private Date expiredDate;
    @NotNull
    private long categoryId;
    @NotNull
    @Size(min = 3)
    private String categoryName;

}
