# cheapest-_hotel_java
Desafio Hotel mais barato resolvido com Java
<h1>Sobre o dasafio</h1>
Uma rede de hotéis em Miami gostaria de oferecer um serviço de reservas pela internet. A
rede é composta por três hotéis: Lakewood, Bridgewood e Ridgewood. Cada hotel tem taxas
diferenciadas para dia de semana ou final de semana, incluindo taxas específicas para
participantes do programa de fidelidade. Adicionalmente, cada hotel tem uma classificação,
indicando a excelência do serviço.<br><br>
● Lakewood possui uma classificação 3 e suas taxas de dia de semana são R$110 para
clientes normais e R$80 para participantes do programa de fidelidade. As taxas de
final de semana são respectivamente R$90 e R$80 para clientes normais e
participantes do programa de fidelidade.<br><br>
● Bridgewood possui uma classificação 4 e suas taxas de dia de semana são R$160
para clientes normais e R$110 para participantes do programa de fidelidade. As taxas
de final de semana são respectivamente R$60 e R$50 para clientes normais e
participantes do programa de fidelidade.<br><br>
● Ridgewood possui uma classificação 5 e suas taxas de dia de semana são R$220
para clientes normais e R$100 para participantes do programa de fidelidade. As taxas
de final de semana são respectivamente R$150 e R$40 para clientes normais e
participantes do programa de fidelidade.<br><br>
Escreva um programa para encontrar o hotel mais barato. A entrada do programa será uma
sequência de datas para um cliente participante ou não do programa de fidelidade.
Utilize "Regular" para denominar um cliente normal e "Reward" para um cliente participante
do programa de fidelidade. A saída deverá ser o hotel disponível mais barato e em caso de
empate, o hotel com a maior classificação deverá ser retornado.

Formato da entrada:
```
<tipo_do_cliente>: <data1>, <data2>, <data3>, ...
```

Formato da saída:
```
<nome_do_hotel_mais_barato>
```

Exemplos:
```
Entrada 1:
Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
Saída 1:
Lakewood
```
```
Entrada 2:
Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)
Saída 2:
Bridgewood
```
```
Entrada 3:
Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)
Saída 3:
Ridgewood
