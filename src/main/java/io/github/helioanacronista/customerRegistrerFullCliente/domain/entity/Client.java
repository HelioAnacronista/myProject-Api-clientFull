package io.github.helioanacronista.customerRegistrerFullCliente.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;

    @Column(nullable = false, name = "data_nacimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @NotNull(message = "{campo.data.obrigatorio}")
    @Past(message = "{campo.data.futura}")
    private Date nacimento;

    @Column(nullable = false, length = 250)
    @NotEmpty(message = "{campo.endereco.obrigatorio}")
    private String endereco;

    @Column(nullable = false, length = 11)
    @NotEmpty(message = "{campo.telefone.obrigatori}")
    private String telefone;

    @Column(nullable = false, length = 11)
    @NotEmpty(message = "{campo.cpf.obrigatorio}")
    @CPF(message = "{campo.cpf.invalido}")
    private String cpf;


}