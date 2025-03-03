# 📌 Cálculos Matemáticos em Java

Este repositório contém diversos programas em Java que resolvem problemas matemáticos e físicos, como cálculo de áreas, perímetros, distâncias, médias, entre outros.

## 🚀 Tecnologias Utilizadas

- Java (JDK 8+)
- Scanner para entrada de dados do usuário
- Estruturas de controle (loops, condicionais)
- Métodos para modularização do código
- Formatação de saída (`String.format`)

## 📌 Confira meu artigo no DEV.to

Para aprender mais sobre Java e ver exemplos de exercícios, confira meu artigo no [DEV.to](https://dev.to/vitorpaiola/1-escreva-um-programa-que-calcule-a-area-de-um-circulo-a-partir-do-raio-utilizando-a-formula-a--4g8)! 🚀

## 📂 Estrutura do Projeto

📦 Calculos-Matematicos-Java  
├── 📁 src  
│   ├── 📁 aritmetica  
│   │   ├── 📁 areaCirculo  
│   │   │   ├── AreaCirculo.java  
│   │   ├── 📁 aritmetica  
│   │   │   ├── Aritmetica.java  
│   │   ├── 📁 calculadoraDelta  
│   │   │   ├── CalculadoraDelta.java  
│   │   ├── 📁 calculadoraDistanciaPontos  
│   │   │   ├── CalculadoraDistanciaPontos.java  
│   │   ├── 📁 calculadoraEnergiaCinetica  
│   │   │   ├── CalculadoraEnergiaCinetica.java  
│   │   ├── 📁 calculadoraIMC  
│   │   │   ├── CalculadoraIMC.java  
│   │   ├── 📁 calculadoraPerimetroCirculo  
│   │   │   ├── CalculadoraPerimetroCirculo.java  
│   │   ├── 📁 calculadoraRetangulo  
│   │   │   ├── CalculadoraRetangulo.java  
│   │   ├── 📁 calculadoraTrabalho  
│   │   │   ├── CalculadoraTrabalho.java  
│   │   ├── 📁 calculadoraTriangulo  
│   │   │   ├── CalculadoraTriangulo.java  
│   │   ├── 📁 calculadoraVelocidadeMedia  
│   │   │   ├── CalculadoraVelocidadeMedia.java  
│   │   ├── 📁 mediaAritmetica  
│   │   │   ├── MediaAritmetica.java  
│   │   ├── 📁 mediaAritmeticaNotas  
│   │   │   ├── MediaAritmeticaNotas.java  
│   │   ├── 📁 mediaGeometrica  
│   │   │   ├── MediaGeometrica.java  
└── README.md

## 🛠️ Como Compilar e Executar

Para compilar e executar qualquer um dos programas, siga os passos abaixo:

### 1️⃣ **Compilar**
Abra o terminal e navegue até a pasta `src` do projeto. Em seguida, execute:

```sh
javac -d . NomeDaPasta/NomeDoArquivo.java
```

Por exemplo, para compilar o programa de área do círculo:

```sh
javac -d . aritmetica/areaCirculo/AreaCirculo.java
```

### 2️⃣ **Executar**
Após a compilação, execute o programa com:

```sh
java NomeDaPasta.NomeDoArquivo
```

Exemplo:

```sh
java aritmetica.areaCirculo.AreaCirculo
```

## 📌 Descrição dos Programas

### 🔵 **AreaCirculo**

Calcula a área de um círculo a partir do raio fornecido pelo usuário.

📌 **Fórmula:**
```java
area = Math.PI * raio * raio;
```

### ➗ **Aritmetica**

Realiza operações aritméticas simples entre dois números, como soma, subtração, multiplicação e divisão.

### 🔺 **CalculadoraDelta**

Calcula o discriminante (Δ) de uma equação quadrática, dado os coeficientes a, b e c.

📌 **Fórmula:**
```java
delta = b * b - 4 * a * c;
```

### 📏 **CalculadoraDistanciaPontos**

Calcula a distância entre dois pontos no plano cartesiano, dados as coordenadas dos pontos (x1, y1) e (x2, y2).

📌 **Fórmula:**
```java
distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
```

### ⚡ **CalculadoraEnergiaCinetica**

Calcula a energia cinética de um objeto, dada sua massa e velocidade.

📌 **Fórmula:**
```java
energiaCinetica = 0.5 * massa * velocidade * velocidade;
```

### ⚖️ **CalculadoraIMC**

Calcula o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos.

📌 **Fórmula:**
```java
imc = peso / (altura * altura);
```

### 🔵 **CalculadoraPerimetroCirculo**

Calcula o perímetro de um círculo com base no raio.

📌 **Fórmula:**
```java
perimetro = 2 * Math.PI * raio;
```

### 🔲 **CalculadoraRetangulo**

Calcula a área e o perímetro de um retângulo, dada a altura e a largura.

📌 **Fórmulas:**
#### Área:
```java
area = largura * altura;
```

#### Perímetro:
```java
perimetro = 2 * (largura + altura);
```

### ⚙️ **CalculadoraTrabalho**

Calcula o trabalho realizado por uma força sobre um objeto, dada a força e a distância percorrida.

📌 **Fórmula:**
```java
trabalho = força * distância;
```

### 🔺 **CalculadoraTriangulo**

Calcula a área e o perímetro de um triângulo, dado o comprimento dos lados.

📌 **Fórmulas:**
#### Área (fórmula de Herão):
```java
semiperimetro = (a + b + c) / 2;
area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));
```

#### Perímetro:
```java
perimetro = a + b + c;
```

### 🏃‍♂️ **CalculadoraVelocidadeMedia**

Calcula a velocidade média de um objeto, dada a distância percorrida e o tempo gasto.

📌 **Fórmula:**
```java
velocidadeMedia = distancia / tempo;
```

### ➗ **MediaAritmetica**

Calcula a média aritmética de dois números fornecidos pelo usuário.

📌 **Fórmula:**
```java
media = (n1 + n2) / 2;
```

### 🎓 **MediaAritmeticaNotas**

Calcula a média aritmética de três notas fornecidas pelo usuário.

📌 **Fórmula:**
```java
media = (nota1 + nota2 + nota3) / 3;
```

### 📉 **MediaGeometrica**

Calcula a média geométrica de três números fornecidos pelo usuário.

📌 **Fórmula:**
```java
media = (nota1 * nota2 * nota3) ^ (1/3);
```

## 📌 Quer acompanhar mais dicas e novidades sobre Java?

🔔 Fique por dentro de tudo sobre Java! Me siga no [Twitter](https://x.com/v__souz) para receber dicas, novidades e atualizações! 🚀✨

---

### 📜 **Licença**

Este projeto foi desenvolvido por mim e está livre para uso e modificação sem restrições formais. Fique à vontade para usar e adaptar o código conforme necessário.

### 🤝 **Contribuições**

Contribuições são sempre bem-vindas! Se você tem sugestões ou gostaria de adicionar novos cálculos ou funcionalidades, sinta-se à vontade para abrir um Pull Request. Estou ansioso para ver suas melhorias! 😃

