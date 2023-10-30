# Projeto Combate - Capítulo: Construtores, this, sobrecarga, encapsulamento
## Desafio proposto
Em um jogo de combate, cada jogador joga com um campeão. Cada campeão possui um nome, uma
quantidade de ataque, armadura e vida. O combate entre dois campeões é organizado em turnos, de modo que em cada turno, os dois campeões se atacam.

Você deve fazer um programa para instanciar dois campeões, depois executar N turnos de combate, mostrando a cada turno o estado de cada campeão, conforme exemplos.
Se em um turno um dos campeões morrer (quantidade de vida igual a zero), o combate deve terminar. Ao final do combate, mostrar na tela "FIM DO COMBATE".

A regra para um campeão A receber dano de outro campeão B é a seguinte:

1) A quantidade de vida do campeão A deve ser decrescida da quantidade de ataque do campeão B, descontada a quantidade de armadura do campeão A.
A quantidade de vida resultante não pode ser menor que zero.

2) Independente da quantidade de armadura do campeão A, pelo menos 1 de vida o campeão A deve perder.
Você deve criar uma classe para representar o campeão, conforme projeto abaixo.

![image](https://user-images.githubusercontent.com/88738577/210084873-4fe4fd9d-920e-4de6-b889-56afc51a34c4.png)

O método takeDamage serve para fazer com que o campeão receba dano advindo do ataque de outro campeão, conforme regras acima.

O método status deve retornar o nome e a situação de vida do campeão (inclusive com a palavra "morreu" se a vida estiver a zero), conforme exemplos.

---
EXEMPLO 1: <br>
Digite os dados do primeiro campeão: <br>
Nome: Darius <br>
Vida inicial: 50 <br>
Ataque: 8 <br>
Armadura: 1 <br>
Digite os dados do segundo campeão: <br>
Nome: Fiora <br>
Vida inicial: 40 <br>
Ataque: 10 <br>
Armadura: 2 <br>
Quantos turnos você deseja executar? 2 <br>

*Resultado esperado:* <br>
Resultado do turno 1: <br>
Darius: 41 de vida <br>
Fiora: 34 de vida <br>
Resultado do turno 2: <br>
Darius: 32 de vida <br>
Fiora: 28 de vida <br>
FIM DO COMBATE <br>

---
EXEMPLO 2: <br>
Digite os dados do primeiro campeão: <br>
Nome: Darius <br>
Vida inicial: 50 <br>
Ataque: 8 <br>
Armadura: 1 <br>
Digite os dados do segundo campeão: <br>
Nome: Fiora <br>
Vida inicial: 40 <br>
Ataque: 30 <br>
Armadura: 10 <br>
Quantos turnos você deseja executar? 4 <br>

*Resultado esperado:* <br>
Resultado do turno 1: <br>
Darius: 21 de vida <br>
Fiora: 39 de vida <br>
Resultado do turno 2: <br>
Darius: 0 de vida (morreu) <br>
Fiora: 38 de vida <br>
FIM DO COMBATE <br>

---
## *Realizando teste do código localmente* 
O Windows 10 já possui um programa padrão para visualizar arquivos compactados.

Caso seu sistema operacional seja anterior ao Windos 10, realize o passo abaixo:

Para visualizar o projeto você precisará extrair os arquivos através de um programa para arquivos compactados.

Recomendo Winrar, baixe a versão 32x ou 64x, de acordo com seu sistema.

Link para download:
https://www.win-rar.com/download.html

---
## 📦️ *Como Testar o Código*
Para executar este passo, você tera que ter uma IDE instalada em sua máquina. Utilizei o Eclipse.


Siga o passo a passo abaixo:
```bash
  # Clone o repositório
  ❯ Clique no botão Code, depois em Download ZIP e salve o arquivo.

  # Extrair arquivos sem Winrar
  > Abra a pasta onde o arquivo foi salvo.
  >> Clique com o botão direito sobre o arquivo e selecione
  Extrair Tudo.
  As informações foram extraídas para a pasta Mod4_DesafioOO-2_Encapsulamento-main.

  # Extrair arquivos com Winrar
  > Abra a pasta onde o arquivo foi salvo.
  >> Clique com o botão direito sobre o arquivo e selecione Extrair Aqui (Extract Here).
  As informações foram extraídas para a pasta Mod4_DesafioOO-2_Encapsulamento-main.
  
  # Abrir o projeto
  > No Eclipse, clique em *File* e após em *Open Projects from File System...*
  >> Selecione a pasta do projeto e depois clique em *Finish*
  Aguarde a IDE carregar os arquivos e então visualize o código fonte.
  
```

---
## ⚠️ *Erros comuns* ⚠️

No passo *Como Testar o Código*, se não houver a opção *Extrair Tudo*, significa que não há programa instalado para manipulação de arquivos compactados.
Neste cado, seguir com o passo *Realizando teste do código localmente*.

No passo *Abrir o projeto*, após os arquivos serem carregados, pode acontecer de aparecer um X ou um ! vermelho. Caso isso ocorra, tente as soluções deste
tutorial: https://www.youtube.com/watch?v=Je4JWWJcyo0

---
## *Contribuidores* 🔥👊
Este projeto foi desenvolvido durante o curso Formação Desenvolvedor Moderno da escola [@DevSuperior](https://devsuperior.com.br), sobe orientação do tutor [Nelio Alves](https://www.linkedin.com/in/nelio-alves/?originalSubdomain=br).
