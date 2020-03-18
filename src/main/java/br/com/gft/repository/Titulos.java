package br.com.gft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>
{

}
