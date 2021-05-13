package kodlamaio.hrms.entities.concretes;
import  javax.persistence.Column;
import  javax.persistence.Id;
import  javax.persistence.GeneratedValue;
import  javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="job_positions")
public class JobPositions {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private  String name;


}
