package br.com.alura.forum.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alura.forum.modelo.Curso;

@RunWith(SpringRunner.class)
@DataJpaTest
// Por padrão o JNUIT utiliza um banco de dados em memória
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
public class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;

	@Autowired
	private TestEntityManager em;

	@Test
	public void deveriaCarregarUmCursoAoBuscarPeloNome() {
//		String nomeCurso = "HTML 5";
//
//		Curso curso = new Curso();
//		curso.setNome(nomeCurso);
//		curso.setCategoria("Programação");
//		em.persist(curso);
//
//		Curso cursoX = repository.findByNome(nomeCurso);
//		Assert.assertNotNull(curso);
//		Assert.assertEquals(nomeCurso, curso.getNome());
	}

	@Test
	public void NaodeveriaCarregarUmCursoAoBuscarPeloNome() {
		String nomeCurso = "JPA";
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNull(curso);
	}

}
