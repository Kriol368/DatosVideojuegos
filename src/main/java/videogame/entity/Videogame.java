package videogame.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Videogame {
    @Id
    //AUTO no funciona bien con SQLite porque intenta obtener el valor de una tabla de secuencias para cada tabla
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    public Videogame(){

    }
    public Videogame(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
}

