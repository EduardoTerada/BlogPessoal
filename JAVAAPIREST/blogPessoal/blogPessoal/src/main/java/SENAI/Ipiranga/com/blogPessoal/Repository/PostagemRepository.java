package SENAI.Ipiranga.com.blogPessoal.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SENAI.Ipiranga.com.blogPessoal.Model.Postagem;

@Repository

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findByTituloContainingIgnoreCase(String Titulo);
	
	

}
