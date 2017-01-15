package spring.mvc.springpaging.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import spring.mvc.springpaging.dto.ListDTO;

public interface PostRepository extends PagingAndSortingRepository<ListDTO, Integer>{
	Page<ListDTO> findAll(Pageable pageable);
	Page<ListDTO> findAllByOrderBySeqDesc(Pageable pageable);
	Page<ListDTO> finaByAuthor(String author, Pageable pageable);
	
//	Page<ListDTO> findAllSearch(@Param("searchString") String searchString, Pageable pageable);
}
