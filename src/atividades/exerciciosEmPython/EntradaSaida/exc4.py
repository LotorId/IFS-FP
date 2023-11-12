#Faça um algoritmo para ler uma temperatura em graus Celsius e transformá-la em farenheit. Utilize a seguinte fórmula:
#F = ((180 * C) / 100) + 32

c = float(input("Entre com a temperatura em Celsius para calculá-la em Farenheit: "))
f = ((180 * c) / 100) + 32

print("A temperatura", c, "ºC em Farenheit é: ", f, "ºF")
