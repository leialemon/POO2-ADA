## Biblioteca 
Projeto desenvolvido nas aulas de Programação Orientada a Objetos II, no curso de formação em Java ADA B3+ Inclua.
O projeto simula um programa de gerenciamento de biblioteca que oferece serviços virtuais e no ambiente físico.

## Diagrama do projeto
```mermaid
classDiagram
class BibliotecaService
<<Interface>>BibliotecaService
BibliotecaService: + reservar()
BibliotecaService: + consultar()
BibliotecaService <|-- BibliotecaServiceFisica
BibliotecaService <|-- BibliotecaServiceVirtual

class BibliotecaServiceFisica
<<Interface>>BibliotecaServiceFisica
BibliotecaServiceFisica: + emprestar()
BibliotecaServiceFisica: + devolver()
BibliotecaServiceFisica: + cadastrar(ItemCatalogo)

class BibliotecaServiceFisicaImpl
BibliotecaServiceFisica ..|> BibliotecaServiceFisicaImpl
BibliotecaServiceFisicaImpl: + reservar()
BibliotecaServiceFisicaImpl: + emprestar()
BibliotecaServiceFisicaImpl: + devolver()
BibliotecaServiceFisicaImpl: + consultar()
BibliotecaServiceFisicaImpl: + cadastrar(ItemCatalogo)
BibliotecaServiceFisicaImpl: - BibliotecaRepositorioListImpl catalogo

class BibliotecaServiceImpl
<<Abstract>>BibliotecaServiceImpl
BibliotecaServiceImpl <|-- BibliotecaServiceFisicaImpl
BibliotecaServiceImpl <|-- BibliotecaServiceVirtualImpl

class BibliotecaServiceVirtual
<<Interface>>BibliotecaServiceVirtual


class BibliotecaServiceVirtualImpl
BibliotecaServiceVirtual ..|> BibliotecaServiceVirtualImpl
BibliotecaServiceVirtualImpl: + reservar()
BibliotecaServiceVirtualImpl: + consultar()

class ItemCatalogo
<<Abstract>>ItemCatalogo
ItemCatalogo: - String titulo
ItemCatalogo: - String autor
ItemCatalogo: - LocalDate data
ItemCatalogo <|-- Livro
ItemCatalogo <|-- Revista
ItemCatalogo <|-- Manuscrito

class BibliotecaRepositorio
<<Interface>> BibliotecaRepositorio
BibliotecaRepositorio: + salvar(ItemCatalogo)

class BibliotecaRepositorioListImpl
BibliotecaRepositorio ..|> BibliotecaRepositorioListImpl
BibliotecaRepositorioListImpl: - List<ItemCatalogo> catalogo
BibliotecaRepositorioListImpl: + salvar(ItemCatalogo)

class Livro{
    -String isbn
    -String editora
    -String numeroPaginas
}

class Revista{
    -int numeroEdicao;
    -String mesPublicacao;
    -String categoria;
}

class Manuscrito{
    -String localOrigem;
    -String estadoConservacao;
    -boolean digitalizado;
}
```
