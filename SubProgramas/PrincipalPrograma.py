from SubPrograma import SubProgramaFactorial

class Principal():
    obj=SubProgramaFactorial() # objeto Global
    inicio=0 # variable Global

    def rangoFactorialOPC1(self,numFinal):
        #self.inicio=5
        for inicio in range(numFinal+1):
            self.obj.calcularFactorial(inicio)
    
    def rangoFactorial(self,numInicial, numFinal):
        self.inicio=5
        print("Valor Inicio:", numInicial)
        for inicio in range(self.inicio, numFinal+1):
            self.obj.calcularFactorial(inicio)
    



objP=Principal()
objP.rangoFactorial(20, 30)


