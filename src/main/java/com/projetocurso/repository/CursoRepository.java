package com.projetocurso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetocurso.entities.Curso;

public interface CursoRepository extends JpaRepository< Curso, Long>{
	
}
