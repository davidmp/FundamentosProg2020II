def sumaNumerosParesEntre2RangoN():
    a=int(input("Ingrese el Primer Numero:"))
    b=int(input("Ingrese el Segundo Numero:"))
    contadorNumMenor=0
    sumaPares=0
    numMayor=0
    if(a<b):
       contadorNumMenor=a
       numMayor=b
    else:
        contadorNumMenor=b
        numMayor=a
    while(contadorNumMenor<=numMayor):
        if(contadorNumMenor%2==0):
            sumaPares=sumaPares+contadorNumMenor
        contadorNumMenor=contadorNumMenor+1
    print("Resultado suma de numeros pares es:",sumaPares)

sumaNumerosParesEntre2RangoN()