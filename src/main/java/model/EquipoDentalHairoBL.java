package model;

import javax.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "tbl_equipo_dental")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EquipoDentalHairoBL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nro_equipo")
    @EqualsAndHashCode.Include
    private int nroEquipo;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "costo", nullable = false)
    private double costo;

    @Column(name = "fecha_adquisicion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAdquisicion;

    @Column(name = "estado", nullable = false, length = 1)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "id_dentista")
    private DentistaHairoBL dentista;

    @Override
    public String toString() {
        return nombre + " - S/. " + costo;
    }
}
