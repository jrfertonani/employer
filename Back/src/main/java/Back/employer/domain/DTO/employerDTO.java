package Back.employer.domain.DTO;

import lombok.Data;

import java.io.Serial;

@Data
public class employerDTO {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long idEmployer;
    private String name;



}
