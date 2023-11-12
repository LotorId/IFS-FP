#Faça um programa que leia um valor representando o gasto realizado por um
#cliente do restaurante COMABEM, bem como a percentual de serviço. Ao final, o
#programa devera imprimir o valor total a ser pago, incluindo o percentual do
#garçom.

gasto = float(input("Entre com o valor gasto no Restaurante COMABEM: "))
percentual = float(input("Entre com o percentual do serviço: "))

valor = ((percentual / 100) * gasto) + gasto

print("O valor a ser pago é: ", valor)
