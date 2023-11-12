
a = -1
b = 1
c = 1
while c < 5000:
    c = a + b
    a = b
    b = c
    if c < 5000:
        print(c)
