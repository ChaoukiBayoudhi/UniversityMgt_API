package tn.esb.bis.UniversityMgt_API.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esb.bis.UniversityMgt_API.Domains.Address;
@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
