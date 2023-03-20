from unittest import case


nota1 = float(input('COLOQUE A NOTA NUM1:'))
nota2 = float(input('COLOQUE A NOTA NUM2:'))
nota3 = float(input('COLOQUE A NOTA NUM3:'))

media = (nota1+nota2+nota3)/3

if  media >= 9:  
     conceito = 'A' 
elif media >= 8.0 and media <= 8.9:
     conceito = 'B'
elif media >= 7 and  media <=7.9: 
     conceito = 'C'
elif media >= 6 and media <=6.9:
     conceito = 'D'
else:
     conceito = 'E' 


match conceito:
    case 'A':
        print('Conceito A: ', conceito, ',Media: ', media)
    case 'B':
        print('Conceito B: ', conceito, ',Media: ', media)
    case 'C':
        print('Conceito C: ', conceito, ',Media: ', media)
    case 'D':
        print('Conceito D: ', conceito, ',Media: ', media)
    case 'E':
        print('Conceito E: ', conceito, ',Media: ', media)
     
    