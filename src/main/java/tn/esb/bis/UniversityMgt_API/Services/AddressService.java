package tn.esb.bis.UniversityMgt_API.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esb.bis.UniversityMgt_API.Repositories.AddressRepository;

@Service
public class AddressService {
    @Autowired
    private AddressRepository addressRepos;
}
