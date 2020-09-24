package com.ifood.recompensas.repository;

import com.ifood.recompensas.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}

//public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {
//}
