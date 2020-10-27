class SubProgramaFactorial():    
    def calcularFactorial(self, numero):    
        contador=1
        if numero==0:
            resultado=1
        else:
            resultado=numero
        while contador<numero:        
            resultado=resultado*contador
            contador=contador+1
        print(f"El factorial de {numero} es {resultado}" )



#obj=SubProgramaFactorial()
#obj.rangoFactorial(1000)
