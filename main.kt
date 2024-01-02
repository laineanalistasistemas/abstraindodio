class Formacao(
    val nome: String,
    val nivel: NivelFormacao,
    val conteudosEducacionais: List<ConteudoEducacional>
) {
    fun matricularAluno(aluno: Aluno) {
        // implementação da matrícula do aluno na formação
    }
}

enum class NivelFormacao {
    INICIANTE,
    INTERMEDIARIO,
    AVANCADO
}

abstract class ConteudoEducacional(
    val titulo: String,
    val duracaoHoras: Int,
    val descricao: String
)

class Curso(
    titulo: String,
    duracaoHoras: Int,
    descricao: String,
    val linguagem: LinguagemProgramacao
) : ConteudoEducacional(titulo, duracaoHoras, descricao)

enum class LinguagemProgramacao {
    KOTLIN,
    JAVA,
    PYTHON,
    RUBY,
    ETC
}

class Aluno(
    val nome: String,
    val email: String,
    val telefone: String
) {
    val formacoesMatriculadas: MutableList<Formacao> = mutableListOf()

    fun matricular(formacao: Formacao) {
        formacao.matricularAluno(this)
        formacoesMatriculadas.add(formacao)
    }
}
