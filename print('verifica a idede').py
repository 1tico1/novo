print('verifica a idede')

#idade = 17 #atribuicao do numero 18 a idade
idade = int(input('Digite sua idade:'))

if idade >= 18:
    #Bloco executado quando a condiçao resultar em verdadeiro 
    print('maior de idade')
    print('voce pode ter uma carteira cnh')
else:
#Bloco executado quando a condiçao resultar em falso
    print('menor de idade')
    print('voce ainda nao completou 18 anos')
    print('portanto, nao pode ter uma cnh')

#executa sempre
print('FIM')
