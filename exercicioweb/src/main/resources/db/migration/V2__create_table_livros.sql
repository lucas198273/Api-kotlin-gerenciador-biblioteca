CREATE TABLE livros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_livro VARCHAR(255) NOT NULL,
    numero_de_folhas INT NOT NULL,
    tema VARCHAR(255) NOT NULL,
    livro_emprestado VARCHAR(255) NOT NULL DEFAULT FALSE,
    usuario_id int not null,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);

