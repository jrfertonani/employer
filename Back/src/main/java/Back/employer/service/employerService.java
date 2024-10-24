package Back.employer.service;

import Back.employer.repository.employerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employerService {

    @Autowired
    public ModelMapper mapper;

    @Autowired
    public employerRepository repository;


}
