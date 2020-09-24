def calcularPromedioNota():
  #Datos entrada
  N1=int(input("Ingrese Nota 1:"))
  N2=int(input("Ingrese Nota 2:"))
  N3=int(input("Ingrese Nota 3:"))
  N4=int(input("Ingrese Nota 4:"))
  #Proceso
  PC=(N1+N2+N3+N4)/4
  #Datos de Salida
  print("La calificación de nota promedio es:",PC)

def calcularServicoPintado():
    #Datos de entrada
    cantM2=float(input("Ingrese la cantidad de M2 a pintar:"))
    costM2=float(input("Ingrese el costo de pintado por M2:"))
    #proceso
    montCost=cantM2*costM2
    #Datos de Salida
    print("El monto total a cobrar es:", montCost)

#calcularPromedioNota()
calcularServicoPintado()