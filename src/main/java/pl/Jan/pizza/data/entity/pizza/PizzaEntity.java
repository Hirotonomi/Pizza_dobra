package pl.Jan.pizza.data.entity.pizza;

import pl.Jan.pizza.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity
{

    @Id
    @GeneratedValue(strategy = Generation.Type.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    //jedna pizza ma wiele sizów
    @OneToMany(mappedBy = "pizza", orphanRemoval = true)
    private Set<SizeEntity> sizes;
}
