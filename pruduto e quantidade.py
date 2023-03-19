
valor = (float(input('Informe o valor: ')))
quantidade = int(input('quantidade: '))

total = valor * quantidade 

if total <100:
    total = total
    print('Total: ', total)

elif total >= 100<199:
    total = total * 0.9
    print('total com 10%: ', total)

elif total >= 200<299:
    total = total * 0,8
    print('total com 20%: ', total)

elif total >= 300<399:
    total = total * 0,7
    print('Total com 30%: ', total)

elif total >= 400:
    total = total * 0,6
    print('Total com 40%: ', total)







