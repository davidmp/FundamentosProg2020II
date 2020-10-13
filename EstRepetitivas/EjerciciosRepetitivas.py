def suma10Numeros():
    #Definiendo variables e inicializando variables
    nContadorCondicion,numero, suma=1,0,0
    #Proceso y datos de entrada
    while nContadorCondicion<=10:
        numero=float(input(f"Ingrese el numero de la posicion  {nContadorCondicion} :"))
        suma=suma+numero
        nContadorCondicion=nContadorCondicion+1
    #Datos de salida
    print(f"La suma de los 10 numeros ingresados es: {suma}")
suma10Numeros()