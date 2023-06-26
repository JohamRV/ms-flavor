package pe.edu.pucp.msflavor.daos;

import lombok.Data;
import org.springframework.stereotype.Component;
import pe.edu.pucp.msflavor.entity.Flavor;

@Data
@Component
public class FlavorDao {
    Flavor flavor;
}
