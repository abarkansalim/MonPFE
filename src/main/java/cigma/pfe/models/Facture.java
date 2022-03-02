package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "TFactures")
@NoArgsConstructor
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private Date date;

    @Column
    private double amount;

    public Facture(Date date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
