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

calcularPromedioNota()