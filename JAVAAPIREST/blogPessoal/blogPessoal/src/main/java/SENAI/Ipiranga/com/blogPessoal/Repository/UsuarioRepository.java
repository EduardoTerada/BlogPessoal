package SENAI.Ipiranga.com.blogPessoal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SENAI.Ipiranga.com.blogPessoal.Model.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository <Usuario,Long>{
	public List<Usuario>FindAllByNomeContainingIgnoreCase(String nome);
	public Optional<Usuario>FindByUsuarioAndSenha(String usuario,String senha);
	public Optional<Usuario>FindByUsuario(String Usuario);
	

}
