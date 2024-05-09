package videogame.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import videogame.entity.Videogame;

@Component
public interface VideogameRepository extends CrudRepository<Videogame, Long> {
    Videogame findFirstByOrderByIdAsc();
}
