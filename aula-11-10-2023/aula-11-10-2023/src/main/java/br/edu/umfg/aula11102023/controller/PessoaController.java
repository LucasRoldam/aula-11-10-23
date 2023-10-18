package br.edu.umfg.aula11102023.controller;


import br.edu.umfg.aula11102023.classes.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/client")
public class PessoaController {

    ArrayList<Pessoa> lista = new ArrayList<>();

    @PostMapping
    public void addPessoa(@RequestBody Pessoa pessoa){
        lista.add(pessoa);
    }

    @GetMapping
    public ArrayList<Pessoa> listarPessoas(){
        return lista;
    }

    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Integer id) throws Exception {
        Optional<Pessoa> pessoa = lista.stream().filter(c -> c.getId().equals(id)).findFirst();

        if (pessoa.isPresent()) {
            return pessoa.get();
        } else {
            throw new Exception("Pessoa não encontrado");
        }
    }


}
