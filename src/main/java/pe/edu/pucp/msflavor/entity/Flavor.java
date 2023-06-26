package pe.edu.pucp.msflavor.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "pstk_flavor", schema = "pucp_stack")
public class Flavor {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "FLAVOR_ID")
    private Integer flavorId;

    @Basic
    @Column(name = "NAME")
    @NotNull(message = "The name must not be null.")
    @NotBlank(message = "The name must not be empty.")
    @Size(max = 45, message = "The name must not be more than 45 characters.")
    private String name;

    @Basic
    @Column(name = "RAM_GB")
    @NotNull(message = "The ram (Gb) must not be null.")
    private Integer ramGb;

    @Basic
    @Column(name = "VCPU")
    @NotNull(message = "The vCPUs must not be null.")
    private Integer vcpu;

    @Basic
    @Column(name = "DISK_MB")
    @NotNull(message = "The disk (Mb) must not be null.")
    private Integer diskMb;

    @Basic
    @Column(name = "DESCRIPTION")
    @Size(max = 255, message = "The description must not be more than 255 characters.")
    private String description;

}
