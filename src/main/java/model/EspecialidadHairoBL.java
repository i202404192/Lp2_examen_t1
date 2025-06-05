package model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_especialidad")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class EspecialidadHairoBL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidad")
    @EqualsAndHashCode.Include
    private int id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Override
    public String toString() {
        return titulo;
    }
}
