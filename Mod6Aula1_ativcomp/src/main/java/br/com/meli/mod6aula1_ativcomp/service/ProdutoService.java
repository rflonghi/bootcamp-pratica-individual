package br.com.meli.mod6aula1_ativcomp.service;

import br.com.meli.mod6aula1_ativcomp.dto.ProdutoDTO;
import br.com.meli.mod6aula1_ativcomp.exception.ProductNotFoundException;
import br.com.meli.mod6aula1_ativcomp.model.Produto;
import br.com.meli.mod6aula1_ativcomp.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public ProdutoDTO save(ProdutoDTO produtoDTO) {
        return repository.save(produtoDTO.toModel()).toDTO();
    }

    private Produto findById(Long id) {
        Optional<Produto> produto = repository.findById(id);
        if (produto.isEmpty())
            throw new ProductNotFoundException(id);
        return produto.get();
    }

    public ProdutoDTO findProductById(Long id) {
        return findById(id).toDTO();
    }

    public ProdutoDTO update(Long id, ProdutoDTO produtoDTO) {
        Produto produto = findById(id);
        if (!produto.getNome().equals(produtoDTO.getNome())) {
            if (produtoDTO.getNome().length() > 3 && produtoDTO.getNome().length() < 50)
                produto.setNome(produtoDTO.getNome());
        }
        if (!produto.getPreco().equals(produtoDTO.getPreco())) {
            if (produtoDTO.getPreco() > 0.0)
                produto.setPreco(produtoDTO.getPreco());
        }
        if (!produto.getDescricao().equals(produtoDTO.getDescricao())) {
            if (produtoDTO.getDescricao().length() > 3 && produtoDTO.getDescricao().length() < 150)
                produto.setDescricao(produtoDTO.getDescricao());
        }
        return repository.save(produto).toDTO();
    }

    public void deleteProduct(Long id) {
        repository.delete(findById(id));
    }
}
