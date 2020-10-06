def calcularCostoPolizaDMP():
    #Datos de entrada
    tipoPlanP=str(input("Ingrese el Plan que desea el cliente:"))
    alcohol=int(input("El cleinte consume alcohol?:"))
    lentes=int(input("Usa lentes?:"))
    enfermedad=int(input("Tiene alguna enfermedad?:"))
    edad=int(input("Que edad tiene?:"))
    #proceso
    

    if tipoPlanP=="A":
        costobase=1200
    else:
        costobase=950
    if alcohol==1:
        costobase=costobase+(costobase*0.10)
    if lentes==1:
        costobase=costobase+(costobase*0.05)
    if enfermedad==1:
        costobase=costobase+(costobase*0.05)
    print("VER:", enfermedad)
    if edad>40:
        costobase=costobase+(costobase*0.20)
    else:
        costobase=costobase+(costobase*0.10)                 
    #Datos de salidad
    print("Es costo de la poliza es:", costobase)

calcularCostoPolizaDMP()