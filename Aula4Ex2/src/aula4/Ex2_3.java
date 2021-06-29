package aula4;

import java.beans.ConstructorProperties;

public class Ex2_3 {

    public static class Book {
        private String titulo;
        private Long isbn;
        private String autor;
        private Integer disponiveis;

        public Book() {
        }

        public Book(String titulo, Long isbn, String autor, Integer disponiveis) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.disponiveis = disponiveis;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Long getIsbn() {
            return isbn;
        }

        public void setIsbn(Long isbn) {
            this.isbn = isbn;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public Integer getDisponiveis() {
            return disponiveis;
        }

        public void setDisponiveis(Integer disponiveis) {
            this.disponiveis = disponiveis;
        }

        public void emprestimo(Integer unidades) {
            setDisponiveis(getDisponiveis() - unidades);
        }

        public void devolver(Integer unidades) {
            setDisponiveis(getDisponiveis() + unidades);
        }

        @Override
        public String toString() {
            return "Titulo: " + titulo + "\n" +
                    "isbn: " + isbn + "\n" +
                    "autor: " + autor + "\n" +
                    "Disponiveis: " + disponiveis + "\n";
        }
    }
}
