package pe.edu.pucp.msflavor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@Table(name = "pstk_user", schema = "pucp_stack")
public class Flavor {



}
