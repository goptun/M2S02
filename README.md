# M2S02 - Atividades em Java

### [M2S02] Ex 01 - Classe Data

Crie uma classe chamada Data que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int). Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método set e um get para cada variável de instância. Apresente um método exibirData que exiba mês, dia e ano separados por barras normais (/). Escreva um aplicativo de teste chamado TestaData que demonstre as capacidades da classe Data

### [M2S02] Ex 02 - Pessoa Física

Crie uma classe PessoaFisica e pense em quais atributos ela deve possuir. Um deles, obrigatoriamente, será o CPF. Garanta que nenhuma pessoa física seja criada sem um CPF, e que nenhuma pessoa física possua um CPF inválido. (Não é preciso criar o algoritmo de validação de CPF, apenas a assinatura do método)

### [M2S02] Ex 03 - Classe Retângulo

Crie uma classe Retangulo com os atributos comprimento e largura, cada um dos quais assume o valor padrão de 1. Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento e a largura. Os métodos set devem verificar se comprimento e largura são, cada um, números de ponto flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Retangulo.

### [M2S02] Ex 04 - Fatura

Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido nela. Uma fatura deve incluir quatro partes das informações como variáveis de instância — o número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância.

Além disso, forneça um método chamado getValorFatura que calcula o valor da fatura (isto é, multiplica a quantidade pelo preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado TestaFatura que demonstra as capacidades da classe Fatura.

### [M2S02] Ex 05 - Frequência Cardíaca

Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart Association (AHA), a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.

[Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios físicos.]

Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa. Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo, forneça métodos set e get.

A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe FrequenciaCardiaca e imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.

### Ex Extra 01 - Maior Valor

Receber 3 valores de entrada do usuário e retornar o maior deles.

### Ex Extra 02 - Atendimento Automatizado

Uma empresa está implantando um sistema automatizado de atendimento aos clientes e fornecedores, ao estilo WhatsApp. Os setores da empresa são divididos em 3 :
Depto Comercial;
Depto Financeiro;
Depto RH;
Faça um programa que imprima na tela ao usuário suas opções e logo depois imprima qual foi a opção escolhida pelo usuário

### Ex Extra 03 - Calculo Média

Solicite ao usuário 3 notas, de 0.0 a 10.0. Após a terceira nota, calcule a média e apresente o resultado de aprovação ou reprovação. Para aprovação, o aluno deve possuir média superior a 7.0.

### Ex Extra 04 - Calculo Aprovação

Solicite ao usuário 3 notas, de 0.0 a 10.0, e também o número de faltas. Então calcule a média e a frequência do aluno. Informe ao usuário se o aluno está aprovado ou reprovado, considerando que para ser aprovado o aluno precisa ter média superior a 7.0 e frequência superior a 75%. Se qualquer um desses requisitos não for atendido, o aluno está reprovado.

### Ex Extra 05 - Dados de Pessoas

Implemente uma classe chamada Pessoa com os seguintes atributos: nome e idade. Depois instancie três objetos com nomes e idade diferentes.
