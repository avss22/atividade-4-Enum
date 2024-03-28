import java.util.Date;
import java.util.List;
import java.util.ArrayList;

enum Status {
    PENDENTE,
    CONTRATADO,
    DEMITIDO
}

enum Cargo {
    DIRETOR,
    ASSESSOR,
    ANALISTA,
    TECNICO,
    ADMINISTRATIVO
}

enum TipoDocumento {
    RG, CPF, CNPJ;

    public String getDescricao() {
        switch (this) {
            case RG:
                return "Registro Geral";
            case CPF:
                return "Cadastro de Pessoa Física";
            case CNPJ:
                return "Cadastro de Pessoa Jurídica";
            default:
                return "";
        }
    }
}
