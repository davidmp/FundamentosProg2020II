def suma10NumerosWhile():
    #Definiendo variables e inicializando variables
    nContadorCondicion,numero, suma=1,0,0
    #Proceso y datos de entrada
    while nContadorCondicion<=10:
        numero=float(input(f"Ingrese el numero de la posicion  {nContadorCondicion} :"))
        suma=suma+numero
        nContadorCondicion=nContadorCondicion+1
    #Datos de salida
    print(f"La suma de los 10 numeros ingresados es: {suma}")

def suma10NumerosFor():
    #Definiendo variables e inicializando variables
    numero, suma=0,0
    #Proceso y datos de entrada
    for nContadorCondicion in range(1,11):
        numero=float(input(f"Ingrese el numero de la posicion  {nContadorCondicion} :"))
        suma=suma+numero
    #Datos de salida
    print(f"La suma de los 10 numeros ingresados es: {suma}")


def suma10NumerosEmulateDoWhile():
    #Definiendo variables e inicializando variables
    nContadorCondicion,numero, suma=1,0,0
    #Proceso y datos de entrada
    while True:
        numero=float(input(f"Ingrese el numero de la posicion  {nContadorCondicion} :"))
        suma=suma+numero
        nContadorCondicion=nContadorCondicion+1
        if nContadorCondicion>10:
            break
    #Datos de salida
    print(f"La suma de los 10 numeros ingresados es: {suma}")

def numPares0a100():
    #definir varibales e inicializar valores
    totalNumPares=0
    #Proceso y datos de entrada
    for numInit in range(101):
        if numInit%2==0:
            totalNumPares=totalNumPares+1
    print(f"La cantidad de numeros pares entre 0 y 100 es: {totalNumPares}")

def calcularSueldoSemanal():
    #definir varibales e inicializar valores
    costoHora, horasTrabajo, totalHorasTrab, sueldoSemana=17.0,0,0,0.0
    contador=1
    #Proceso y datos de entrada
    while contador<=6:
        horasTrabajo=int(input(f"Ingrese las horas trabajadas en el dia  {contador} :"))
        totalHorasTrab=totalHorasTrab+horasTrabajo
        contador=contador+1
    sueldoSemana=costoHora*totalHorasTrab
    #Datos de salida
    print(f"La cantidad total de horas trabajadas en la semana son: {totalHorasTrab}")
    print(f"El sueldo a pagar segun las horas trabajas a la semana es: {sueldoSemana}")

#suma10NumerosWhile()
#suma10NumerosFor()
#suma10NumerosEmulateDoWhile()
#numPares0a100()
calcularSueldoSemanal()