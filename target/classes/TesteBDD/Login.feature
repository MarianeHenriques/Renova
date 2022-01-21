#language: pt

  Funcionalidade: Acessar a tela inicial do sistema


   Esquema do Cenario: : Validar o acesso a tela inicial após o Login
      Dado Que estou acessando o Web na pagina de login
      Quando Clico no campo <usuario> e preencho com dados validos
      E Clico em <senha> e preencho com dados validos
      E clico em Entrar
      Entao Acesso a tela inicial da Fundação Renova
     Exemplos:
       |           usuario              | senha  |
       |gabriel.leal@justdigital.com.br |@Adm2022|


