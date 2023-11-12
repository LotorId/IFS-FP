#Faça um algoritmo para ler o horário de entrada e saída de um cliente na fila de um banco e
#seguida calcular o tempo de permanência do cliente na fila. Cada horário será lido em duas
#variáveis inteiras representando a hora e os minutos. A resposta deve ser dada em horas (ex. 3:10).

hi = int(input("Entre com a hora de chegada: "))
mi = int(input("Entre com o minuto de chegada: "))
print("---------------------------------------")
hf = int(input("Entre com a hora de saida: "))
mf = int(input("Entre com o minuto de saida: "))

tempo = (hf * 60 + mf) - (hi * 60 + mi)
hp = tempo // 60
mp = tempo % 60

print("O tempo de permanencia no local foi de ", hp, ":", mp)
