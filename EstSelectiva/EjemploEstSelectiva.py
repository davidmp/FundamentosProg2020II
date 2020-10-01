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

calcularPrecioLapiz()
