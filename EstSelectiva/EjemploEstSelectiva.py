def calcularPrecioLapiz():
  #Datos Entrada
  cantidadL=int(input("Ingresa la cantidad de lapices a comprar:"))
  #Proceso
  if(cantidadL>=1000):
    costoPagar=cantidadL*0.85
  else:
    costoPagar=cantidadL*0.9
  #Datos de salida
  print("El costo total a pagar es: ", costoPagar)

def identificarNumeroMayor():
    #datos entrada
    num1=int(input("Ingrese el Primer valor numerico:"))
    num2=int(input("Ingrese el Segundo valor numerico:"))
    num3=int(input("Ingrese el Tercer valor numerico:"))
    #proceso
    if(num1>num2 and num1>num3):
        numMayor=num1
    elif num2>num1 and num2>num3:
        numMayor=num2
    else:
        numMayor=num3
    #Datos de Salida
    print("El numero mayor es:", numMayor)

#calcularPrecioLapiz()
identificarNumeroMayor()
