
n = int(input("Digite um valor para saber se ele é primo (para sair digite -1): "))
n2 = 1
while n != -1:
    x = 0
    for i in range(n2, n+1):
        if (n % i) == 0:
            x = x + 1
            print(i)
    if x == 2:
        print(n, "é primo")
    else:
        print(n, "não é primo")
    n = int(input("Digite um valor para saber se ele é primo (para sair digite -1): "))
