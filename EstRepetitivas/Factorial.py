def calcularFactorial(numero):    
    contador=1
    if numero==0:
        resultado=1
    else:
        resultado=numero
    while contador<numero:        
        resultado=resultado*contador
        contador=contador+1
    print(f"El factorial de {numero} es {resultado}" )

def rangoFactorial(numFinal):
    for inicio in range(numFinal+1):
        calcularFactorial(inicio)

numero=int(input("Ingrese el numero para calcular el factorial:"))
#calcularFactorial(numero)
rangoFactorial(numero)