package br.com.alura.aluramed.domain.medico;

import br.com.alura.aluramed.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
    @NotNull
    long id, 
    String nome, 
    String telefone, 
    DadosEndereco endereco) {
}
