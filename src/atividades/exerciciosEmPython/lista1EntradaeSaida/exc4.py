#Uma loja de animais precisa de um programa para calcular os custos de criação de
#coelhos. O custo é calculado com a fórmula: C = Q * 0,70 / 18+10, onde C é o custo e Q é a
#quantidade de coelhos. Construa um programa que calcule e mostre o custo para
#criar a quantidade de coelhos que foi informada.

q = int(input("Insira a quantidade de coelhos para saber o custo de criação: "))
c = (q * 0.70) / (18+10)

print("O custo para a criação de", q, "coelhos é de : R$", c)
