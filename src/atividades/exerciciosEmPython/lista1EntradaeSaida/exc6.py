# Faça um programa que leia as três notas de um aluno e calcule a média final deste
# aluno. Considerar que a média é ponderada (a média ponderada é calculada
# através do somatório das multiplicações entre valores e pesos divididos pelo
# somatório dos pesos) e que o peso das notas é: 2, 3 e 5, respectivamente.
# Exemplo: Digamos que um aluno obteve as notas 7.5, 6.0 e 8.0, respectivamente.

n1 = float(input("Entre com a primeira nota: "))
n2 = float(input("Entre com a segunda nota: "))
n3 = float(input("Entre com a terceira nota: "))

m = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10

print("A media ponderada das notas é: ", m)
