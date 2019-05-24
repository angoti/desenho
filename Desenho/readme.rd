Exercício 1 da prova
Na solução eu movimentei todos os métodos, exceto o método main, da classe Sistema para outra classe que chamei de tela.
Fiz isso para isolar o main em outra classe que é o cliente da classe Tela. Não é necessário fazer esta alteração, 
fiz apenas para explicitar que o sistema é cliente da classe responsável por desenhar as formas geométricas.
O mais importante foi a modificação do método (public void desenhaTodasFormas(Graphics g)) que continha condicional,
 que foi trocado por polimorfismo, permitindo assim que o princípio solid OCP seja respeitado, ou seja,
 quando o sistema for estendido com novas formas geométricas, não será necessário alterar esta classe. Os métodos responsáveis
 por desenhar as formas geométricas foram movidos da classe Sistema para as classes correspondentes, e a interface FormaGeométrica foi modificada com 
 a exclusão do método String getTipoDaForma() e a adição do método void desenha(Graphics g); 