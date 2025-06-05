package model;

import javax.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "tbl_dentista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class DentistaHairoBL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dentista")
    @EqualsAndHashCode.Include
    private int id;

    @Column(name = "cop", nullable = false, length = 6)
    private String cop;

    @Column(name = "nombre_completo", nullable = false)
    private String nombreCompleto;

    @Column(name = "fecha_inicio_contrato", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicioContrato;

    @Column(name = "turno", nullable = false, length = 1)
    private String turno;

    @Column(name = "correo", nullable = false, unique = true)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false)
    private EspecialidadHairoBL especialidad;

    @Override
    public String toString() {
        return nombreCompleto;
    }
}
