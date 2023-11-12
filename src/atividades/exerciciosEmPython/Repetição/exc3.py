
n1 = int(input("Entre com o primeiro termo do intervalo: "))
n2 = int(input("Entre com o segundo termo do intervalo: "))
if n1 > n2:
    for i in range(n2, n1):
        if i % 2 != 0:
            print(i)
else:
    for i in range(n1, n2):
        if i % 2 != 0:
            print(i)
