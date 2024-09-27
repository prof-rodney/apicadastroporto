package com.rodneycom.apicadastroporto.repositories;

import com.rodneycom.apicadastroporto.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
