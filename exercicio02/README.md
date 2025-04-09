# Exemplos de Design Patterns: Strategy e Adapter

## 🧠 Padrões de Projeto Utilizados

### 1. Strategy

O padrão **Strategy** permite definir múltiplos comportamentos que podem ser alternados em tempo de execução, sem modificar o código principal.  
Esse padrão proporciona flexibilidade, facilitando a manutenção e extensão do sistema.

#### ✅ Como foi aplicado:
- Utilizado no cálculo de frete.
- Cada tipo de frete (por exemplo, transportadora externa) possui sua própria regra de cálculo.
- A classe `FreteService` seleciona dinamicamente a estratégia de cálculo de acordo com a modalidade informada.

---

### 2. Adapter

O padrão **Adapter** adapta interfaces incompatíveis para que possam trabalhar juntas.  
É útil quando precisamos integrar sistemas diferentes ou classes legadas sem alterar suas implementações originais.

#### ✅ Como foi aplicado:
- A classe `TransportadoraExternaService` atua como adaptador.
- Ela transforma a lógica de uma transportadora externa (`TransportadoraService`) para ser compatível com a interface `FreteRepository`, já utilizada no projeto.

---

## 🚀 Como utilizar a API

### 1. Calcular frete por modalidade
```http
GET /fretes?modalidade={modalidade}&peso={peso}
```
### 2. Calcular frete via transportadora externa
```
GET /fretes/transportadoraExterna?peso={peso}
```
