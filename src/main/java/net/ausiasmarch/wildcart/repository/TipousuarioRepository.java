package net.ausiasmarch.wildcart.repository;

import net.ausiasmarch.wildcart.entity.TipousuarioEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipousuarioRepository extends JpaRepository<TipousuarioEntity, Long> {

    public Page<TipousuarioEntity> findByNombreIgnoreCaseContaining(String strFilter, Pageable oPageable);

}
