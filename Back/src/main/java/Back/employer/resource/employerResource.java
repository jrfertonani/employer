package Back.employer.resource;


import Back.employer.domain.DTO.employerDTO;
import Back.employer.domain.entity.Employer;
import Back.employer.service.employerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin("*")
@RestController
@RequestMapping("/employers")
public class employerResource {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    public employerService service;




}
