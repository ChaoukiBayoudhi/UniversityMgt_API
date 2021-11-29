package tn.esb.bis.UniversityMgt_API.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esb.bis.UniversityMgt_API.Repositories.ModuleRepository;

@Service
public class ModuleService {
    @Autowired
    private ModuleRepository moduleRepos;
}
