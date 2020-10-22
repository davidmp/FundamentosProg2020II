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
    print(f"El monto de dinero que tiene al cabo de un anho es: {montoInvertir}")
    print("El monto de dinero que tiene al cabo de un anho es: ", montoInvertir)

calcularInversionFinAnho()
