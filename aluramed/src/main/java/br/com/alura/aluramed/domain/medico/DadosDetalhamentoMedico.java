package br.com.alura.aluramed.domain.medico;

import br.com.alura.aluramed.domain.endereco.Endereco;

public record DadosDetalhamentoMedico(long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco ) {
    
    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getCrm(), medico.getEmail(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
