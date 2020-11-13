package br.com.clvrson.springwebmvc.repository;

import br.com.clvrson.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> jedi;

    public JediRepository () {
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Tedy", "Barros"));
        jedi.add(new Jedi("Teodoro", "Calopsita"));
    }

    public List<Jedi> getAllJedi() {
        return this.jedi;
    }

    public void add(final Jedi jedi) {
        this.jedi.add(jedi);
    }
}
