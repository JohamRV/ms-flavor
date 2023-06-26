package pe.edu.pucp.msflavor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.pucp.msflavor.entity.Flavor;

@Repository
public interface FlavorRepository extends JpaRepository<Flavor, Integer> {
}
