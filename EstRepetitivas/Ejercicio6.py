import random


def calcularInversionFinAnho():
    interes=0.02
    contadorMes=0
    interesMes=0
    #Datos de entrada
    montoInvertir=float(input("Ingrese el monto a invertir:"))
    #Proceso
    while(contadorMes<12):
        interesMes=montoInvertir*interes
        montoInvertir=montoInvertir+interesMes
        contadorMes=contadorMes+1
    #Datos de salida
    print(f"El monto de dinero que tiene al cabo de un anho es: {montoInvertir}")
    print("El monto de dinero que tiene al cabo de un anho es: ", montoInvertir)

def cantidadNumCeroMenorCeroMayorCero():
    #Definir Variables
    cero, menorCero, mayorCero=0,0,0
    #Datos de entrada
    nCantidad=int(input("Ingrese la cantidad de numeros a evaluar:"))
    #proceso
    for initNcant in range(1,nCantidad+1):
        numero=random.randrange(-100, 100)
        print(f"posicion {initNcant}: {numero}")
        if numero==0:
            cero=cero+1
        elif numero>0:
            mayorCero=mayorCero+1
        else:
            menorCero=menorCero+1
    #datos de salida
    print(f"La cantidad de numeros ceros es: {cero}")
    print(f"La cantidad de numeros mayores de cero es: {mayorCero}")
    print(f"La cantidad de numeros menores a cero: {menorCero}")

#calcularInversionFinAnho()
cantidadNumCeroMenorCeroMayorCero()
